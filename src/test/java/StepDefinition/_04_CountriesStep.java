package StepDefinition;

import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class _04_CountriesStep {


    WebDriver driver;

    @And("^Navigate to countries page$")
    public void navigate_to_countries_page(){

        driver = Driver.getDriver();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("(//span[text()='Setup'])[1]")).click();

    }

    @When("^User create a country$")
    public void user_create_a_country(){

    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

    }
}
