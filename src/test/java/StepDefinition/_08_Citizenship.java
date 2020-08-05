package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _08_Citizenship {

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContent dialogContent = new DialogContent();

    @Then("^Navigate to Citizenship page$")
    public void navigate_to_Citizenship_page()  {

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("Citizenships");

    }

    @When("^User create a Citizenship name as \"([^\"]*)\" short name as \"([^\"]*)\"$")
    public void user_create_a_Citizenship_name_as_short_name_as(String name, String shortName){

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , name);
        dialogContent.findElementAndSendKeysFunction("shortNameInput" , shortName);
        dialogContent.findElementAndClickFunction("SaveButton");

    }

    @But("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyElementContainText("ErrorMessage" , "Error");
    }

    @And("^Click on close button$")
    public void clickOnCloseButton() {

        dialogContent.findElementAndClickFunction("closeDialog");

    }
}
