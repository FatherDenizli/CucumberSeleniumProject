package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EnterAccountPage {

    public EnterAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[text()='Enter Account Information']")
    public WebElement enterAccountText;


    @FindBy(css="#id_gender1")
    public WebElement maleRadioButton;


    @FindBy(xpath="//*[@data-qa='password']")
    public WebElement UserPassword;

    @FindBy(id="days")
    public WebElement day;

    @FindBy(id="months")
    public WebElement month;

    @FindBy(id="years")
    public WebElement year;

    @FindBy(id="uniform-newsletter")
    public WebElement newsLetterCheckbox;

    @FindBy(id="first_name")
    public WebElement firstName;

    @FindBy(id="last_name")
    public WebElement lastName;

    @FindBy(id="company")
    public WebElement companyName;

    @FindBy(id="address1")
    public WebElement address1;















}
