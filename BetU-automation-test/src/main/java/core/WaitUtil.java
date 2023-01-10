package core;

import constants.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WaitUtil  {
    public WebDriverWait wait;
    // WAIT FOR ELEMENT VISIBLE
    public static WebElement WaitForElementVisible (By by) {
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static WebElement WaitForElementVisible(String xpath){
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public static WebElement WaitForElementVisible(String xpath, String value){
        xpath = String.format(xpath, value);
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
    public static WebElement WaitForElementVisible(WebElement element){
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
    }

    // WAIT FOR ELEMENT CLICKABLE
    public static WebElement WaitForElementClickable (By by){
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static WebElement WaitForElementClickable(String xpath){
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
    public static WebElement WaitForElementClickable (String xpath, String value){
        xpath = String.format(xpath, value);
        var driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }
    public static void WaitForElementClickable(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        driverWait.until(ExpectedConditions.elementToBeClickable((By) element));
    }
    public static List<WebElement> WaitForAllElementsVisible(WebElement element){
        WebDriverWait driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By) element));
    }
    public static List<WebElement> WaitForAllElementsVisible(String xpath){
        WebDriverWait driverWait = new WebDriverWait(BaseTest.getDriver(), Common.TIME_OUT_SHORT);
        return driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
    }
}
