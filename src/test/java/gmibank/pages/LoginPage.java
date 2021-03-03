package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountDropdown;

    @FindBy(xpath="//span[text()='Sign in']")
    public WebElement signinButton;

    @FindBy(name="username")
    public WebElement username;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath="//*[@class='btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']/span")
    public WebElement alert;

    @FindBy(xpath="//*[@class='btn btn-secondary']")
    public WebElement cancelButton;

    @FindBy(xpath="//span[contains(text(),'Did you forget your password?')]")
    public WebElement forgetPasswordButton;

    @FindBy(xpath="//span[contains(text(),'Register a new account')]")
    public WebElement registerAccountButton;

    @FindBy(xpath="(//li[@id='account-menu']//span)[1]")
    public WebElement accountName;

    @FindBy(xpath = "//*[@id='register-title']/span")
    public WebElement registrationPage;


}