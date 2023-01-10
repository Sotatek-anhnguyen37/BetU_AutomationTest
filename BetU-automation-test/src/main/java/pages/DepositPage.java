package pages;

import core.BasePage;
import core.BaseTest;
import core.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositPage extends BasePage {
    private String showListCoins = "//label[text()='1. Select Coin']/following-sibling::div[contains(@style, 'position')]/div[2]/button";
    @FindBy(xpath = "//label[text()='2. Choose Network']/following-sibling::div")
    private WebElement showListNetWork;
//    @FindBy(xpath = "//li[contains(@id, 'mui')]/span[1]")
//    private WebElement listCoins;
    private String listCoins = "//li[contains(@id, 'mui')]/span[1]";

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

    public void selectCoin(String nameCoin) {
        List<WebElement> ls = WaitUtil.WaitForAllElementsVisible(listCoins);
//        List<WebElement> ls = BaseTest.getDriver().findElements(By.xpath(listCoins));
        for (WebElement element : ls) {
            if (getElementText(element).contains(nameCoin)) {
                clickOnElement(element);
            }
        }
    }
    public DepositPage selectNetWork(){
        List<WebElement> ls = WaitUtil.WaitForAllElementsVisible(listNetWork);
        for(WebElement element : ls){
            if(getElementText(element) == "BEP20"){
                clickOnElement(element);
            }
        }
        return this;
    }
}
