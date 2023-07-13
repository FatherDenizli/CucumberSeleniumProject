package stepdefinitions.UITests;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationMainPage;
import pages.CartPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class AddCartFromRecommendedItemStepDefs {

    AutomationMainPage automationMainPage=new AutomationMainPage();
    Actions actions=new Actions(Driver.getDriver());

    ProductsPage productsPage=new ProductsPage();

    CartPage cartPage=new CartPage();
    @Then("User scrolls to bottom of page")
    public void user_scrolls_to_bottom_of_page() {

         actions.moveToElement(automationMainPage.allRightsReservedText).build().perform();

    }
    @Then("Verify {string} are visible")
    public void verify_are_visible(String string) {

        automationMainPage.recommendedItemText.isDisplayed();

    }
    @Then("Click on Add To Cart on Recommended product")
    public void clickOnAddToCartOnRecommendedProduct() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(10);

  //      ReusableMethods.waitFor(10);
      JSUtils.clickElementByJS(automationMainPage.recommendedProduct11);
        ReusableMethods.waitFor(10);

    }
    @Then("User clicks on View Cart button to see products in Cart")
    public void userClicksOnViewCartButtonToSeeProductsInCart() {
        JSUtils.clickElementByJS(productsPage.viewCart);
    }
    @Then("Verify that  product from recommended is displayed in cart page")
    public void verifyThatProductFromRecommendedIsDisplayedInCartPage() {

        cartPage.recommendedProductPicture.isDisplayed();
    }
}
