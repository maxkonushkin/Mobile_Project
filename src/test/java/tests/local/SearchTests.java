package tests.local;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import screens.MainScreen;

public class SearchTests extends TestBase {

    MainScreen mainScreen = new MainScreen();

    @Test
    @DisplayName("Проверка работы кнопки Каталог в нижнем тапбаре страницы регистрации")
    public void successfulClickingCatalogButtonTest() {
        mainScreen.сatalogScreen();
        mainScreen.checkResult("Каталог");
    }

    @Test
    @DisplayName("Проверка работы кнопки Карта в нижнем тапбаре страницы регистрации")
    public void successfulClickingMapButtonTest() {
        mainScreen.NearMeScreen();
        mainScreen.checkResult("Зайдите в Профиль приложения, чтобы посмотреть все пункты обслуживания или откройте общий список на сайте");
    }

    @Test
    @DisplayName("Проверка работы кнопки О банке в нижнем тапбаре страницы регистрации")
    public void successfulClickingBankButtonTest() {
        mainScreen.AboutBankScreen();
        mainScreen.checkResult("О банке");
    }

    @Test
    @DisplayName("Проверка работы кнопки Вход в нижнем тапбаре страницы регистрации")
    public void successfulClickingLoginButtonTest() {
        mainScreen.AboutBankScreen();
        mainScreen.InputPhoneScreen();
        mainScreen.checkResult("Введите номер телефона");
    }

}
