package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.ProductsPage;

import java.util.List;

public class SearchProductStepDefinitions {


    ProductsPage productsPage=new ProductsPage();


    @Then("User enters product name in search input and click search button")
    public void user_enters_product_name_in_search_input_and_click_search_button() {
        productsPage.searchBox.sendKeys("women");

        productsPage.submitSearch.click();



    }
    @Then("Verify {string} is visible in searchbox")
    public void verify_is_visible_in_searchbox(String string) {

        productsPage.searchProductsText.isDisplayed();

    }
    @Then("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {

        List<WebElement> list=productsPage.singleProducts;
        Assert.assertFalse(list.isEmpty());
        System.out.println(list.size());


    }













}
