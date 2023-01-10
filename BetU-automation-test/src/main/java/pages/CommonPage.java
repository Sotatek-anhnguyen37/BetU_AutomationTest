package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends BasePage {
    @FindBy(xpath = "//span[text()='Deposit']")
    private WebElement depositBtn;
    @FindBy(xpath = "//span[text()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//span[text()='Register']")
    private WebElement registerBtn;

    public CommonPage(WebDriver driver) {
        super(driver);
    }
    public void clickDepositButton(){
        clickOnElement(depositBtn);
    }
    public CommonPage clickLoginButton(){
        clickOnElement(loginBtn);
        return this;
    }
    public CommonPage clickRegisterButton(){
        clickOnElement(registerBtn);
        return this;
    }
}
