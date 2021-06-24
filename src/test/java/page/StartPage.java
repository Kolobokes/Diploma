package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selectors.withText;

public class StartPage {
    private ElementsCollection AllButton = $$("button");


    public BuyPage buyPage() {
        AllButton.get(0).click();

        return new BuyPage();
    }

    public BuyInCreditPage buyInCreditPage() {
        AllButton.get(1).click();

        return new BuyInCreditPage();
    }

}
