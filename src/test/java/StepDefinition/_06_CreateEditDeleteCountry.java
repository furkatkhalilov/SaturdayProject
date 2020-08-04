package StepDefinition;

import PageObjectModel.DialogContent;
import cucumber.api.java.en.When;

public class _06_CreateEditDeleteCountry {

    DialogContent dialogContent = new DialogContent();

    @When("^User edit the \"([^\"]*)\"$")
    public void user_edit_the(String nameOfCountry){

        dialogContent.editFunction(nameOfCountry);

    }



}
