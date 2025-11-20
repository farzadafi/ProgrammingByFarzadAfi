package ir.farzadafi.orm;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GogoliORM {
    private final TableSchema tableSchema = new TableSchema();
    private final InsertStatement insertStatement = new InsertStatement();

    public void init(Connection connection) {
        try (connection) {
            Class<?>[] entity = EntityRegistry.ENTITY;
            String tableQuery;
            for (int i = 0; i < entity.length; i++) {
                tableQuery = tableSchema.createTableQuery(entity[i]);
                try (PreparedStatement preparedStatement = connection.prepareStatement(tableQuery)) {
                    preparedStatement.execute();
                }
            }
        } catch (SQLException e) {
            System.out.println("error");
        }
    }

    public int save(Connection connection, Object entity) throws SQLException, IllegalAccessException {
        String sql = insertStatement.insertStatementCreator(entity);
        Field[] declaredFields = entity.getClass().getDeclaredFields();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            Object o = field.get(entity);
            preparedStatement.setObject(i + 1, o);
        }
        return preparedStatement.executeUpdate();
    }
}
