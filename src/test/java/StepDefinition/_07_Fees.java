package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _07_Fees {

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContent dialogContent = new DialogContent();


    @And("^Navigate to Fees page$")
    public void navigate_to_Fees_page(){

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("Fees");


    }

    @When("^User create a country name as \"([^\"]*)\" code as \"([^\"]*)\" integration code as \"([^\"]*)\" priority as \"([^\"]*)\"$")
    public void user_create_a_country_name_as_code_as_integration_code_as_priority_as(String name, String code, String integrationCode, String priority){

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , name);
        dialogContent.findElementAndSendKeysFunction("CodeInput" , code);
        dialogContent.findElementAndSendKeysFunction("IntegrationCode" , integrationCode);
        dialogContent.findElementAndSendKeysFunction("PriorityInput" , priority);
        dialogContent.findElementAndClickFunction("SaveButton");

    }

}
