package Runners;


        /*
            Create one runner class
                run  create edit delete country features
                Fees feature scenario outline

         Runner is helping us to run multiple feature files and also we can choose which scenario to run in the feature file.

         */

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin = {
          "html:target/cucumber-Html-Report",
          "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportEnd2End.html"
        },
        tags = {"@E2E"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinition"},
        dryRun = false

)


public class End2EndScenario extends AbstractTestNGCucumberTests {

}
