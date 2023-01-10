package tests;

import core.BasePage;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void TC_01_CheckLogin() throws InterruptedException {
        CommonPage commonPage = new CommonPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        commonPage.clickLoginButton();
        loginPage
            .InputUsername("andy18")
            .InputPassword("Betu_12345")
            .clickLoginButtonInForm();
    }
}
