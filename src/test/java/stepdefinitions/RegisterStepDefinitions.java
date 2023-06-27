package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationMainPage;
import pages.EnterAccountPage;
import pages.SignUpLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterStepDefinitions {


     AutomationMainPage automationMainPage=new AutomationMainPage();

     SignUpLoginPage signUpLoginPage=new SignUpLoginPage();

     EnterAccountPage enterAccountPage=new EnterAccountPage();

    @Given("User is on automation page")
    public void user_is_on_automation_page() {
        Driver.getDriver().get(ConfigReader.getProperty("automationexercises_url"));
    }
    @Then("User verifies that home page is visible successfully")
    public void user_verifies_that_home_page_is_visible_successfully() {
        String actualData=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals( "https://automationexercise.com/",actualData );

    }

    @Then("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
         automationMainPage.signUpLoginButton.click();
    }
    @Then("User verifies {string} is visible")
    public void user_verifies_is_visible(String string) {
      Assert.assertTrue(signUpLoginPage.signUpText.isDisplayed());
    }
    @Then("User enters name and email address")
    public void user_enters_name_and_email_address() {
        signUpLoginPage.nameInputBox.sendKeys("Robert De Niro");
        signUpLoginPage.emailInputBox.sendKeys("robertdeniro@gmail.com");
    }
    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {
        signUpLoginPage.signUpButton.click();

    }

    @Then("User verifies that {string} is visible")
    public void user_verifies_that_is_visible(String string) {

       Assert.assertTrue(enterAccountPage.enterAccountText.isDisplayed());
    }


}
