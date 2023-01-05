package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.WatchEvent;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//span[text()='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//span[text()='Register']")
    private WebElement registerBtn;
    @FindBy(xpath = "//label[text()='Email or Username']/following-sibling::div/input")
    private WebElement username;
    @FindBy(xpath = "//label[text()='Password']/following-sibling::div/input")
    private WebElement password;
    @FindBy(xpath = "//span[text()='Remember Me']//parent::label/span[1]")
    private WebElement checkboxRememberMe;
    @FindBy(xpath = "((//span[text()='Remember Me']//parent::label/following-sibling::div[1]//span)[1]/span/input")
    private WebElement checkboxAbove18Years;
    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgotPassword;
    @FindBy(xpath = "//a[text()='Forgot Password?']/following-sibling::button")
    private WebElement loginBtnInForm;
    @FindBy(xpath = "//span[@id='recaptcha-anchor']")
    private WebElement checkboxNotRobot;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickLoginButton(){
        clickOnElement(loginBtn);
        return this;
    }
    public LoginPage clickRegisterButton(){
        clickOnElement(registerBtn);
        return this;
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
