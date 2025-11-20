package ir.farzadafi.orm;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStatement {

    public void insertStatementCreator(Object entity) throws SQLException, IllegalAccessException {
        Class<?> clazz = entity.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        String columns = createColumns(declaredFields);
        String tableName = clazz.getSimpleName().toLowerCase();
        String placeHolder = createPlaceHolder(declaredFields.length);
        String sql = getQuery(tableName, columns, placeHolder);

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres");

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            Object o = field.get(entity);
            preparedStatement.setObject(i + 1, o);
        }
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
    }

    private static String getQuery(String tableName, String columns, String placeHolder) {
        return "INSERT INTO " + tableName + "(" + columns + ") VALUES " + "(" + placeHolder + ");";
    }

    private String createColumns(Field[] fields) {
        StringBuilder columns = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            String columnName = fields[i].getName();
            String snakeCaseName = OrmUtil.convertCamelCaseToSnakeCase(columnName);
            columns.append(snakeCaseName)
                    .append(", ");
        }
        columns.setLength(columns.length() - 2);
        return columns.toString();
    }

    private String createPlaceHolder(int number) {
        StringBuilder placeHolder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            placeHolder.append("?, ");
        }
        placeHolder.setLength(placeHolder.length() - 2);
        return placeHolder.toString();
    }
}
