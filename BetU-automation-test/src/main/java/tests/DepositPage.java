package tests;

import core.BasePage;
import core.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DepositPage extends BasePage {
    WaitUtil waitUtil = new WaitUtil();
    @FindBy(xpath = "//span[text()='Deposit']")
    private WebElement depositBtn;
    @FindBy(xpath = "//label[text()='1. Select Coin']/following-sibling::div[contains(@style, 'position')]/div[2]/button")
    private WebElement showListCoins;
    @FindBy(xpath = "//label[text()='2. Choose Network']/following-sibling::div")
    private WebElement showListNetWork;
    @FindBy(xpath = "//ul[contains(@id, 'mui')]")
    private WebElement listCoins;

    public DepositPage(WebDriver driver) {
        super(driver);
    }
    public void selectCoin(){
        List<WebElement> ls = waitUtil.WaitForAllElementsVisible(listCoins);
        for ( WebElement element : ls) {
            element.click();
        }
    }
}
