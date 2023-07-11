package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import static base_url.AutomationExercisesBaseUrl.automationExercisesSetUp;


public class Hook {

    @Before
    public void setUpScenario() {
//        System.out.println("Before Method");
    }
    @After
    public void tearDownScenario(Scenario scenario) {
//        System.out.println("After Method");
        if (scenario.isFailed()) {//capturing the screenshot when a sceraio fails and attaching it to the report
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName() + "");
            Driver.closeDriver();
        }
    }
    @Before("@Get_all_product_list")
    public void beforeApi(){

        automationExercisesSetUp();

    }





}

