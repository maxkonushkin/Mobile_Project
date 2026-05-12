package tests.local;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка работы кнопки Каталог в нижнем тапбаре страницы регистрации")
    public void successfulClickingCatalogButtonTest() {
        mainPage.сatalogScreen();
        mainPage.checkResult("Каталог");
    }

    @Test
    @DisplayName("Проверка работы кнопки Карта в нижнем тапбаре страницы регистрации")
    public void successfulClickingMapButtonTest() {
        mainPage.NearMeScreen();
        mainPage.checkResult("Зайдите в Профиль приложения, чтобы посмотреть все пункты обслуживания или откройте общий список на сайте");
    }

    @Test
    @DisplayName("Проверка работы кнопки О банке в нижнем тапбаре страницы регистрации")
    public void successfulClickingBankButtonTest() {
        mainPage.AboutBankScreen();
        mainPage.checkResult("О банке");
    }

    @Test
    @DisplayName("Проверка работы кнопки Вход в нижнем тапбаре страницы регистрации")
    public void successfulClickingLoginButtonTest() {
        mainPage.AboutBankScreen();
        mainPage.InputPhoneScreen();
        mainPage.checkResult("Введите номер телефона");
    }

}
