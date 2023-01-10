package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {
    @Test
    public void TC_Check_Initializing_Register_Screen() throws InterruptedException {
        CommonPage commonPage = new CommonPage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        commonPage.clickRegisterButton();
        Thread.sleep(2000);
        registerPage.verifyRegister();
    }
}
