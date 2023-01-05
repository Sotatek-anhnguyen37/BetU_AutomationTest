package core;

import constants.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitUtil  {
    BaseTest baseTest = new BaseTest();

    // WAIT FOR ELEMENT VISIBLE
    public WebElement WaitForElementVisible (By by) {
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOf((WebElement) by));
    }
    public WebElement WaitForElementVisible(String locator){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath(locator)));
    }
    public WebElement WaitForElementVisible(String locator, String value){
        locator = String.format(locator, value);
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath(locator)));
    }
    public WebElement WaitForElementVisible(WebElement element){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOf(element));
    }

    // WAIT FOR ELEMENT CLICKABLE
    public WebElement WaitForElementClickable (By by){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable((WebElement) by));
    }
    public WebElement WaitForElementClickable (String locator){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable((WebElement) By.xpath(locator)));
    }
    public WebElement WaitForElementClickable (String locator, String value){
        locator = String.format(locator, value);
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable((WebElement) By.xpath(locator)));
    }
    public WebElement WaitForElementClickable (WebElement element){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // WAIT FOR ELEMENT TO BE  SELECTED

    // WAIT FOR ELEMENTS VISIBLE
    public List<WebElement> WaitForAllElementsVisible(By by){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfAllElements((WebElement) by));
    }
    public List<WebElement> WaitForAllElementsVisible(String xpath){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfAllElements((WebElement) By.xpath(xpath)));
    }
    public List<WebElement> WaitForAllElementsVisible(String xpath, String value){
        xpath = String.format(xpath, value);
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfAllElements((WebElement) By.xpath(xpath)));
    }
    public List<WebElement> WaitForAllElementsPresent(By by){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
    public List<WebElement> WaitForAllElementsVisible(WebElement element){
        var driverWait = new WebDriverWait(baseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfAllElements(element));
    }


}
