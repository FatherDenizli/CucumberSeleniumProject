package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import pages.AutomationMainPage;
import utilities.ConfigReader;

public class LoginBeforeCheckOutStepDefinitions {

   AutomationMainPage automationMainPage=new AutomationMainPage();


    @Then("User fills email, password and click {string} button")
    public void user_fills_email_password_and_click_button(String string) {

        automationMainPage.email.sendKeys(ConfigReader.getProperty("login_email"));
        automationMainPage.loginPassword.sendKeys(ConfigReader.getProperty("login_password"));

        automationMainPage.loginButton.click();




    }
}
