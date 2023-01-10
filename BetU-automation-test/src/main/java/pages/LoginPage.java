package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
//    @FindBy(xpath = "//label[text()='Email or Username']/following-sibling::div/input")
//    private WebElement username;
    private String username = "//label[text()='Email or Username']/following-sibling::div/input";
//    @FindBy(xpath = "//label[text()='Password']/following-sibling::div/input")
//    private WebElement password;
    private String password ="//label[text()='Password']/following-sibling::div/input";
//    @FindBy(xpath = "//span[text()='Remember Me']//parent::label/span[1]")
//    private WebElement checkboxRememberMe;
    private String checkboxRememberMe = "//span[text()='Remember Me']//parent::label/span[1]";
//    @FindBy(xpath = "((//span[text()='Remember Me']//parent::label/following-sibling::div[1]//span)[1]/span/input")
//    private WebElement checkboxAbove18Years;
    private String checkboxAbove18Years = "((//span[text()='Remember Me']//parent::label/following-sibling::div[1]//span)[1]/span/input";
//    @FindBy(xpath = "//a[text()='Forgot Password?']")
//    private WebElement forgotPassword;
    private String forgotPassword = "//a[text()='Forgot Password?']";
//    @FindBy(xpath = "//a[text()='Forgot Password?']/following-sibling::button")
//    private WebElement loginBtnInForm;
    private String loginBtnInForm = "//a[text()='Forgot Password?']/following-sibling::button";
//    @FindBy(xpath = "//span[@id='recaptcha-anchor']")
//    private WebElement checkboxNotRobot;
    private String checkboxNotRobot = "//span[@id='recaptcha-anchor']";
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginButtonInForm(){
        clickOnElement(loginBtnInForm);
        return this;
    }
    public LoginPage clickCheckBoxRememberMe(){
        clickOnElement(checkboxRememberMe);
        return this;
    }
    public LoginPage clickCheckBoxAbove18Years(){
        clickOnElement(checkboxAbove18Years);
        return this;
    }
    public LoginPage clickCheckBoxNotRobot(){
        clickOnElement(checkboxNotRobot);
        return this;
    }
    public LoginPage InputUsername(String user_name){
        sendKey(username, user_name);
        return this;
    }
    public LoginPage InputPassword(String password_){
        sendKey(password, password_);
        return this;
    }
}
