package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationMainPage {


      public AutomationMainPage() {
          PageFactory.initElements(Driver.getDriver(),this);
      }

    @FindBy(xpath ="//a[text()=' Signup / Login']")
    public WebElement signUpLoginButton;

    @FindBy(xpath ="//*[text()=' Home']")
    public WebElement homePageText;

    @FindBy(xpath ="//*[text()='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(xpath ="//input[@data-qa='login-email']")
    public WebElement email;

    @FindBy(xpath ="//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath ="//button[@data-qa='login-button']")
    public WebElement loginButton;


    @FindBy(xpath ="//*[text()=' Logged in as ']")
    public WebElement loggedInAs;

    @FindBy(xpath ="//*[text()=user_name]")
    public WebElement user;

    @FindBy(xpath ="//*[text()=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath ="//*[text()='Account Deleted!']")
    public WebElement accountDeletedText;

    @FindBy(xpath ="//*[text()='Your email or password is incorrect!']")
    public WebElement emailorPasswordIncorrect;















}
