package page;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

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
