package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy(id ="search_product")
    public WebElement searchBox;

    @FindBy(id ="submit_search")
    public WebElement submitSearch;

    @FindBy(xpath ="//*[text()='Searched Products']")
    public WebElement searchProductsText;

    @FindBy(xpath ="//*[@class='single-products']")
    public List<WebElement> singleProducts;

//Test Case 12: Add Products in Cart


    @FindBy(xpath ="(//*[text()='Add to cart'])[1]")
    public WebElement addToCart1;

    @FindBy(xpath ="//*[text()='Continue Shopping']")
    public WebElement continueButton;

    @FindBy(xpath ="(//*[text()='Add to cart'])[3]")
    public WebElement addToCart2;

    @FindBy(xpath ="//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath ="//img[@class='product_image']")
    public List<WebElement> productImages;

    @FindBy(xpath ="//p[@class='cart_total_price']")
    public List<WebElement> pricesList;

//Test Case 13: Verify Product quantity in Cart

    @FindBy(xpath ="(//*[text()='View Product'])[16]")
    public WebElement viewProduct16;


    @FindBy(xpath ="(//*[text()='Add to cart'])[16]")
    public WebElement addToCart3;

    @FindBy(xpath="//*[@id='quantity']")
    public WebElement quantity;

    @FindBy(xpath="//*[@class='btn btn-default cart']")
    public WebElement addToCartInviewProduct;


    @FindBy(xpath="//*[text()='View Cart']")
    public WebElement viewCartInviewProduct;


    @FindBy(xpath="//table//tbody//tr[1]//td[4]")
    public WebElement exactQuantity;















}
