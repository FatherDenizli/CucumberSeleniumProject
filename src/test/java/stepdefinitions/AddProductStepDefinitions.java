package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class AddProductStepDefinitions {

   ProductsPage productsPage=new ProductsPage();

    Actions actions=new Actions(Driver.getDriver());
    @Then("User hovers over first product and click {string}")
    public void user_hovers_over_first_product_and_click(String string) {


        actions.moveToElement(productsPage.addToCart1).build().perform();
        ReusableMethods.waitFor(3);

        JSUtils.clickElementByJS(productsPage.addToCart1);
        ReusableMethods.waitFor(3);

    }

    @Then("User clicks {string} button to continue")
    public void user_clicks_button_to_continue(String string) {

      JSUtils.clickElementByJS(productsPage.continueButton );
        ReusableMethods.waitFor(3);
    }
    @Then("User hovers over second product and click {string}")
    public void user_hovers_over_second_product_and_click(String continueButton) {

        actions.moveToElement(productsPage.addToCart2).build().perform();
        ReusableMethods.waitFor(3);

        JSUtils.clickElementByJS(productsPage.addToCart2);
        ReusableMethods.waitFor(3);

    }
    @Then("User click {string} button")
    public void user_click_button(String string) {


        JSUtils.clickElementByJS(productsPage.viewCart);
        ReusableMethods.waitFor(3);

    }
    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {

       int producedSize= productsPage.productImages.size();
        ReusableMethods.waitFor(3);
        Assert.assertEquals(2, producedSize);
        ReusableMethods.waitFor(3);

    }
    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {

        int totalPrice=0;



              for( WebElement w: productsPage.pricesList){

               //   String p=w.getText().replaceAll("[^0-9]","");

               //   int price=Integer.parseInt(p);
                  totalPrice=totalPrice+Integer.parseInt(w.getText().replaceAll("[^0-9]",""));

                  System.out.println(totalPrice);


        }
        Assert.assertEquals(900,totalPrice);

    }
















}
