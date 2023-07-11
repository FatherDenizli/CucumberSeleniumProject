package stepdefinitions.UITests;

import io.cucumber.java.en.Then;
import pages.TestCasesPage;

public class TestCasesPageStepDefinitions {



    TestCasesPage testCasesPage=new TestCasesPage();
    @Then("User  Click on {string} button")
    public void user_click_on_button(String TestCasesButton) {
        testCasesPage.testCasesButton.click();

    }
    @Then("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {

        testCasesPage.testCaseSuccesfullText.isDisplayed();

    }






}
