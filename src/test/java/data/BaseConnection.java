package data;

import org.jsoup.select.Evaluator;

import java.sql.*;

import static java.lang.Class.forName;

public class BaseConnection {
    public static String NAME_USER = "app";
    public static String PASSWORD = "pass";
    public static String URL = "jdbc:mysql://localhost:3306/app";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL, NAME_USER, PASSWORD);
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ResultSet countPaymentEntity() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");
        ResultSet count = statement.executeQuery("SELECT count(*) AS total FROM payment_entity");

        return count;
    }

    public ResultSet countCreditRequestEntity() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");
        ResultSet count = statement.executeQuery("SELECT count(*) AS total FROM credit_request_entity");

        return count;
    }
}




