package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverPrevious {

    /*
        Why we are creating this driver?

            Because we need to use one driver in every step definition and in the page classes.
                To do that first option send the driver by constructor.

                Second way create one driver it is a static.

        Because we are using one driver in the project.
            This is one concept name is Singleton driver.

            INTERVIEW QUESTION:
            What is singleton or what is singleton driver?
                I am using singleton in my current project. My driver is a singleton and whenever I need
                    a driver I am taking from my Driver class.

     */

    private static WebDriver driver;

    public static WebDriver getDriver() {

//        if the driver is == null then create a driver if not then give me current driver
        if (driver == null) {
            WebDriverManager.chromedriver().setup(); // this line is for System.setproperty
            driver = new ChromeDriver();
        }

        return driver;

    }



    /*
        We are going to call this method after each scenario.

     */

    public static void QuitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null; // if we dont type this line next scenario will fail error is NoSuchSessionException
        }
    }

//    do we need instead of void "Webdriver"
}