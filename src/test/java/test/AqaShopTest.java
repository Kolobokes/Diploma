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

        int numberOfPurchasesBeforeNewTransaction = DataHelper.informationOfPayAddedToTheDatabase();
        int numberOfPurchasesExpected = numberOfPurchasesBeforeNewTransaction +1;

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        int numberOfPurchasesAfterNewTransaction = DataHelper.informationOfPayAddedToTheDatabase();

        buyPage.notificationOk();

        assertEquals(numberOfPurchasesExpected, numberOfPurchasesAfterNewTransaction);
    }

    @SneakyThrows
    @Test
    void inCorrectBuyTourTest() {

        int numberOfPurchasesExpected = DataHelper.informationOfPayAddedToTheDatabase();

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.inCorrectCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        int numberOfPurchasesAfterNewTransaction = DataHelper.informationOfPayAddedToTheDatabase();

        buyPage.notificationError();

        assertEquals(numberOfPurchasesExpected, numberOfPurchasesAfterNewTransaction);
    }

    @Test
    void emptyMonthBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), "", DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyYearBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), "", DataHelper.cardHolder(), DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyCardHolderBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), "", DataHelper.correctCVV());
        buyPage.emptyField();
    }

    @Test
    void emptyCvvBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), "");
        buyPage.emptyField();
    }

    @Test
    void inCorrectCvvBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.inCorrectCVV());
        buyPage.emptyField();
    }

    @SneakyThrows
    @Test
    void correctBuyInCreditTourTest() {

        int numberOfPurchasesBeforeNewTransaction = DataHelper.informationOfCreditRequestToTheDatabase();
        int numberOfPurchasesExpected = numberOfPurchasesBeforeNewTransaction +1;

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        int numberOfPurchasesAfterNewTransaction = DataHelper.informationOfCreditRequestToTheDatabase();

        buyInCreditPage.notificationOk();

        assertEquals(numberOfPurchasesExpected, numberOfPurchasesAfterNewTransaction);
    }

    @SneakyThrows
    @Test
    void inCorrectBuyInCreditTourTest() {

        int numberOfPurchasesExpected = DataHelper.informationOfCreditRequestToTheDatabase();

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.inCorrectCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());

        int numberOfPurchasesAfterNewTransaction = DataHelper.informationOfCreditRequestToTheDatabase();

        buyInCreditPage.notificationError();

        assertEquals(numberOfPurchasesExpected, numberOfPurchasesAfterNewTransaction);
    }

    @Test
    void emptyMonthBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), "", DataHelper.year(), DataHelper.cardHolder(), DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyYearBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), "", DataHelper.cardHolder(), DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyCardHolderBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), "", DataHelper.correctCVV());
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyCVVBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), "");
        buyInCreditPage.emptyField();
    }

    @Test
    void emptyInCorrectCVVBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.inCorrectCVV());
        buyInCreditPage.emptyField();
    }
}
