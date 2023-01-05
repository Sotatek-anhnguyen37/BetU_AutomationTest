package tests;

import core.BasePage;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void TC_01_CheckLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage
            .clickLoginButton()
            .InputUsername("andy18")
            .InputPassword("Betu_12345")
            .clickLoginButtonInForm();
    }
}
