package core;

import com.fasterxml.jackson.databind.ser.Serializers;
import constants.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    private WebDriver driver;
    public static WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Common.TIME_OUT_SHORT, TimeUnit.SECONDS);
        PageFactory.initElements(this.driver, this);
    }

    public static WebDriverWait getExplicitWait() {
        return wait;
    }

    // CLICK ELEMENT
    public void clickOnElement(WebElement element) {
//        WaitUtil.WaitForElementClickable(element);
        element.click();
    }

    public void clickOnElement(String xpath) {
        WebElement element = WaitUtil.WaitForElementClickable(xpath);
        element.click();
    }

    public void clickOnElement(String xpath, String value) {
        WebElement element = WaitUtil.WaitForElementClickable(xpath, value);
        element.click();
    }

    public void clickOnElement(By by) {
        WebElement element = WaitUtil.WaitForElementClickable(by);
        element.click();
    }

    // SEND KEY AND CLEAR
    public void sendKey(WebElement element, String value) {
        WaitUtil.WaitForElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public void sendKey(String xpath, String value) {
        WebElement element = WaitUtil.WaitForElementVisible(xpath);
        element.clear();
        element.sendKeys(value);
    }

    public void senKeys(By by, String value) {
        WebElement element = WaitUtil.WaitForElementVisible(by);
        element.clear();
        element.sendKeys(value);
    }

    // SEND KEY WITHOUT CLEAR
    public void senKeysWithoutClear(By by, String value) {
        WebElement element = WaitUtil.WaitForElementVisible(by);
        element.sendKeys(value);
    }

    // GET TEXT
    public String getElementText(WebElement element) {
        return WaitUtil.WaitForElementVisible(element).getText();
    }

    public String getElementText(By by) {
        return WaitUtil.WaitForElementVisible(by).getText();
    }

    public String getElementText(String xpath) {
        return WaitUtil.WaitForElementVisible(xpath).getText();
    }

    public String getElementText(String xpath, String value) {
        return WaitUtil.WaitForElementVisible(xpath, value).getText();
    }

    // VERIFY ELEMENT ENABLED
    public boolean isControlEnabled(String xpath) {
        return WaitUtil.WaitForElementVisible(xpath).isEnabled();
    }

    public boolean isControlEnabled(By by) {
        return WaitUtil.WaitForElementVisible(by).isEnabled();
    }

    public boolean isControlEnabled(WebElement element) {
        return WaitUtil.WaitForElementVisible(element).isEnabled();
    }

    // VERIFY ELEMENT DISPLAYED
    public boolean isControlDisplayed(String xpath) {
        return WaitUtil.WaitForElementVisible(By.xpath(xpath)).isDisplayed();
    }

    public boolean isControlDisplayed(By by) {
        return BaseTest.getDriver().findElement(by).isDisplayed();
    }

    public boolean isControlDisplayed(WebElement element) {
        return WaitUtil.WaitForElementVisible(element).isDisplayed();
    }

    // VERIFY ELEMENT CHECKED
    public boolean isElementSelected(WebElement element) {
        return WaitUtil.WaitForElementVisible(element).isSelected();
    }

    public boolean isElementSelected(By by) {
        return BaseTest.getDriver().findElement(by).isSelected();
    }

    public boolean isElementSelected(String xpath) {
        return WaitUtil.WaitForElementVisible(xpath).isSelected();
    }


}
