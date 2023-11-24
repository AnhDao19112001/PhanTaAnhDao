package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/word";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "anhdao1911";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
