package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationMainPage;
import pages.ProductsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class ViewCategoryBrandsProductsStepDefs {

 AutomationMainPage automationMainPage=new AutomationMainPage();

 ProductsPage productsPage=new ProductsPage();

    @Then("Verify that categories are visible on left side bar")
    public void verify_that_categories_are_visible_on_left_side_bar() {
        automationMainPage.categoryText.isDisplayed();

    }
    @Then("User click on {string} category")
    public void user_click_on_category(String string) {

        automationMainPage.womenCategoryButton.click();
    }

    @Then("User clicks on any category link under {string} category, for example: Dress")
    public void user_clicks_on_any_category_link_under_category_for_example_dress(String string) {
      automationMainPage.dressButton.click();
    }


    @Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
    public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {

        automationMainPage.categoryText.isDisplayed();
        ReusableMethods.waitFor(3);
        productsPage.womenDressText.isDisplayed();
        System.out.println(productsPage.womenDressText.getText());
        ReusableMethods.waitFor(3);

    }

    @Then("clicks on any sub-category link of {string} category On left side bar")
    public void clicks_on_any_sub_category_link_of_category_on_left_side_bar(String string) {
      automationMainPage.menCategoryButton.click();
      automationMainPage.tshirtsTextButton.click();

    }
    @Then("Verify that user is navigated to that category page")
    public void verify_that_user_is_navigated_to_that_category_page() {

        productsPage.menTshirtsText.isDisplayed();
    }

//    Test Case 19: View & Cart Brand Products

    @Then("Verify that Brands are visible on left side bar")
    public void verify_that_brands_are_visible_on_left_side_bar() {
       productsPage.brandsText.isDisplayed();

    }



    @Then("user  Clicks any brand name to navigate brands")
    public void userClicksAnyBrandNameToNavigateBrands() {
     JSUtils.clickElementByJS(productsPage.mastAndHarbourButton);
    }

    @Then("Verify that user is navigated to brand page and brand products are displayed")
    public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
        ReusableMethods.waitFor(3);
        Actions actions=new Actions(Driver.getDriver());
         actions.moveToElement(productsPage.mastAndHarbourText) ;
         productsPage.mastAndHarbourText.isDisplayed();
        ReusableMethods.waitFor(3);

    }
    @Then("On left side bar, click on any other brand link")
    public void on_left_side_bar_click_on_any_other_brand_link() {
        ReusableMethods.waitFor(3);
     JSUtils.clickElementByJS(productsPage.kookieKidsButton);
        ReusableMethods.waitFor(3);
    }
    @Then("Verify that user is navigated to that brand page and can see products")
    public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
        ReusableMethods.waitFor(3);
     productsPage.allenSollyJuniorText.isDisplayed();
        ReusableMethods.waitFor(3);

        System.out.println(productsPage.allenSollyJuniorText.getText());
    }

}
