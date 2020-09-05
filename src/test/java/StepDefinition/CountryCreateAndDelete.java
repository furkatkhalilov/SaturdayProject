package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.DialogContentNY;
import PageObjectModel.LeftNavElementsNY;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import java.util.List;


public class CountryCreateAndDelete {

    WebDriver driver;

    LeftNavElementsNY leftNavElementsNY = new LeftNavElementsNY();
    DialogContentNY dialogContent = new DialogContentNY();


    @Then("^Click in the leftnav class$") // TODO: 9/2/2020 DELETE WHEN MERGING
    public void click_in_the_leftnav_class(DataTable elementName) {
        List<String> listOfElements = elementName.asList(String.class);
        for (int i = 0; i < listOfElements.size(); i++) {
            leftNavElementsNY.findElementAndClickFunction(listOfElements.get(i));
        }

    }


    @When("^User create a country$")
    public void user_create_a_country(){

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , "UnitedStates");
        dialogContent.findElementAndSendKeysFunction("CodeInput" , "100200");
        dialogContent.findElementAndClickFunction("SaveButton");

    }

//    @Then("^Click on element inside dialog content$") // TODO: 9/2/2020 DELETE WHEN MERGING
//    public void click_on_element_inside_dialog_content(DataTable element) {
//        dialogContent.waiting(1000);
//        List<String> listOfElements = element.asList(String.class);
//
//
//        for (int i = 0; i < listOfElements.size(); i++) {
//            dialogContent.findElementAndClickFunction(listOfElements.get(i));
//        }
//    }
//
//    @Then("^Fill out fields$") // TODO: 9/2/2020 DELETE WHEN MERGING
//    public void fill_out_fields(DataTable elements) {
//        List<List<String>> listOfElements = elements.asLists(String.class);
//
//        for (int i = 0; i < listOfElements.size(); i++) {
//            dialogContent.findElementAndSendKeysFunction(listOfElements.get(i).get(0),listOfElements.get(i).get(1));
//        }
//    }


    @Then("^Success message should be displayed$") // TODO: 9/2/2020 Check and match, then delete. Added additional method wait until invisible
    public void success_message_should_be_displayed() {

        dialogContent.findElementAndVerifyElementContainText("SuccessfullyMessage" , "successfully");
        dialogContent.waiting(500);

    }


    @Then("^Delete or Edit Function$") // TODO: 9/2/2020 change in the other group step definition, then delete
    public void deleteFunction(DataTable elements) {
        List<List<String>> listOfElements = elements.asLists(String.class);

        for (int i = 0; i < listOfElements.size(); i++) {
            dialogContent.editAndDeleteFunction(listOfElements.get(i).get(0),listOfElements.get(i).get(1) );

        }




    }



}
