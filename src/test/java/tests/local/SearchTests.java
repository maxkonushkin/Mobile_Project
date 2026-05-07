package tests.local;

import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    public void successfulClickingCatalogButtonTest() {
        mainPage.сatalogScreen();
        mainPage.checkResult("Каталог");
    }

    @Test
    public void successfulClickingMapButtonTest() {
        mainPage.NearMeScreen();
        mainPage.checkResult("Зайдите в Профиль приложения, чтобы посмотреть все пункты обслуживания или откройте общий список на сайте");
    }

    @Test
    public void successfulClickingBankButtonTest() {
        mainPage.AboutBankScreen();
        mainPage.checkResult("О банке");
    }

    @Test
    public void successfulClickingLoginButtonTest() {
        step("Type AboutBankScreen", () -> {
            mainPage.AboutBankScreen();
        });
        mainPage.InputPhoneScreen();
        step("Verify content found", () ->
                mainPage.checkResult("Введите номер телефона"));
    }

}
