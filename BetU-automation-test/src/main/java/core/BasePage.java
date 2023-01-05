package core;

import constants.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    WaitUtil waitUtil = new WaitUtil();


    public BasePage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Common.TIME_OUT_SHORT, TimeUnit.SECONDS);
        wait = new WebDriverWait(this.driver, Common.TIME_OUT_SHORT);
        PageFactory.initElements(this.driver, this);
    }

    public WebDriverWait getWait() {
        return wait;
    }
    // CLICK ELEMENT
    public void clickOnElement(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void clickOnElement(String xpath){
        WebElement element = waitUtil.WaitForElementClickable(xpath);
        element.click();
    }
    public void clickOnElement(String xpath, String value){
        WebElement element = waitUtil.WaitForElementClickable(xpath, value);
        element.click();
    }
    public void clickOnElement(By by){
        WebElement element = waitUtil.WaitForElementClickable(by);
        element.click();
    }

    // SEND KEY AND CLEAR
    public void sendKey(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
    public void sendKey(String xpath, String value){
        WebElement element = waitUtil.WaitForElementVisible(xpath);
        element.clear();
        element.sendKeys(value);
    }
    public void senKeys(By by, String value){
        WebElement element = waitUtil.WaitForElementVisible(by);
        element.clear();
        element.sendKeys(value);
    }
    // SEND KEY WITHOUT CLEAR
    public void senKeysWithoutClear(By by, String value){
        WebElement element = waitUtil.WaitForElementVisible(by);
        element.sendKeys(value);
    }

    // SELECT



}
