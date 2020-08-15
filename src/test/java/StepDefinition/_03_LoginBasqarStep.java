package StepDefinition;

import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _03_LoginBasqarStep {

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {

        /*
            Set property - open browser and navigate to website
         */

        driver = Driver.getDriver();

        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();

    }

    @When("^Enter the username and password and click on login button$")
    public void enter_the_username_and_password_and_click_on_login_button(){

        driver.findElement(By.id("mat-input-0")).sendKeys("daulet2030@gmail.com");
        driver.findElement(By.id("mat-input-1")).sendKeys("TechnoStudy123@");

        driver.findElement(By.cssSelector("button[aria-label='LOGIN']")).click();

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

        WebElement verifyLogin = driver.findElement(By.xpath("//span[text()='Dashboard']"));
        Assert.assertNotNull(verifyLogin);

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
