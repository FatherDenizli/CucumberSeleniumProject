package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationMainPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class VerifyAllProductsStepDefinitions {


    AutomationMainPage automationMainPage=new AutomationMainPage();

    ProductsPage productsPage=new ProductsPage();

    @Then("User clicks on {string} button to see products")
    public void user_clicks_on_button_to_see_products(String string) {

        automationMainPage.productsButton.click();
    }
    @Then("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
      productsPage.allProductsText.isDisplayed();
    }
    @Then("The products list is visible")
    public void the_products_list_is_visible() {
   productsPage.productListCategory.isDisplayed();
    }
    @Then("Click on {string} of first product")
    public void click_on_of_first_product(String string) {
      Actions actions=new Actions(Driver.getAlertDriver());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(10);
        JSUtils.clickElementByJS(productsPage.firstProduct);
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("(//a[text()='View Product'])[1]")).click();

    }
    @Then("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {

        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getAlertDriver().getTitle().contains("Product Details"));

    }
    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {

        productsPage.productInformation.isDisplayed();

        productsPage.category.isDisplayed();
        productsPage.availability.isDisplayed();
        productsPage.condition.isDisplayed();
        productsPage.brand.isDisplayed();



    }










}
