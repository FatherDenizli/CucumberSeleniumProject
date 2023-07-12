package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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


    @FindBy(xpath ="//*[@name='expiry_month']")
    public WebElement expiryMonthBox;

    @FindBy(xpath ="//*[@name='expiry_year']")
    public WebElement expiryYearBox;

    @FindBy(xpath ="//*[@data-qa='pay-button']")
    public WebElement submitPayButton;


    @FindBy(xpath ="//*[text()='Order Placed!']")
    public WebElement orderPlacedText;


//Test Case 17: Remove Products From Cart

    @FindBy(xpath ="//table/tbody/tr[1]/td[6]")
    public WebElement xRemoveButton;

    @FindBy(xpath ="//*[text()='Cart is empty!']")
    public WebElement cartEmptyText;

//Test Case 20: Search Products and Verify Cart After Login

    @FindBy(xpath ="//table//tbody//tr/td[4]")
    public List<WebElement> orderQuantity;

    @FindBy(xpath ="//table/tbody/tr/td[1]")
    public List<WebElement> productPictureInCart;






}
