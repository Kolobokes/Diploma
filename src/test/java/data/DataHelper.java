package data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataHelper {

    public static String correctCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String inCorrectCardNumber() {
        return "4444 4444 4444 4442";
    }

    public static String month() {
        return "08";
    }

    public static String year() {
        return "22";
    }

    public static String cardHolder() {
        return "Ivanov Ivan";
    }

    public static String correctCVV() {
        return "999";
    }

    public static String inCorrectCVV() {
        return "20";
    }

    public static int informationOfPayAddedToTheDatabase() throws ClassNotFoundException, SQLException {

        BaseConnection baseConnection = new BaseConnection();
        ResultSet count = baseConnection.countPaymentEntity();
        count.next();
        int result = count.getInt("total");

        return result;
    }

    public static int informationOfCreditRequestToTheDatabase() throws ClassNotFoundException, SQLException {

        BaseConnection baseConnection = new BaseConnection();
        ResultSet count = baseConnection.countCreditRequestEntity();
        count.next();
        int result = count.getInt("total");

        return result;
    }
}
