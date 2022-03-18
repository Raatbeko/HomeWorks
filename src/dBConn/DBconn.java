package dBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
    private static final String URL = "jdbc:postgresql://localhost:5432/Demo2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "radik";

    public static Connection connection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Well done");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());

//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        }
            return connection;
    }
}
