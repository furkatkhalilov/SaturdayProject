package StepDefinition;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    @Before
    public void before(){


    }

    @After
    public void after(Scenario scenario){


        if (scenario.isFailed()) {

            Date timeStamp = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
            String dateInString = formatter.format(timeStamp);

            String scenarioName = scenario.getName().replaceAll(" ", "_");

            TakesScreenshot screeShot = ((TakesScreenshot) Driver.getDriver());
            File sourceFile = screeShot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("target/extent-report/screenshots/" + scenarioName + "_"
                    + dateInString + ".png");

            try {
                FileUtils.copyFile(sourceFile, destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Reporter.addScreenCaptureFromPath("screenshots/" +
                        scenarioName +"_" + dateInString +".png");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }




        Driver.QuitDriver();


    }



}

