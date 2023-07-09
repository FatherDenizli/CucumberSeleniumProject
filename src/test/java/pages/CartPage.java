package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {


    public CartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath ="//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath ="//*[text()='Address Details']")
    public WebElement adresDetailsHead;

    @FindBy(xpath ="//*[@class='form-control']")
    public WebElement comentAboutOrderTextbox;

    @FindBy(xpath ="//*[text()='Place Order']")
    public WebElement placeHolderButton;


    @FindBy(xpath ="//*[@name='name_on_card']")
    public WebElement nameOnCardBox;

    @FindBy(xpath ="//*[@name='card_number']")
    public WebElement cardNumberBox;

    @FindBy(xpath ="//input[@name='cvc']")
    public WebElement cvcNumberBox;

//    @FindBy(xpath ="//*[text()='ex. 311']")
//    public WebElement cvcNumberBox;


    @FindBy(xpath ="//*[@name='expiry_month']")
    public WebElement expiryMonthBox;

    @FindBy(xpath ="//*[@name='expiry_year']")
    public WebElement expiryYearBox;

    @FindBy(xpath ="//*[@data-qa='pay-button']")
    public WebElement submitPayButton;



    @FindBy(xpath ="//*[text()='Order Placed!']")
    public WebElement orderPlacedText;
//*[@id="success_message"]/div













}
