package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import pages.AutomationMainPage;
import pages.ProductsPage;
import utilities.ReusableMethods;

public class ViewCategoryProductsStepDefs {

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
}
