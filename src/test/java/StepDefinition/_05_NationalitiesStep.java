package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class _05_NationalitiesStep {

    DialogContent dialogContent = new DialogContent();
    LeftNavElements leftNavElements =new LeftNavElements();

    @And("^Navigate to Nationalities page$")
    public void navigate_to_Nationalities_page()  {

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("Nationalities");

    }

    @When("^User create a Nationalities$")
    public void user_create_a_Nationalities() {

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , "AliCountry");
        dialogContent.findElementAndClickFunction("SaveButton");

    }


}
