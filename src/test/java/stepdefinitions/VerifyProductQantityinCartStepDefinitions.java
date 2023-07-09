package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class VerifyProductQantityinCartStepDefinitions {


    ProductsPage productsPage = new ProductsPage();

    Actions actions = new Actions(Driver.getDriver());

    @Then("User click {string} for any product on home page")
    public void user_click_for_any_product_on_home_page(String string) {
        ReusableMethods.waitFor(5);

        actions.moveToElement(productsPage.viewProduct16).build().perform();
        JSUtils.clickElementByJS(productsPage.viewProduct16);
        ReusableMethods.waitFor(5);

    }

    @Then("Verify product detail is opened")
    public void verify_product_detail_is_opened() {

        productsPage.productInformation.isDisplayed();

    }

    @Then("User increases quantity to {int}")
    public void user_increases_quantity_to(Integer int1) {

        actions.moveToElement(productsPage.quantity).build().perform();

        //  productsPage.quantity.sendKeys(Keys.DELETE);
//
//   productsPage.quantity.sendKeys("4");

        int quantity = 1;

        for (int i = 0; i < 4; i++) {

            actions.sendKeys(Keys.ARROW_UP).click().perform();
            quantity++;
        }


//        actions.moveToElement(productsPage.quantity).click().perform();
//        int quantity=1;
//        while (quantity<=3){
//            actions.sendKeys(Keys.ARROW_UP).perform();
//            quantity++;
//        }

    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {

        String quantity = productsPage.quantity.getText();

        int qu = Integer.parseInt(quantity);

        Assert.assertEquals(4, qu);


    }

    @Then("User clicks  Add to cart button to add cart")
    public void userClicksAddToCartButtonToAddCart() {

        // actions.moveToElement(productsPage.addToCartInviewProduct).build().perform();
        ReusableMethods.waitFor(5);

        JSUtils.clickElementByJS(productsPage.addToCartInviewProduct);
        ReusableMethods.waitFor(5);

    }


    @Then("Verify that product is displayed in cart page")
    public void verifyThatProductIsDisplayedInCartPage() {

        String str=productsPage.exactQuantity.getText();

        int quantity=Integer.parseInt(str);

        System.out.println(quantity);

        Assert.assertEquals(4, quantity);

    }
}