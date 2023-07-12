package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationMainPage;
import pages.CartPage;
import pages.ProductsPage;
import utilities.ConfigReader;
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

        automationMainPage.signUpLoginButton.click();//click Signup / Login

        automationMainPage.email.sendKeys(ConfigReader.getProperty("login_email"));
        automationMainPage.loginPassword.sendKeys(ConfigReader.getProperty("login_password"));

        automationMainPage.loginButton.click();
    }

    @Then("User again goes to Cart page")
    public void user_again_goes_to_cart_page() {

      automationMainPage.cartButton.click();

    }
    @Then("Verify that those products are visible in cart after login as well")
    public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {

        List <WebElement> list=cartPage.productPictureInCart;

        for(WebElement w:list){

            Assert.assertTrue(w.isDisplayed());
        }
        System.out.println(list.size());

    }















}
