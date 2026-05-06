package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement checkResult = $(byXpath("//android.widget.TextView")),
    сatalogScreen = $(byXpath("//android.view.View[@resource-id='CatalogScreen']/android.view.View"));


    ElementsCollection transfersByPhoneNumber = $$("[href='/sbp/']"),
            loanRepayment = $$("[href='/payment/credit/']"),
            paymentByMobile = $$("[href='/services/mobile/']"),
            currencyTransfer = $$("[href='/single/swift/']"),
            cardReplenishment = $$("[href='/payment/cards/']"),
            depositReplenishment = $$("[href='/payment/deposits/']");



    @Step("Нажимаем на кнопку Каталог")
    public MainPage сatalogScreen() {
        сatalogScreen.click();
        return this;
    }


    @Step("Проверяем результат")
    public MainPage checkResult(String value) {
        checkResult.shouldHave(text(value));
        return this;
    }

}
