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








}
