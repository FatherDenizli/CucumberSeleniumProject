package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.AutomationMainPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class RegisterBeforeCheckoutStepDefinition {

    AutomationMainPage automationMainPage=new AutomationMainPage();

    ProductsPage productsPage=new ProductsPage();

    Actions actions=new Actions(Driver.getDriver());


    @Then("User clicks {string} button to to start registtartion")
    public void user_clicks_button_to_to_start_registtartion(String string) {
        automationMainPage.signUpLoginButton.click();

    }
    @Then("User adds products to cart")
    public void user_adds_products_to_cart() {

        actions.moveToElement(productsPage.addToCart20).build().perform();
        ReusableMethods.waitFor(3);

        JSUtils.clickElementByJS(productsPage.addToCart20);
        ReusableMethods.waitFor(3);


    }





}
