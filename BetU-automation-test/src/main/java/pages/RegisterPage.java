package pages;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends BasePage {
    private String userName = "//input[@name='username']";
    private String emailAddress = "//input[@name='email']";
    private String enterPassword = "//input[@name='password']";
    private String confirmPassword = "//input[@name='confirm']";
    @FindBy(xpath = "//span[text()='Details']")
    private WebElement detail;
    private String registerNowBtn = "//span[text()='Register Now']";
    private String closeBtn = "//h2[text()='Register to Play']/parent::div/preceding-sibling::button";
    private String loginHere = "//a[text()='Login here']";
    private String checkboxTermAndConditions = "//a[text()='Terms & Conditions.']/parent::div/parent::span/preceding-sibling::span";
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage verifyRegister() {
        Assert.assertEquals(getElementText(userName), "");
        Assert.assertEquals(getElementText(emailAddress), "");
        Assert.assertEquals(getElementText(enterPassword), "");
        Assert.assertEquals(getElementText(confirmPassword), "");
        Assert.assertTrue(isControlEnabled(userName));
        Assert.assertTrue(isControlEnabled(emailAddress));
        Assert.assertTrue(isControlEnabled(enterPassword));
        Assert.assertTrue(isControlEnabled(confirmPassword));
        Assert.assertTrue(isControlEnabled(closeBtn));
        Assert.assertTrue(isControlEnabled(registerNowBtn));
        Assert.assertTrue(isControlEnabled(loginHere));
        Assert.assertFalse(isElementSelected(checkboxTermAndConditions));
        return this;
    }
}
