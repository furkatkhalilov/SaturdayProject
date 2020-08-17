package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

//     This class will handle different browsers

//    createInstance and if the browserName is chrome then open chrome browser if the browser is firefox then open firefox driver

    public static WebDriver createInstance(String browserName){

        WebDriver driver;

        if(browserName==null){
            browserName="chrome";
        }

        switch (browserName){

             default:
                 WebDriverManager.chromedriver().setup(); // this line is for System.setproperty
                 driver = new ChromeDriver();
                 break;

             case "firefox":
                 WebDriverManager.firefoxdriver().setup(); // this line is for System.setproperty
                 driver = new FirefoxDriver();
                 break;

         }

         return driver;

    }

}
