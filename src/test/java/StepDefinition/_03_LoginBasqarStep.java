package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_LoginBasqarStep {

    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {

        /*
            Set property - open browser and navigate to website
         */

        WebDriverManager.chromedriver().setup(); // this line is for System.setproperty
        driver = new ChromeDriver();

        driver.get("https://test.basqar.techno.study/");

    }

    @When("^Enter the username and password and click on login button$")
    public void enter_the_username_and_password_and_click_on_login_button(){

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

    }
}
