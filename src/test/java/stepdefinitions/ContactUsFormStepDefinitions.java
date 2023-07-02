package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.AutomationMainPage;
import pages.ContactUsFormPage;
import utilities.ConfigReader;

public class ContactUsFormStepDefinitions {

    AutomationMainPage automationMainPage=new AutomationMainPage();
   ContactUsFormPage contactUsFormPage=new ContactUsFormPage();


    @Then("User clicks on {string} form button")
    public void user_clicks_on_form_button(String string) {
       contactUsFormPage.contactUsButon.click();
    }
    @Then("Verify {string} is visible in contact page")
    public void verify_is_visible_in_contact_page(String string) {
        contactUsFormPage.getInTouchText.isDisplayed();

    }

    @Then("User Enters  name, email, subject and message")
    public void user_enters_name_email_subject_and_message() {

        contactUsFormPage.nameForContact.sendKeys("user_name");
        contactUsFormPage.emailForContact.sendKeys(ConfigReader.getProperty("login_email"));
        contactUsFormPage.subjectForContact.sendKeys("changing the dress");
        contactUsFormPage.messageForContact.sendKeys("I want to turn back the dress and buy a new one");


    }
    @Then("user Uploads file")
    public void user_uploads_file() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User clicks OK button")
    public void user_clicks_ok_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Users Click {string} button and verify that landed to home page successfully")
    public void users_click_button_and_verify_that_landed_to_home_page_successfully(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }






}
