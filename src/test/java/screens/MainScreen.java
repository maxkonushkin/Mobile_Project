package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class MainScreen {

    private final SelenideElement checkResult = $(byXpath("//android.widget.TextView")),
            сatalogScreen = $(byXpath("//android.view.View[@resource-id='CatalogScreen']/android.view.View")),
            NearMeScreen = $(byXpath("//android.view.View[@resource-id='NearMeScreen']/android.view.View")),
            AboutBankScreen = $(byXpath("//android.view.View[@resource-id='AboutBankScreen']/android.view.View")),
            InputPhoneScreen = $(byXpath("//android.view.View[@resource-id='InputPhoneScreen']/android.view.View"));

    @Step("Нажимаем на кнопку Каталог")
    public MainScreen сatalogScreen() {
        сatalogScreen.click();
        return this;
    }

    @Step("Нажимаем на кнопку Карта")
    public MainScreen NearMeScreen() {
        NearMeScreen.click();
        return this;
    }

    @Step("Нажимаем на кнопку О банке")
    public MainScreen AboutBankScreen() {
        AboutBankScreen.click();
        return this;
    }

    @Step("Нажимаем на кнопку Вход")
    public MainScreen InputPhoneScreen() {
        InputPhoneScreen.click();
        return this;
    }

    @Step("Проверяем результат")
    public MainScreen checkResult(String value) {
        checkResult.shouldHave(text(value));
        return this;
    }

}
