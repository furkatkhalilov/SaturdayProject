package StepDefinition;

import PageObjectModel.DialogContent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _11_DataTableStepDefinition {

    DialogContent dialogContent = new DialogContent();

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
    public void click_on_the_element_in_the_dialog_content_class(DataTable elementName){

        List<String> elementsToClick = elementName.asList(String.class);

        for(int i =0 ; i<elementsToClick.size() ; i++){

            dialogContent.findElementAndClickFunction(elementsToClick.get(i));

        }

    }
}
