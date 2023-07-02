package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsFormPage {

    public ContactUsFormPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//*[text()=' Contact us']")
    public WebElement contactUsButon;

    @FindBy(xpath ="//*[text()='Get In Touch']")
    public WebElement getInTouchText;




    @FindBy(xpath ="//*[@data-qa='name']")
    public WebElement nameForContact;


    @FindBy(xpath ="//*[@data-qa='email']")
    public WebElement emailForContact;

    @FindBy(xpath ="//*[@data-qa='subject']")
    public WebElement subjectForContact;

//    @FindBy(xpath ="//*[text()='Your Message Here']")
//    public WebElement messageForContact;

    @FindBy(css ="#message")
    public WebElement messageForContact;

    @FindBy(xpath ="//input[@name='upload_file']")
    public WebElement choseFileButton;

    @FindBy(xpath ="//input[@data-qa='submit-button']")
    public WebElement submitButton;


    @FindBy(xpath ="//*[text()='Success! Your details have been submitted successfully.']")
    public WebElement successMessage ;

    @FindBy(xpath ="//*[text()=' Home']")
    public WebElement homeButton ;





}
