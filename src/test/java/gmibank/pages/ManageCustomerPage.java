package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageCustomerPage {
    public ManageCustomerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement myOperations;
    @FindBy(id = "tp-customer-heading")
    public WebElement customerPageText;

    @FindBy(id = "jh-create-entity")
    public WebElement createCustomerButton;

    @FindBy(xpath="(//*[@class=\"dropdown-item\"])[2]")
    public WebElement manageAccounts;
    @FindBy(xpath="(//*[@class=\"dropdown-item\"])[1]")
    public WebElement manageCustomers;
    @FindBy(xpath = "(//div//table//tr//th//span)[1]")
    public WebElement headingID;
    @FindBy(xpath = "(//div//table//tr//th//span)[2]")
    public WebElement headingFirstName;
    @FindBy(xpath = "(//div//table//tr//th//span)[3]")
    public WebElement headingLastName;
    @FindBy(xpath = "(//div//table//tr//th//span)[4]")
    public WebElement headingMiddleInitial;
    @FindBy(xpath = "(//div//table//tr//th//span)[5]")
    public WebElement headingEmail;
    @FindBy(xpath = "(//div//table//tr//th//span)[6]")
    public WebElement headingMobPhonNum;
    @FindBy(xpath = "(//div//table//tr//th//span)[7]")
    public WebElement headingPhonNum;
    @FindBy(xpath = "(//div//table//tr//th//span)[8]")
    public WebElement headingAddress;
    @FindBy(xpath = "(//div//table//tr//th//span)[9]")
    public WebElement headingCreateDate;
    @FindBy(xpath = "//th")
    public WebElement listOfHeaders;


    //======================== Manage customer locators============
    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[1]/a")
    public WebElement customersID;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[2]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[3]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[4]")
    public WebElement middleInitial;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[5]")
    public WebElement email;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[6]")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[7]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[8]")
    public WebElement address;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[9]/span")
    public WebElement customersCreateDate;

    @FindBy(xpath = "///*[@class='table']/tbody/tr[9]/td[10]/div/a[1]")
    public WebElement customersView;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[10]/div/a[2]")
    public WebElement customersEdit;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[9]/td[10]/div/a[3]")
    public WebElement customersDelete;

    @FindBy(xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div/a[2]")
    public WebElement editButton;

    @FindBy(xpath = "//div[@class='modal-body']/span")
    public WebElement deleteAlertMessage;
    @FindBy(xpath = "//*[@id='jhi-confirm-delete-tPCustomer']")
    public WebElement alertDeleteButton;
    @FindBy(xpath = "//a[@class='dropdown-item active']")
    public WebElement manageCustomerSegment;
    // customer view page element
    @FindBy(tagName = "h2")
    public WebElement viewPageText;
    //create or edit customer paage element
    @FindBy(id = "gmibankfrontendApp.tPCustomer.home.createOrEditLabel")
    public WebElement editPageText;
    @FindBy(id = "tp-customer-firstName")
    public WebElement firstNameForEditable;
    @FindBy(id = "save-entity")
    public WebElement saveButtonEditPage;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement succesPopUP;

}
