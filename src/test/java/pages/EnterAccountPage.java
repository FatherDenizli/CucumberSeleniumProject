package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EnterAccountPage {

    public void EnterAccountPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath ="//b[text()='ENTER ACCOUNT INFORMATION']")
     public WebElement enterAccountText;

    @FindBy(id="id_gender1")
    public WebElement maleRadioButton;













}
