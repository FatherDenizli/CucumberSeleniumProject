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

    @FindBy(linkText ="Logout")
    public WebElement logout;

    @FindBy(xpath ="//*[text()='Email Address already exist!']")
    public WebElement emailAlreadyExist;


    @FindBy(xpath ="//*[text()=' Products']")
    public WebElement productsButton;



//Verift Subscription
    @FindBy(xpath = "//footer[@id='footer']")
    public WebElement footer;

    @FindBy(xpath ="//h2[text()='Subscription']")
    public WebElement subscriptionText;

    @FindBy(xpath="//*[@id='susbscribe_email']")
    public WebElement emailBox;

    @FindBy(id="susbscribe")
    public WebElement subscriptionSubmitButton;

    @FindBy(xpath ="//*[text()='You have been successfully subscribed!']")
    public WebElement successfullySubscribedText;

//Test Case 11: Verify Subscription in Cart page

    @FindBy(xpath ="//*[text()=' Cart']")
    public WebElement cartButton;


    @FindBy(xpath="//*[@data-qa='continue-button']")
    public WebElement continueButtonAfterDelete;

    @FindBy(xpath ="//*[text()='Category']")
    public WebElement categoryText;

    @FindBy(xpath="//a[@href='#Women']")
    public WebElement womenCategoryButton;


    @FindBy(linkText="DRESS")
    public WebElement dressButton;

    @FindBy(xpath="//a[@href='#Men']")
    public WebElement menCategoryButton;

    @FindBy(xpath ="//*[text()='Tshirts ']")
    public WebElement tshirtsTextButton;

//    Test Case 22: Add to cart from Recommended items
    @FindBy(xpath ="//*[text()='recommended items']")
    public WebElement recommendedItemText;

    @FindBy(xpath ="//*[text()='Copyright © 2021 All rights reserved']")
    public WebElement allRightsReservedText;


    @FindBy(xpath ="(//*[text()='View Product'])[68]")
    public WebElement recommendedProduct1;

    @FindBy(xpath ="(//*[@data-product-id='4'])")
    public WebElement recommendedProduct11;



//    Test Case 23: Verify address details in checkout page\

    @FindBy(xpath ="//*[text()='Account Deleted!']")
    public WebElement accountDeletedText2;

    @FindBy(xpath ="//*[text()='Continue']")
    public WebElement continueButton2;



}
