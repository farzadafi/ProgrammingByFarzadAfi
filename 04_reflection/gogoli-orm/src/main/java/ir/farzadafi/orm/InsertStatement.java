package ir.farzadafi.orm;

import java.lang.reflect.Field;

public class InsertStatement {
    public String insertStatementCreator(Object entity) {
        Class<?> clazz = entity.getClass();
        final Field[] declaredFields = clazz.getDeclaredFields();
        String columns = createColumns(declaredFields);
        String tableName = clazz.getSimpleName().toLowerCase();
        String placeHolder = createPlaceHolder(declaredFields.length);
        return getQuery(tableName, columns, placeHolder);
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
