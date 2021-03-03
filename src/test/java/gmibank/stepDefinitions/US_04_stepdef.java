package gmibank.stepDefinitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigurationReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
//import net.bytebuddy.implementation.bind.MethodDelegationBinder;

public class US_04_stepdef {

    LoginPage loginPage;
    String actualName;

    @When("user go to login page")
    public void user_go_to_login_page() {
        // Write code here that turns the phrase above into concrete actions
        ReusableMethods.loginPage();
    }

    @When("User provides username {string} and password {string} and signs in")
    public void user_provides_username_and_password_and_signs_in(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        ReusableMethods.login(username, password);
    }

    @Then("User is navigated to {string}")
    public void user_is_navigated_to(String expectedName) {
        // Write code here that turns the phrase above into concrete actions
      //  ReusableMethods.loginVerify(expectedName);
         ReusableMethods.loginVerify(expectedName);
       // actualName = Driver.waitAndGetText(loginPage.accountName,5);
        //Driver.waitForVisibility(By.xpath("//a[@class='d-flex align-items-center dropdown-toggle nav-link']"),5);
        //actualName=Driver.getDriver().findElement(By.xpath("//a[@class='d-flex align-items-center dropdown-toggle nav-link']")).getText();

    }

    @When("user clicks on cancel button")
    public void user_clicks_on_cancel_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage=new LoginPage();
        Driver.waitForClickablility(loginPage.cancelButton,2);
        Driver.waitAndClick(loginPage.cancelButton,2);
       // System.out.println("Account name is " +loginPage.accountName.getText());;

    }

    @Then("User is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(loginPage.accountName.getText(), "");
    }

    }
