package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpLoginPage {

    public SignUpLoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//h2[contains(text(),' Signup!')]")
    public WebElement signUpText;

    @FindBy(xpath ="//input[@data-qa='signup-name']")
    public WebElement nameInputBox;

    @FindBy(xpath ="//input[@data-qa='signup-email']")
    public WebElement emailInputBox;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement signUpButton;

    @FindBy(xpath ="//*[@data-qa='account-created']")
    public WebElement accountCreatedText;










}
