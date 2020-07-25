package StepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Day2Step {

    @When("^Delete the contact$")
    public void delete_the_contact() throws Throwable {

        System.out.println("delete the contact");

    }

    @Then("^Contact should be deleted$")
    public void contact_should_be_deleted() throws Throwable {

        System.out.println("Contact should be deleted");
    }
}
