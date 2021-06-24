package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class BuyPage {
    private ElementsCollection allField =$$("input");
    private ElementsCollection allButton =$$("button");
    private SelenideElement error =$(".notification_status_error");
    private SelenideElement ok =$(".notification_status_ok");
    private SelenideElement emptyField = $(".input_invalid > .input__inner > .input__sub");

    public void fillInCardDetails(String cardNumber, String month, String year, String cardHolder, String CVV) {
        allField.get(0).setValue(cardNumber);
        allField.get(1).setValue(month);
        allField.get(2).setValue(year);
        allField.get(3).setValue(cardHolder);
        allField.get(4).setValue(CVV);
        allButton.get(2).click();
    }

    public SelenideElement notificationError() {
        return error;

    }

    public SelenideElement notificationOk() {
        return ok;

    }

    public SelenideElement emptyField() {
        return emptyField;

    }

}
