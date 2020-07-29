package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class _04_CountriesStep {

    WebDriver driver;

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContent dialogContent = new DialogContent();


    @And("^Navigate to countries page$")
    public void navigate_to_countries_page(){

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CountriesButton");

    }

    @When("^User create a country$")
    public void user_create_a_country(){

        dialogContent.findElementAndClickFunction("AddButton");



    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

    }
}
