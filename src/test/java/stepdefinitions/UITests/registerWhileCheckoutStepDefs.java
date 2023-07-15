package stepdefinitions.UITests;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.Random;


public class registerWhileCheckoutStepDefs {

    AutomationMainPage automationMainPage = new AutomationMainPage();

    Random random = new Random();

    Actions action = new Actions(Driver.getDriver());

    ProductsPage productsPage = new ProductsPage();

    SignUpLoginPage signUpLoginPage = new SignUpLoginPage();

    EnterAccountPage enterAccountPage = new EnterAccountPage();

    CartPage cartPage = new CartPage();

    Faker faker = new Faker();

    @Then("User add products to cart")
    public void user_add_products_to_cart() {
        ReusableMethods.waitFor(3);
        automationMainPage.productsButton.click();
        ReusableMethods.waitFor(3);

        JSUtils.clickElementByJS(productsPage.addToCart20);
        ReusableMethods.waitFor(3);


    }

    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        ReusableMethods.waitFor(5);

        //      JSUtils.clickElementByJS(productsPage.continueButton );
        ReusableMethods.waitFor(3);
        automationMainPage.cartButton.click();
        productsPage.shoppingCartText.isDisplayed();
    }

    @Then("User clicks Proceed To Checkout")
    public void user_clicks_proceed_to_checkout() {

        cartPage.proceedToCheckoutButton.click();
        ReusableMethods.waitFor(3);


    }


    @Then("User clicks Register Login button")
    public void user_clicks_register_login_button() {
        action.moveToElement(productsPage.registerLoginButton).build().perform();
        ReusableMethods.waitFor(10);
        productsPage.registerLoginButton.click();
    }

    @Then("User fills all details in Signup and create account")
    public void user_fills_all_details_in_signup_and_create_account( ) {
        signUpLoginPage.nameInputBox.sendKeys(faker.name().firstName());
        signUpLoginPage.emailInputBox.sendKeys(faker.internet().emailAddress());
        signUpLoginPage.signUpButton.click();

        enterAccountPage.maleRadioButton.click();
        enterAccountPage.UserPassword.sendKeys(faker.internet().password());

        Select select1 = new Select(enterAccountPage.day);
        select1.selectByIndex(23);
        ReusableMethods.waitFor(2);
        Select select2 = new Select(enterAccountPage.month);
        select2.selectByIndex(7);
        ReusableMethods.waitFor(2);
        Select select3 = new Select(enterAccountPage.year);
        select3.selectByValue("2021");
        ReusableMethods.waitFor(2);

        enterAccountPage.firstName.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(2);
        enterAccountPage.lastName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(2);
        enterAccountPage.companyName.sendKeys(faker.company().name());
        ReusableMethods.waitFor(2);
        enterAccountPage.address1.sendKeys(ConfigReader.getProperty("Adress1_2"));
        ReusableMethods.waitFor(5);




        ReusableMethods.waitFor(2);

        Select select4 = new Select(enterAccountPage.countryName);
        select4.selectByValue("Canada");
        ReusableMethods.waitFor(2);

        enterAccountPage.stateName.sendKeys("Ontario");
        ReusableMethods.waitFor(2);
        enterAccountPage.cityName.sendKeys("Toronto");
        ReusableMethods.waitFor(2);
        enterAccountPage.zipCode.sendKeys("M5T 9D6");
        ReusableMethods.waitFor(2);
        enterAccountPage.mobileNumber.sendKeys("+1 (437) 2986754");

        ReusableMethods.waitFor(2);
        enterAccountPage.creatAccountButton.click();


    }

    @Then("Verify {string} and click {string} button")
    public void verify_and_click_button(String string, String string2) {

        signUpLoginPage.accountCreatedText.isDisplayed();

        productsPage.registerContinueButton.click();


    }

    @Then("Verify {string} at top")
    public void verify_at_top(String string) {
        automationMainPage.loggedInAs.isDisplayed();

    }

    @Then("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(cartPage.adresDetailsHead.isDisplayed());

    }

    @Then("User  enters description in comment text area and click {string}")
    public void user_enters_description_in_comment_text_area_and_click(String string) {

        cartPage.comentAboutOrderTextbox.sendKeys("good order");

        cartPage.placeHolderButton.click();

    }

    @Then("User enters payment details: Name on Card, Card Number, CVC, Expiration date")
    public void user_enters_payment_details_name_on_card_card_number_cvc_expiration_date() {

        cartPage.nameOnCardBox.sendKeys(faker.name().fullName());
        cartPage.cardNumberBox.sendKeys(faker.business().creditCardNumber());
        //cartPage.cardNumberBox.sendKeys("345");//Faker.instance().number().digits(3), Keys.TAB)"";
        cartPage.cvcNumberBox.sendKeys(faker.instance().number().digits(3));
        cartPage.expiryMonthBox.sendKeys(ReusableMethods.dateMoth());
        cartPage.expiryYearBox.sendKeys(ReusableMethods.dateYear());


    }

    @Then("User clicks {string} button to complete payment")
    public void user_clicks_button_to_complete_payment(String string) {

        cartPage.submitPayButton.click();


    }

    @Then("Verify success message {string}")
    public void verify_success_message(String string) {
        ReusableMethods.waitFor(10);
        // JSUtils.scrollIntoViewJS(cartPage.orderPlacedText);
        ReusableMethods.waitFor(10);
        cartPage.orderPlacedText.isDisplayed();
        ReusableMethods.waitFor(10);


    }


    @Then("User clicks Continue button to go on")
    public void userClicksContinueButtonToGoOn() {
        JSUtils.clickElementByJS(automationMainPage.continueButtonAfterDelete);
    }
}