package ir.farzadafi.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GogoliORM {

    private final TableSchema tableSchema = new TableSchema();

    public void init() {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres")) {
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
}
