package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationMainPage;
import pages.CartPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;

public class SearchProductsVerifyStepDefs {

    AutomationMainPage automationMainPage=new AutomationMainPage();

    ProductsPage productsPage=new ProductsPage();

    CartPage cartPage=new CartPage();
    @Then("Verify {string} input box is visible")
    public void verify_input_box_is_visible(String string) {
    productsPage.searchProductsInputBox.isDisplayed();
    }





    @Then("User adds those products to cart")
    public void user_adds_those_products_to_cart() {
        List<WebElement> list=productsPage.addToCart;

        for(int i=0; i<list.size();i++){
             i=i+1;
           // Actions actions=new Actions(Driver.getDriver());

            //actions.moveToElement(w);
            ReusableMethods.waitFor(1);
            JSUtils.clickElementByJS(productsPage.addToCart.get(i));
            ReusableMethods.waitFor(1);
            JSUtils.clickElementByJS(productsPage.continueButton);
            ReusableMethods.waitFor(1);


        }

    }

    @Then("User clicks {string} button and verify that products are visible in cart")
    public void user_clicks_button_and_verify_that_products_are_visible_in_cart(String string) {
        automationMainPage.cartButton.click();

     List<WebElement> list=cartPage.orderQuantity;

        int counter=0;

        for (WebElement w : list){
             int qa=Integer.parseInt(w.getText());

             counter++;
            }
        Assert.assertEquals(counter,list.size());
        System.out.println(counter);
    }
    @Then("User Click {string} button and submit login details")
    public void user_click_button_and_submit_login_details(String string) {

    }















}
