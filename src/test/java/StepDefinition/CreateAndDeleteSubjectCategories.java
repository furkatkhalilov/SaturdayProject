package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElementsNY;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreateAndDeleteSubjectCategories {

    LeftNavElementsNY leftNavElementsNY = new LeftNavElementsNY();
    DialogContent dialogContent = new DialogContent();



    @Then("^Click in the leftnav class$")
    public void click_in_the_leftnav_class(DataTable elementName) {
        List<String> listOfElements = elementName.asList(String.class);
        for (int i = 0; i < listOfElements.size(); i++) {
            leftNavElementsNY.findElementAndClickFunction(listOfElements.get(i));
        }

    }

    @Then("^Click on element inside dialog content$")
    public void click_on_element_inside_dialog_content(DataTable element) {
        dialogContent.waiting(1000);
        List<String> listOfElements = element.asList(String.class);


        for (int i = 0; i < listOfElements.size(); i++) {
            dialogContent.findElementAndClickFunction(listOfElements.get(i));
        }
    }
    @Then("^Fill out fields$")
    public void fill_out_fields(DataTable elements) {
        List<List<String>> listOfElements = elements.asLists(String.class);

        for (int i = 0; i < listOfElements.size(); i++) {
            dialogContent.findElementAndSendKeysFunction(listOfElements.get(i).get(0),listOfElements.get(i).get(1));
        }
    }
    @When("^User delete \"([^\"]*)\"$")
    public void user_delete(String categoryName) {
        dialogContent.editAndDeleteFunction(categoryName, "delete");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

        dialogContent.findElementAndVerifyElementContainText("SuccessfullyMessage" , "successfully");

    }
    @And("^Select \"([^\"]*)\" from dropdown list$")
    public void selectFromDropdownList(String subjectCategory) {

        dialogContent.clickOnElementInTheDropdown(subjectCategory);

    }

    @And("^Randomly select from \"([^\"]*)\" dropdown list$")
    public void randomlySelectFromDropdownList(String elementName) {
        dialogContent.findElementAndClickFunction("Style");
        dialogContent.clickOnRandomElementInTheDropdown();
    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        dialogContent.findElementAndVerifyElementContainText("ErrorMessage" , "Error");

    }

    @Then("^Navigate back$")
    public void navigateBack() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dialogContent.navigateBack();
    }
}
