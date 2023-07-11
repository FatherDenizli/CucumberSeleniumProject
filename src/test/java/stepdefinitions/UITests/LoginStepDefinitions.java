package stepdefinitions.UITests;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import pages.AutomationMainPage;
import pages.SignUpLoginPage;
import utilities.ConfigReader;

public class LoginStepDefinitions {

     AutomationMainPage automationMainPage=new AutomationMainPage();

     SignUpLoginPage signUpLoginPage=new SignUpLoginPage();
     Faker faker=new Faker();

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



// NEGATIF LOGIN TEST
    @Then("Enter incorrect email address and password")
    public void enter_incorrect_email_address_and_password() {
        automationMainPage.email.sendKeys(faker.internet().emailAddress());
        automationMainPage.loginPassword.sendKeys(faker.internet().password());
    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        automationMainPage.emailorPasswordIncorrect.isDisplayed();

    }


// LOGOUT USER TEST  (Ready 8 Reuseable Methods from Positive Login)

    @Then("Clicks {string} button")
    public void clicks_button(String string) {

        automationMainPage.logout.click();

    }


    //Test Case 5: Register User with existing email (Ready 6  Reuseable Methods from Positive Login)


    @Then("User Enters name and already registered email address")
    public void user_enters_name_and_already_registered_email_address() {

        signUpLoginPage.nameInputBox.sendKeys(ConfigReader.getProperty("user_name"));
        signUpLoginPage.emailInputBox.sendKeys(ConfigReader.getProperty("login_email"));


    }
    @Then("Verify that error {string} is visible")
    public void verify_that_error_is_visible(String string) {

        automationMainPage.emailAlreadyExist.isDisplayed();


    }






}
