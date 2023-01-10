package tests;

import constants.Common;
import core.BaseTest;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.DepositPage;
import pages.LoginPage;

public class DepositTest extends BaseTest {
    @Test
    public void ConfirmDepositButton() throws InterruptedException {
        String nameCoin = "BETU";
        DepositPage depositPage = new DepositPage(getDriver());
        CommonPage commonPage = new CommonPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        commonPage.clickLoginButton();
        loginPage
                .InputUsername("andy18")
                .InputPassword("Betu_12345")
                .clickLoginButtonInForm();
        commonPage.clickDepositButton();
        depositPage
                .clickShowListCoin();
        Thread.sleep(2000);
        depositPage
                .selectCoin(nameCoin);
        Thread.sleep(2000);
        depositPage
                .clickShowListNetWork()
                .selectNetWork();
    }
}
