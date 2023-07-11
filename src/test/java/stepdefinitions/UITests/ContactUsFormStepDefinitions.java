package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import pages.AutomationMainPage;
import pages.ContactUsFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        contactUsFormPage.subjectForContact.sendKeys("sending back the dress");
        contactUsFormPage.messageForContact.sendKeys("I want to turn back the dress and buy a new one");


    }
    @Then("user Uploads file")
    public void user_uploads_file() {


       String userHOME=System.getProperty("user.home");
       String pathOfFile = userHOME + "/Desktop/damaged_dress.jpg";
       contactUsFormPage.choseFileButton.sendKeys(pathOfFile);

     }
    @Then("User clicks {string} button to upload file")
    public void user_clicks_button_to_upload_file(String string) {
        contactUsFormPage.submitButton.click();
    }
    @Then("User clicks OK button")
    public void user_clicks_ok_button() {


        ReusableMethods.waitFor(5);
       Alert ok=Driver.getAlertDriver().switchTo().alert();
        ReusableMethods.waitFor(5);
       ok.accept();



    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        contactUsFormPage.successMessage.isDisplayed();
    }
    @Then("Users Click {string} button and verify that landed to home page successfully")
    public void users_click_button_and_verify_that_landed_to_home_page_successfully(String string) {
       contactUsFormPage.homeButton.click();
    }






}
