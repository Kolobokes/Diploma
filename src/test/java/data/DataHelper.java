package data;

import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataHelper {

    public static String correctCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String inCorrectCardNumber() {
        return "4444 4444 4444 4442";
    }

    public static String CorrectMonth() {
        return "08";
    }

    public static String InCorrectMonth() {
        return "00";
    }

    public static String year() {
        return "22";
    }

    public static String cardHolder() {
        return "Invaov Ivan";
    }

    public static String inCorrectCardHolder() {
        return "999*";
    }

    public static String correctCVV() {
        return "999";
    }

    public static String inCorrectCVV() {
        return "20";
    }

    @SneakyThrows
    public static String informationOfStatusPayment() {

        ResultSet count = BaseConnection.statusPaymentEntity();
        count.next();
        String result = count.getString("status");

        return result;
    }

    @SneakyThrows
    public static String informationOfStatusCredit() {

        ResultSet count = BaseConnection.statusCreditRequestEntity();
        count.next();
        String result = count.getString("status");

        return result;
    }
}
