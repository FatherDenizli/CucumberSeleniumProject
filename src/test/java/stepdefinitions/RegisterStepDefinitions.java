package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationMainPage;
import pages.EnterAccountPage;
import pages.SignUpLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.sql.SQLOutput;

public class RegisterStepDefinitions {


     AutomationMainPage automationMainPage=new AutomationMainPage();

     SignUpLoginPage signUpLoginPage=new SignUpLoginPage();

     EnterAccountPage enterAccountPage=new EnterAccountPage();

     Faker faker=new Faker();

    @Given("User is on automation page")
    public void user_is_on_automation_page() {
        Driver.getDriver().get(ConfigReader.getProperty("automationexercises_url"));
    }
    @Then("User verifies that home page is visible successfully")
    public void user_verifies_that_home_page_is_visible_successfully() {
        String actualData=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals( "https://automationexercise.com/",actualData );

    }

    @Then("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
         automationMainPage.signUpLoginButton.click();
    }
    @Then("User verifies {string} is visible")
    public void user_verifies_is_visible(String string) {
      Assert.assertTrue(signUpLoginPage.signUpText.isDisplayed());
    }
    @Then("User enters name and email address")
    public void user_enters_name_and_email_address() {
        Faker faker1 =new Faker();
        signUpLoginPage.nameInputBox.sendKeys(faker1.name().name());
        signUpLoginPage.emailInputBox.sendKeys(faker1.internet().emailAddress());

    }
    @Then("User clicks {string} button")
    public void user_clicks_button(String string) {
        signUpLoginPage.signUpButton.click();

    }

    @Then("User verifies that {string} is visible")
    public void user_verifies_that_is_visible(String string) {
         ReusableMethods.waitFor(5);
          String a=enterAccountPage.enterAccountText.getText();
         System.out.println(a);
          enterAccountPage.enterAccountText.isDisplayed();
          ReusableMethods.waitForVisibility(enterAccountPage.enterAccountText,15).isDisplayed();

  //      ReusableMethods.waitForVisibility(enterAccountPage.enterAccountText,15).isDisplayed();
//        WebElement enterAccount = enterAccountPage.enterAccountText; //Driver.getDriver().findElement(By.xpath("//*[text()='Enter Account Information']"));
//        String expectedUser1 = "ENTER ACCOUNT INFORMATION";
//        String actualUser1 = enterAccount.getText();
//        Assert.assertEquals(expectedUser1, actualUser1);



    }
    @Then("User fills details: Title, Name, Email, Password, Date of birth")
    public void user_fills_details_title_name_email_password_date_of_birth() {
       ReusableMethods.waitFor(3);


//        JSUtils.clickElementByJS(enterAccountPage.maleRadioButton);
//        ReusableMethods.waitFor(3);
       enterAccountPage.maleRadioButton.click();


        Assert.assertTrue(( enterAccountPage.maleRadioButton.isSelected()));//Verifing the red button is selected

     enterAccountPage.UserPassword.sendKeys(faker.internet().password());
        Select select1=new Select(enterAccountPage.day);
        select1.selectByIndex(23);
        Select select2=new Select(enterAccountPage.month);
        select2.selectByIndex(7);
        Select select3=new Select(enterAccountPage.year);
        select3.selectByIndex(2);

        enterAccountPage.firstName.sendKeys(faker.name().firstName());
        enterAccountPage.lastName.sendKeys(faker.name().lastName());
        enterAccountPage.companyName.sendKeys(faker.company().name());
        enterAccountPage.address1.sendKeys(faker.address().fullAddress());







    }
}
