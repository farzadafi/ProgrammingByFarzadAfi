import java.sql.*;

public class ProgrammingByFarzadAfiB {
    public static void main(String[] args) throws SQLException {
        Connection connection =
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        String table = "CREATE TABLE IF NOT EXISTS users(id SERIAL PRIMARY KEY, firstname VARCHAR," +
                "lastname VARCHAR, username VARCHAR, password VARCHAR)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(table);

//        DatabaseMetaData dbmd = connection.getMetaData();
//        boolean isSupported = dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE);
//        System.out.println(isSupported);

//        for (int i = 0; i < 1_000_000; i++) {
//            String insert = "INSERT INTO users(firstname, lastname, username, password) VALUES(" +
//                    "'farzad1', 'afshar1', 'farzadafi1', '11111')";
//            statement.executeUpdate(insert);
//        }

        String queryString = "SELECT * FROM users";
        PreparedStatement preparedStatement = connection.prepareStatement(queryString,
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        preparedStatement.setFetchSize(400000);
        ResultSet resultSet = preparedStatement.executeQuery();
        int count = 0;
        while (resultSet.next())
            ++count;
        System.out.println(count);

//        resultSet.next();
//        resultSet.next();
//        System.out.println(resultSet.getString(2));
//        resultSet.previous();
//        System.out.println();
//        System.out.println(resultSet.getString(2));
//
//        resultSet.first();
//        System.out.println(resultSet.getString(2));
//
//        System.out.println();
//        resultSet.last();
//        System.out.println(resultSet.getString(2));






//        System.out.println(resultSet.next());
//        System.out.println(resultSet.next());
//        System.out.println(resultSet.getString(2));
//        System.out.println(resultSet.next());
//        System.out.println(resultSet.next());
//        System.out.println(resultSet.next());
//        System.out.println(resultSet.next());


        //metadata
//        ResultSetMetaData metaData = resultSet.getMetaData();
//        System.out.println(metaData.getColumnCount());
//        System.out.println(metaData.getColumnName(2));
//        System.out.println(metaData.getTableName(2));
//        System.out.println(metaData.getColumnType(1));
//        System.out.println(metaData.isAutoIncrement(2));

        //resultSet
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("username"));
//            System.out.println(resultSet.getString("firstname"));
//            System.out.println(resultSet.getString("password"));
//            System.out.println(resultSet.getInt(1));
//            System.out.println(resultSet.getString(2));
//            System.out.println(resultSet.getString(3));
//            System.out.println(resultSet.getString(4));
//            System.out.println(resultSet.getString(5));
//            System.out.println(resultSet.getString(1));
//            System.out.println(resultSet.getInt(2));
//        }
    }
}