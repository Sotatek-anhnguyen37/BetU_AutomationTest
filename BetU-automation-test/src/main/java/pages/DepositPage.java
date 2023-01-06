package pages;

import core.BasePage;
import core.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositPage extends BasePage {
    WaitUtil waitUtil = new WaitUtil();
    @FindBy(xpath = "//label[text()='1. Select Coin']/following-sibling::div[contains(@style, 'position')]/div[2]/button")
    private WebElement showListCoins;
    @FindBy(xpath = "//label[text()='2. Choose Network']/following-sibling::div")
    private WebElement showListNetWork;
    @FindBy(xpath = "//li[contains(@id, 'mui')]/span[1]")
    private WebElement listCoins;
    @FindBy(xpath = "//li[contains(@class, 'MuiMenuItem')]/span")
    private WebElement listNetWork;

    public DepositPage(WebDriver driver) {
        super(driver);
    }

    public DepositPage clickShowListCoin() {
        clickOnElement(showListCoins);
        return this;
    }

    public DepositPage clickShowListNetWork() {
        clickOnElement(showListNetWork);
        return this;
    }

    public DepositPage selectCoin() {
        List<WebElement> ls = waitUtil.WaitForAllElementsVisible(listCoins);
        for (WebElement element : ls) {
            if (getElementText(element) == "BETU") {
                clickOnElement(element);
            }
        }
        return this;
    }
    public DepositPage selectNetWork(){
        List<WebElement> ls = waitUtil.WaitForAllElementsVisible(listNetWork);
        for(WebElement element : ls){
            if(getElementText(element) == "BEP20"){
                clickOnElement(element);
            }
        }
        return this;
    }
}
