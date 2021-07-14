package test;


import data.DataHelper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.BuyInCreditPage;
import page.BuyPage;
import page.StartPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AqaShopTest {

    @SneakyThrows
    @Test
    void correctBuyTourTest() {

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        buyPage.notificationOk();

        String expectedStatusTransaction = "APPROVED";
        String statusTransaction = DataHelper.informationOfStatusPayment();

        assertEquals(expectedStatusTransaction, statusTransaction);
    }

    @SneakyThrows
    @Test
    void inCorrectBuyTourTest() {

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.inCorrectCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        buyPage.notificationError();

        String expectedStatusTransaction = "DECLINED";
        String statusTransaction = DataHelper.informationOfStatusPayment();

        assertEquals(expectedStatusTransaction, statusTransaction);
    }

    @Test
    void emptyMonthBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), "", DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void inCorrectMonthBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(),  DataHelper.InCorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyYearBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), "", DataHelper.cardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyCardHolderBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), "", DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void inCorrectCardHolderBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.inCorrectCardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyCvvBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), "");
        buyPage.emptyField();
    }

    @Test
    void inCorrectCvvBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.inCorrectCVV());
        buyPage.emptyField();
    }

    @SneakyThrows
    @Test
    void correctBuyInCreditTourTest() {

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        buyInCreditPage.notificationOk();

        String expectedStatusTransaction = "APPROVED";
        String statusTransaction = DataHelper.informationOfStatusCredit();

        assertEquals(expectedStatusTransaction, statusTransaction);
    }

    @SneakyThrows
    @Test
    void inCorrectBuyInCreditTourTest() {

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.inCorrectCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        buyInCreditPage.notificationError();

        String expectedStatusTransaction = "DECLINED";
        String statusTransaction = DataHelper.informationOfStatusCredit();

        assertEquals(expectedStatusTransaction, statusTransaction);
    }

    @Test
    void emptyMonthBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), "", DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void inCorrectMonthBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(),  DataHelper.InCorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyYearBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), "", DataHelper.cardHolder(), DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyCardHolderBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), "", DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void inCorrectCardHolderBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.inCorrectCardHolder(), DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyCVVBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), "");
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyInCorrectCVVBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.CorrectMonth(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.inCorrectCVV());
        buyInCreditPage.emptyField();
    }
}
