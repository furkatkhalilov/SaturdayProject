package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

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

//    This method will take the element name and element value then enter it in the website
    @When("^User sending the keys in the dialog content class$")
    public void user_create_a_fee(DataTable elements){

        List<List<String>> AllElementsNameAndValue= elements.asLists(String.class);

        for(int i =0 ; i <AllElementsNameAndValue.size() ; i++){

            System.out.println(AllElementsNameAndValue.get(i).get(0));
            System.out.println(AllElementsNameAndValue.get(i).get(1));

            dialogContent.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));

        }

    }

    @And("^Click on the element in the dialog content class$")
    public void click_on_the_element_in_the_dialog_content_class(DataTable elementName) throws Throwable {

            List<String> elementsToClick = elementName.asList(String.class);

            for(int i =0 ; i<elementsToClick.size() ; i++){

                dialogContent.findElementAndClickFunction(elementsToClick.get(i));

            }

    }


}
