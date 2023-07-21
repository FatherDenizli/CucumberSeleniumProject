package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
              //  "html:target/default-cucumber-reports.html",
                "html:target/cucumber-reports",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml",
//                "rerun:target/failedRerun.txt",
              //  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome=true,
        features = "./src/test/resources/features",
        glue = {"stepdefinitions","hooks" },
        dryRun = false,
        tags = "@Registration"
)
public class Runner {
}
//@Registration
//@login_user_page
//@Logoutuser
