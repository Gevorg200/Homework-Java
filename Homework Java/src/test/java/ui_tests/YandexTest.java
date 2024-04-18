package ui_tests;

import org.junit.Test;
import pages.LoginPage;

public class YandexTest  extends BaseTest {

    @Test(description = "Checking a message about an incorrect password/login")
    public void checkIncorrectPasswordMsg() {

        new LoginPage().goToStartPage()
                .clickOnEnterButton()
                .setLogin("gevorgs")
                .clickOnSubmitButton()
                .setPassword("23202354g")
                .clickOnSubmitButton();
    }
}
