package Runners;

    /*
        Runners are helping us to run multiple feature files in the same time.
     */

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

//      These tags are coming from the runner class and runner is finding which scenario to run with these tags
        tags = {"@SmokeTest"},
        features={"src/test/java/FeatureFiles"}, //the location of feature files.
        glue={"StepDefinition"}, // location of the step definition
        dryRun = false // Is checking is my feature files are created in the step definition package

)

public class _02_SmokeTestRunnerWithTag extends AbstractTestNGCucumberTests {
}


    /*
        Task 1:
            Create a regression runner and add entrance exam scenario 1 , citizenship scenario 1 , 2 , 3

     */