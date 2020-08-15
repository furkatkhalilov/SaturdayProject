package Utilities;

import cucumber.api.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

//     this is the driver class for running the code with multiple browsers

    /*
      Thread Local
        Thread local will multiply our static variable.
     */

//    Thread local will create a multiple driver for us.
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();

//    With this string we will decide which browser to open
    public static String browserName;

//    If the threadDriver is null then create a driver for it. Taking a browser from driverfactory
    public static WebDriver getDriver(){

        if(threadDriver.get()==null){
            setWebDriver(DriverFactory.createInstance(browserName));
        }
        return threadDriver.get();
    }
//    If the threadDriver is null then fill the null point with a driver.
    public static void setWebDriver(WebDriver driver){

        threadDriver.set(driver);
    }


//    Quit the driver in this method
    public static void QuitDriver(){

        if(threadDriver.get()!=null){

            threadDriver.get().quit();
            WebDriver driver= threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }

    }





//    do we need instead of void "Webdriver"
}
