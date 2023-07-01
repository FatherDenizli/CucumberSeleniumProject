package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginStepDefinitions {

AutomationMainPage automationMainPage=new AutomationMainPage();

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

       automationMainPage.homePageText.isDisplayed();
   }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        automationMainPage.loginToYourAccount.isDisplayed();
    }
    @Then("User Enters correct email address and password")
    public void user_enters_correct_email_address_and_password() {
        automationMainPage.email.sendKeys(ConfigReader.getProperty("login_email"));
        automationMainPage.loginPassword.sendKeys(ConfigReader.getProperty("login_password"));

     }

    @Then("user clicks {string} button")
    public void user_click_button(String loginButton) {
        automationMainPage.loginButton.click();
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
     automationMainPage.loggedInAs.isDisplayed();
    // automationMainPage.user.isDisplayed();

    }

    @Then("User clicks {string} button to delete account")
    public void user_clicks_button_to_delete_account(String string) {
         automationMainPage.deleteAccountButton.click();
    }
    @Then("Verify that {string} should be visible visible")
    public void verify_that_should_be_visible_visible(String string) {
         automationMainPage.accountDeletedText.isDisplayed();
        System.out.println(automationMainPage.accountDeletedText.getText());
    }












}
