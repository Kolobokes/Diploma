package data;



import lombok.SneakyThrows;

import java.sql.*;

public class BaseConnection {
    public static String NAME_USER = System.getProperty("property.NAME_USER");
    public static String PASSWORD = System.getProperty("property.PASSWORD");
    public static String URL = System.getProperty("property.URL");
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            connection = DriverManager.getConnection(URL, NAME_USER, PASSWORD);
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @SneakyThrows
    static ResultSet statusCreditRequestEntity() {

        ResultSet status = statement.executeQuery("SELECT status FROM credit_request_entity ORDER BY created DESC LIMIT 1");

        return status;
    }

    @SneakyThrows
    static ResultSet statusPaymentEntity() {

        ResultSet status = statement.executeQuery("SELECT status FROM payment_entity ORDER BY created DESC LIMIT 1");

        return status;
    }
}




