package Runners;

    /*
        Runners are helping us to run multiple feature files in the same time.
     */

import cucumber.api.CucumberOptions;

@CucumberOptions(

        features={"src/test/java/FeatureFiles"}, //the location of feature files.
        glue={"StepDefinition"}, // location of the step definition
        dryRun = false // Is checking is my feature files are created in the step definition package

)

public class SmokeTestRunner {
}
