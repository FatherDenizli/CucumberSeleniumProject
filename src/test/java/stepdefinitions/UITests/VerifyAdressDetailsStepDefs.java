package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationMainPage;
import pages.CartPage;
import pages.EnterAccountPage;
import utilities.ConfigReader;

public class VerifyAdressDetailsStepDefs {

    EnterAccountPage enterAccountPage=new EnterAccountPage();

    AutomationMainPage automationMainPage=new AutomationMainPage();

    CartPage cartpage=new CartPage();
    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verify_that_the_delivery_address_is_same_address_filled_at_the_time_registration_of_account() {

        Assert.assertEquals(ConfigReader.getProperty("Adress1_2"),cartpage.deliveryAddress.getText());

    }
    @Then("Verify that the billing address is same address filled at the time registration of account")
    public void verify_that_the_billing_address_is_same_address_filled_at_the_time_registration_of_account() {

        Assert.assertEquals(ConfigReader.getProperty("Adress1_2"),cartpage.billingAddress.getText());

    }

    @Then("Verify ACCOUNT DELETED! and click Continue button to go on")
    public void verifyACCOUNTDELETEDAndClickContinueButtonToGoOn() {
        automationMainPage.accountDeletedText2.isDisplayed();
        automationMainPage.continueButton2.click();
    }
}
