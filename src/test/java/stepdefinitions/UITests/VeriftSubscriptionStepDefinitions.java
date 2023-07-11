package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class VeriftSubscriptionStepDefinitions {


    AutomationMainPage automationMainPage=new AutomationMainPage();

    Actions actions=new Actions(Driver.getDriver());


    @Then("User Scrolls down to footer")
    public void user_scrolls_down_to_footer() {
        actions.moveToElement(automationMainPage.footer).build().perform();

    }
    @Then("Verify text {string}")
    public void verify_text(String string) {

        automationMainPage.subscriptionText.isDisplayed();

    }
    @Then("User enters email address in input and click arrow button")
    public void user_enters_email_address_in_input_and_click_arrow_button() {



        automationMainPage.emailBox.sendKeys(ConfigReader.getProperty("login_email"),Keys.ENTER);

    }

    @Then("Verify success message  {string} is visible")
    public void verify_success_message_is_visible(String string) {

        automationMainPage.successfullySubscribedText.isDisplayed();

    }















}
