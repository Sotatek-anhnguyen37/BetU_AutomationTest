package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DepositPage;
import pages.LoginPage;

public class DepositTest extends BaseTest {
    @Test
    public void ConfirmDepositButton() throws InterruptedException {
        DepositPage depositPage = new DepositPage(getDriver());
        CommonPage commonPage = new CommonPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage
                .clickLoginButton()
                .InputUsername("andy18")
                .InputPassword("Betu_12345")
                .clickLoginButtonInForm();
        commonPage.clickDepositButton();
        depositPage
                .clickShowListCoin();
        Thread.sleep(2000);
        depositPage
                .selectCoin()
                .clickShowListNetWork()
                .selectNetWork();

    }
}
