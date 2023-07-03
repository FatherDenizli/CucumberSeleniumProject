package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPage {

    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath ="(//*[text()='All Products'])[1]")
    public WebElement allProductsText;


    @FindBy(xpath ="//*[text()='Category']")
    public WebElement productListCategory;

    @FindBy(xpath ="(//*[text()='View Product'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath ="//div[@class='product-information']")
    public WebElement productInformation;

    @FindBy(xpath ="//*[text()='Category: Women > Tops']")
    public WebElement category;

    @FindBy(xpath ="//*[text()='Availability:']")
    public WebElement availability;

    @FindBy(xpath ="//*[text()='Condition:']")
    public WebElement condition;

    @FindBy(xpath ="//*[text()='Brand:']")
    public WebElement brand;






}
