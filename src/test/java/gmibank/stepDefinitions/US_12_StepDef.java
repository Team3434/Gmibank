package gmibank.stepDefinitions;

import gmibank.pages.ManageCustomerPage;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_12_StepDef {
    ManageCustomerPage manageCustomerPage = new ManageCustomerPage();
    @Given("user clicks my operation on employee page")
    public void user_clicks_my_operation_on_employee_page() {
        manageCustomerPage.myOperations.click();
    }

    @Given("user clicks Manage Customer on employee page")
    public void user_clicks_Manage_Customer_on_employee_page() {
        manageCustomerPage.manageCustomers.click();

    }

    @Given("verify customers info populated")
    public void verify_customers_info_populated() throws InterruptedException {
        for (WebElement element : Arrays.asList(manageCustomerPage.firstName, manageCustomerPage.lastName,
                manageCustomerPage.middleInitial, manageCustomerPage.email, manageCustomerPage.mobilePhoneNumber,
                manageCustomerPage.phoneNumber, manageCustomerPage.address, manageCustomerPage.customersCreateDate)){
            assertTrue(element.isDisplayed());

        }

        List<WebElement> tableData=Driver.getDriver().findElements(By.xpath("//td"));
        assertTrue(tableData.size()>0);

    }

    @Given("user clicks view option to see all customers all info")
    public void user_clicks_view_option_to_see_all_customers_all_info() throws InterruptedException {
        manageCustomerPage.customersView.click();
        assertTrue(manageCustomerPage.viewPageText.isDisplayed());
       // Thread.sleep(10000);

    }

    @Then("verify the edit button is displayed")
    public void verify_the_edit_button_is_displayed() {
        assertTrue(manageCustomerPage.editButton.isDisplayed());

    }

    @Given("user clicks Edit option to see customers all info on customer page")
    public void user_clicks_Edit_option_to_see_customers_all_info_on_customer_page() throws InterruptedException {
        manageCustomerPage.customersEdit.click();
        assertTrue(manageCustomerPage.editPageText.isDisplayed());
        //Thread.sleep(10000);

    }


    @Then("user can update or create customer info on Edit portal")
    public void user_can_update_or_create_customer_info_on_Edit_portal() {
        String temp = manageCustomerPage.firstNameForEditable.getAttribute("value");
        String editedTemp = temp.toUpperCase();
        manageCustomerPage.firstNameForEditable.clear();
        manageCustomerPage.firstNameForEditable.sendKeys(editedTemp);
        manageCustomerPage.saveButtonEditPage.click();
        ReusableMethods.waitForVisibility(manageCustomerPage.succesPopUP,5);
        assertTrue(manageCustomerPage.succesPopUP.isDisplayed());

    }

    @Given("user should clicks delete button")
    public void user_should_clicks_delete_button() throws InterruptedException {
        manageCustomerPage.customersDelete.click();
       // Thread.sleep(10000);

    }

    @Then("user should see message if user sure about deletion")
    public void user_should_see_message_if_user_sure_about_deletion() {
        ReusableMethods.waitForVisibility(manageCustomerPage.deleteAlertMessage,5);
        assertTrue(manageCustomerPage.deleteAlertMessage.isDisplayed());
        ReusableMethods.waitFor(3);

    }
}
