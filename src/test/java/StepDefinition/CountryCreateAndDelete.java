package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.DialogContentNY;
import PageObjectModel.LeftNavElements;
import PageObjectModel.LeftNavElementsNY;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CountryCreateAndDelete {

    WebDriver driver;

    LeftNavElementsNY leftNavElements = new LeftNavElementsNY();
    DialogContentNY dialogContent = new DialogContentNY();

    @When("^Navigate to countries page$")
    public void navigate_to_countries_page(){

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("CountriesButton");

    }

    @When("^User create a country$")
    public void user_create_a_country(){

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , "UnitedStates");
        dialogContent.findElementAndSendKeysFunction("CodeInput" , "100200");
        dialogContent.findElementAndClickFunction("SaveButton");

    }

    @When("^User create a country \"([^\"]*)\" and code \"([^\"]*)\"$")
    public void userCreateACountryAndCode(String countryName, String countryCode) {
        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , countryName);
        dialogContent.findElementAndSendKeysFunction("CodeInput" , countryCode);
        dialogContent.findElementAndClickFunction("SaveButton");

    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

        dialogContent.findElementAndVerifyElementContainText("SuccessfullyMessage" , "successfully");

    }


    @When("^Delete country \"([^\"]*)\"$")
    public void deleteCountry(String countryName)  {
        dialogContent.editAndDeleteFunction(countryName,"delete");
        dialogContent.findElementAndClickFunction("yesButton");
    }




}
