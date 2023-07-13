package stepdefinitions.UITests;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class AddReviewOnProductStepDefs {

    ProductsPage productsPage=new ProductsPage();
    Faker faker=new Faker();
    @Then("User clicks on View Product button to review")
    public void userClicksOnViewProductButtonToReview() {
        JSUtils.scrollIntoViewJS(productsPage.viewProduct1);
        productsPage.viewProduct1.click();




    }

    @Then("Verify Write Your Review is visible on Product review")
    public void verifyWriteYourReviewIsVisibleOnProductReview() {
        ReusableMethods.waitFor(3);
        productsPage.writeYourReviewText.isDisplayed();
        ReusableMethods.waitFor(3);
        System.out.println(productsPage.writeYourReviewText.getText());
    }

    @Then("User enters name, email and review on review Input Box")
    public void userEntersNameEmailAndReviewOnReviewInputBox() {

        ReusableMethods.waitFor(3);

        productsPage.nameBoxOnReiew.sendKeys(faker.name().fullName());

        ReusableMethods.waitFor(3);
        productsPage.emailBoxOnReiew.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(3);

        productsPage.reviewTextBox.sendKeys("hi");
    }
    @Then("User  clicks {string} button")
    public void user_clicks_button(String string) {

       JSUtils.clickElementByJS(productsPage.reviewSubmitButton);

    }
    @Then("Verify success message {string} is seen")
    public void verify_success_message_is_seen(String string) {

         productsPage.thankYouReviewText.isDisplayed();
        System.out.println(productsPage.thankYouReviewText.getText()) ;




    }



}
