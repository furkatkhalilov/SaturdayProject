package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;

@CucumberOptions(

        plugin = {
          "html:target/cucumber-Html-Report",
          "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportEnd2End.html" // to generate a extend report we need this plugin
        },
        tags = {"@ExcelTemplate"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        dryRun = false

)

public class ExcelTemplateScenario extends AbstractTestNGCucumberTests {

        @BeforeClass
        @Parameters("browser")
        public void beforeMethod(String browser){
                Driver.browserName.set(browser);
        }

                @AfterClass
        public static void afterClass(){

                Reporter.loadXMLConfig(new File("src/test/java/FeatureFiles/extentReport.xml"));
                Reporter.setSystemInfo("User Name" , "New York Campus");
                Reporter.setSystemInfo("Application Name", "Basqar-Excel Template Features");
                Reporter.setSystemInfo("Operating System Type" , System.getProperty("os.name"));
                Reporter.setSystemInfo("Environment", "QA");
                Reporter.setTestRunnerOutput("Test execution Cucumber report");
        }
}

