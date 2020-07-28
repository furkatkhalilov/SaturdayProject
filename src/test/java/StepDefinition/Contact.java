package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Contact {

    @When("^Enter firstname lastname contact information and click on save button$")
    public void enter_firstname_lastname_contact_information_and_click_on_save_button(){

        System.out.println("Enter firstname lastname contact information");
    }

    @Then("^Success message should be displayed$")
    public void success_message_should_be_displayed() {

        System.out.println("Success message");
    }

    @And("^Enter firstname lastname contact information$")
    public void enter_firstname_lastname_contact_information() throws Throwable {

        System.out.println("Enter firstname lastname contact information");
    }

    @When("^Click on save button$")
    public void click_on_save_button() throws Throwable {

        System.out.println("Click on save button");
    }


}
