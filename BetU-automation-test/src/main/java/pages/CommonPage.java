package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage extends BasePage {
    @FindBy(xpath = "//span[text()='Deposit']")
    private WebElement depositBtn;

    public CommonPage(WebDriver driver) {
        super(driver);
    }
    public CommonPage clickDepositButton(){
        clickOnElement(depositBtn);
        return this;
    }
}
