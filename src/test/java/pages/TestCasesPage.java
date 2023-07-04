package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCasesPage {


    public TestCasesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[text()=' Test Cases']")
    public WebElement testCasesButton;

    @FindBy(xpath ="//*[text()='Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:']")
    public WebElement testCaseSuccesfullText;


    @FindBy(xpath ="//input[@data-qa='signup-name']")
    public WebElement nameInputBox;

    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public WebElement emailInputBox;

    @FindBy(xpath ="//button[@data-qa='signup-button']")
    public WebElement signUpButton;



}
