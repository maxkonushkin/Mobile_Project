package tests.local;

import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
  public  void successfulClickingCatalogButtonTest() {
        mainPage.сatalogScreen();
        mainPage.checkResult("Каталог");
    }

    @Test
    void successfulClickingCatalogButtonTest2() {
        step("Type search", () -> {
            $(byXpath("//android.view.View[@resource-id='CatalogScreen']/android.view.View")).click();
        });
        step("Verify content found", () ->
                $(byXpath("//android.widget.TextView")).shouldHave(text("Каталог")));
    }

    @Test
    void successfulClickingMapButtonTest() {
        step("Type search", () -> {
            $(byXpath("//android.view.View[@resource-id='NearMeScreen']/android.view.View")).click();
        });
        step("Verify content found", () ->
                $(byXpath("//android.widget.TextView"))
                        .shouldHave(text("Зайдите в Профиль приложения, чтобы посмотреть все пункты обслуживания или откройте общий список на сайте")));
    }

    @Test
    void successfulClickingBankButtonTest() {
        step("Type search", () -> {
            $(byXpath("//android.view.View[@resource-id='AboutBankScreen']/android.view.View")).click();
        });
        step("Verify content found", () ->
                $(byXpath("//android.widget.TextView"))
                        .shouldHave(text("О банке")));
    }

    @Test
    void successfulClickingLoginButtonTest() {
        step("Type search", () -> {
            $(byXpath("//android.view.View[@resource-id='AboutBankScreen']/android.view.View")).click();
            $(byXpath("//android.view.View[@resource-id='InputPhoneScreen']/android.view.View")).click();
        });
        step("Verify content found", () ->
                $(byXpath("//android.widget.TextView"))
                        .shouldHave(text("Введите номер телефона")));
    }
}
