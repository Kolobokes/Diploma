package test;

import data.BaseConnection;
import data.DataHelper;
import org.junit.jupiter.api.Test;
import page.BuyInCreditPage;
import page.BuyPage;
import page.StartPage;

import java.sql.*;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AqaShopTest {

    @Test
    void CorrectBuyTourTest() throws ClassNotFoundException, SQLException{

        int NumberOfPurchasesBeforeNewTransaction = DataHelper.InformationOfPayAddedToTheDatabase();
        int NumberOfPurchasesExpected = NumberOfPurchasesBeforeNewTransaction +1;

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.CorrectCVV());

        int NumberOfPurchasesAfterNewTransaction = DataHelper.InformationOfPayAddedToTheDatabase();

        buyPage.notificationOk().shouldBe(visible);

        assertEquals(NumberOfPurchasesExpected, NumberOfPurchasesAfterNewTransaction);
    }

    @Test
    void InCorrectBuyTourTest() throws ClassNotFoundException, SQLException{

        int NumberOfPurchasesExpected = DataHelper.InformationOfPayAddedToTheDatabase();

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.inCorrectCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.CorrectCVV());

        int NumberOfPurchasesAfterNewTransaction = DataHelper.InformationOfPayAddedToTheDatabase();

        buyPage.notificationError().shouldBe(visible);

        assertEquals(NumberOfPurchasesExpected, NumberOfPurchasesAfterNewTransaction);
    }

    @Test
    void EmptyMonthBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), "", DataHelper.year(), DataHelper.cardHolder(), DataHelper.CorrectCVV());
        buyPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyYearBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), "", DataHelper.cardHolder(), DataHelper.CorrectCVV());
        buyPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyCardHolderBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), "", DataHelper.CorrectCVV());
        buyPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyCvvBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), "");
        buyPage.emptyField().shouldBe(visible);
    }

    @Test
    void InCorrectCvvBuyTourTest(){

        open("http://localhost:8080");
        BuyPage buyPage = new StartPage().buyPage();
        buyPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.InCorrectCVV());
        buyPage.emptyField().shouldBe(visible);
    }

    @Test
    void CorrectBuyInCreditTourTest() throws ClassNotFoundException, SQLException{

        int NumberOfPurchasesBeforeNewTransaction = DataHelper.InformationOfCreditRequestToTheDatabase();
        int NumberOfPurchasesExpected = NumberOfPurchasesBeforeNewTransaction +1;

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.CorrectCVV());

        int NumberOfPurchasesAfterNewTransaction = DataHelper.InformationOfCreditRequestToTheDatabase();

        buyInCreditPage.notificationOk().shouldBe(visible);

        assertEquals(NumberOfPurchasesExpected, NumberOfPurchasesAfterNewTransaction);
    }

    @Test
    void InCorrectBuyInCreditTourTest() throws ClassNotFoundException, SQLException{

        int NumberOfPurchasesExpected = DataHelper.InformationOfCreditRequestToTheDatabase();

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.inCorrectCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.CorrectCVV());

        int NumberOfPurchasesAfterNewTransaction = DataHelper.InformationOfCreditRequestToTheDatabase();

        buyInCreditPage.notificationError().shouldBe(visible);

        assertEquals(NumberOfPurchasesExpected, NumberOfPurchasesAfterNewTransaction);
    }

    @Test
    void EmptyMonthBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), "", DataHelper.year(), DataHelper.cardHolder(), DataHelper.CorrectCVV());
        buyInCreditPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyYearBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), "", DataHelper.cardHolder(), DataHelper.CorrectCVV());
        buyInCreditPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyCardHolderBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), "", DataHelper.CorrectCVV());
        buyInCreditPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyCVVBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), "");
        buyInCreditPage.emptyField().shouldBe(visible);
    }

    @Test
    void EmptyInCorrectCVVBuyTourInCreditTest(){

        open("http://localhost:8080");
        BuyInCreditPage buyInCreditPage = new StartPage().buyInCreditPage();
        buyInCreditPage.fillInCardDetails(DataHelper.correctCardNumber(), DataHelper.month(), DataHelper.year(), DataHelper.cardHolder(), DataHelper.InCorrectCVV());
        buyInCreditPage.emptyField().shouldBe(visible);
    }
}
