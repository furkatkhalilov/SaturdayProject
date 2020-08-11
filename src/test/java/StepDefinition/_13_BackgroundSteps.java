package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _13_BackgroundSteps {


    @Given("^Navigateo to our website$")
    public void navigateo_to_our_website() throws Throwable {

        System.out.println("Navigateo to our website");
    }

    @When("^Enter the username and password$")
    public void enter_the_username_and_password() throws Throwable {
        System.out.println("Enter the username and password");
    }

    @Then("^User should login as expected$")
    public void user_should_login_as_expected() throws Throwable {
        System.out.println("User should login as expected");
    }

    @Then("^Navigate to contaact page$")
    public void navigate_to_contaact_page() throws Throwable {
        System.out.println("Navigate to contaact page");
    }

    @When("^User create a contact$")
    public void user_create_a_contact() throws Throwable {
        System.out.println("User create a contact");
    }

    @Then("^Contact should be created$")
    public void contact_should_be_created() throws Throwable {
        System.out.println("Contact should be created");
        System.out.println();
    }

    @When("^User edit the contact$")
    public void user_edit_the_contact() throws Throwable {
        System.out.println("User edit the contact");
    }

    @Then("^Contact should be edited$")
    public void contact_should_be_edited() throws Throwable {
        System.out.println("Contact should be edited");
        System.out.println();
    }

    @When("^User delete the contact$")
    public void user_delete_the_contact() throws Throwable {
        System.out.println("User delete the contact");
    }

    @Then("^Contact should be delete$")
    public void contact_should_be_delete() throws Throwable {
        System.out.println("Contact should be deletet");
        System.out.println();
    }

}
