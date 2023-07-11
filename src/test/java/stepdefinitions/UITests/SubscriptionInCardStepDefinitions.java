package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import pages.AutomationMainPage;

public class SubscriptionInCardStepDefinitions {

     AutomationMainPage automationMainPage=new AutomationMainPage();
    @Then("User clicks {string}  button")
    public void user_clicks_button(String string) {

  automationMainPage.cartButton.click();

    }










}
