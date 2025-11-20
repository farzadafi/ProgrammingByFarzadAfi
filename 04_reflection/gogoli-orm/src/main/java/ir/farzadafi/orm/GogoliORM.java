package ir.farzadafi.orm;

import ir.farzadafi.model.Car;
import ir.farzadafi.model.Person;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GogoliORM {

    public void init() {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres")) {
            Class<?>[] entity = EntityRegistry.ENTITY;
            String tableQuery;
            for (int i = 0; i < entity.length; i++) {
                tableQuery = createTableQuery(entity[i]);
                try (PreparedStatement preparedStatement = connection.prepareStatement(tableQuery)) {
                    preparedStatement.execute();
                }
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
    }

    private String createTableQuery(Class<?> clazz) {
        Class<?>[] interfaces = clazz.getInterfaces();
        boolean isImplementGogoliOrm = false;
        for (int i = 0; i < interfaces.length; i++) {
            if (interfaces[i].getTypeName().equals(GogoliOrm.class.getTypeName())) {
                isImplementGogoliOrm = true;
                break;
            }
        }
        if (!isImplementGogoliOrm)
            throw new RuntimeException("ivalid");
        Field[] declaredFields = clazz.getDeclaredFields();
        String columns = createColumns(declaredFields);
        String tableName = clazz.getSimpleName().toLowerCase();
        System.out.println("query create for :" + tableName);
        return createQuery(tableName, columns);
    }

    private static String createQuery(String tableName, String columns) {
        return "CREATE TABLE IF NOT EXISTS " + tableName + "(\n" + columns + "\n);";
    }

    private String createColumns(Field[] declaredFields) {
        StringBuilder columns = new StringBuilder();
        for (int i = 0; i < declaredFields.length; i++) {
            String column = createColumn(declaredFields[i]);
            columns.append(column);
        }
        columns.setLength(columns.length() - 2);
        return columns.toString();
    }

    private String createColumn(Field declaredFields) {
        StringBuilder column = new StringBuilder();
        String name = declaredFields.getName();
        String snakeCaseName = convertCamelCaseToSnakeCase(name);
        Class<?> javaType = declaredFields.getType();
        String postgresType = getPostgresType(javaType);
        column.append(snakeCaseName)
                .append(" ")
                .append(postgresType)
                .append(",\n");
        return column.toString();
    }

    private String getPostgresType(Class<?> clazz) {
        if (String.class == clazz)
            return "VARCHAR(255)";
        else if (int.class == clazz || Integer.class == clazz)
            return "INT";
        else if (boolean.class == clazz || Boolean.class == clazz)
            return "BOOLEAN";
        return null;
    }

    private String convertCamelCaseToSnakeCase(String columnName) {
        StringBuilder column = new StringBuilder();
        for (int i = 0; i < columnName.length(); i++) {
            char c = columnName.charAt(i);
            if (Character.isLowerCase(c))
                column.append(c);
            else
                column.append("_")
                        .append(Character.toLowerCase(c));
        }
        return column.toString();
    }
}
