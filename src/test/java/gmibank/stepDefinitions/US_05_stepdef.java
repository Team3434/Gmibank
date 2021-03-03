package gmibank.stepDefinitions;

import gmibank.pages.LoginPage;
import gmibank.pages.ResetPasswordPage;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class US_05_stepdef {

    LoginPage loginPage= new LoginPage();
    ResetPasswordPage resetPasswordPage=new ResetPasswordPage();

    @When("User provides {string} and {string}")
    public void user_provides_and(String username, String password) {
        ReusableMethods.login(username,password);

    }

    @Then("User gets error message")
    public void user_gets_error_message() {
        Driver.wait(5);
        //System.out.println(Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-danger fade show']/span")).getText());
        String actualMessage=Driver.waitAndGetText(loginPage.alert,2);
        //Driver.waitForVisibility(loginPage.alert,2);
        //String expectedMesage="Failed to sign in! Please check your credentials and try again.";
        //Assert.assertEquals(expectedMesage,actualMessage);
        Assert.assertTrue("Could not find error message",actualMessage.contains("Failed to sign in!"));
        System.out.println(actualMessage);
    }
    @When("User provides username {string}")
    public void user_provides_username(String username) {
        // Write code here that turns the phrase above into concrete actions
        Driver.waitAndSendText(loginPage.username,username,2);
    }
    @Then("User provides  email {string}")
    public void user_provides_email(String email) {
        System.out.println("enter email");
        // Write code here that turns the phrase above into concrete actions
        Driver.waitAndSendText(resetPasswordPage.email,email,2);
    }
    @When("User can click on {string} button")
    public void user_can_click_on_button(String buttonName) {
        System.out.println("before clicked on");
       // Driver.getDriver().findElement(By.xpath("//span[contains(text(),'Register a new account')]")).click();
        //loginPage.registerAccountButton.click();

       if(buttonName.equalsIgnoreCase("Did you forget your password?")) {
            Driver.waitAndClick(loginPage.forgetPasswordButton, 5);
        }
        else if (buttonName.equalsIgnoreCase("Reset password")) {
            Driver.waitAndClick(resetPasswordPage.resetPasswordBtn, 5);
        }
        else if (buttonName.equalsIgnoreCase("Register a new account")) {

           // Driver.waitForClickablility(loginPage.registerAccountButton,2);
            Driver.waitAndClick(loginPage.registerAccountButton, 2);
           //loginPage.registerAccountButton.click();
        }
        else{
            System.out.println("not found!");
        }
        System.out.println("after clicked on");
    }

    @Then("User navigates to {string} page")
    public void user_navigates_to_page(String pageTitle) {
        // Write code here that turns the phrase above into concrete actions
        if(pageTitle.equalsIgnoreCase("Reset your password")) {
            String actualTitle = Driver.waitAndGetText(resetPasswordPage.pageTitle, 2);
            Assert.assertEquals(actualTitle, pageTitle);
        }
        else if(pageTitle.equalsIgnoreCase("Registration")) {
            Driver.wait(3);
            String actualTitle = Driver.waitAndGetText(loginPage.registrationPage, 2);
            Assert.assertEquals(actualTitle, pageTitle);
            System.out.println(loginPage.registrationPage.getText());
        }
    }

   /* @Then("User receives confirmation message")
    public void user_receives_confirmation_message() {
        // Write code here that turns the phrase above into concrete actions
        //WebElement message=Driver.getDriver().findElement(By.xpath("//div[contains(text(),'Check your emails for details on how to reset your')]"));
       // Driver.waitForVisibility(message,5);
        //System.out.println(Driver.waitAndGetText(message,2));
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
        System.out.println(js.executeScript("document.getElementsByClassName('Toastify__toast-body')[0]"));
    }
*/


}
