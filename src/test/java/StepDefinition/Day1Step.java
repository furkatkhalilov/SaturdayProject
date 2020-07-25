package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Day1Step {


    @Given("^Navigate to website$")
    public void navigate_to_website() throws Throwable {

        System.out.println("Navigating to website");

    }

    @Given("^Enter the username and password click on login button$")
    public void enter_the_username_and_password_click_on_login_button() throws Throwable {

        System.out.println("Enter the user name and password");
    }

    @When("^Create a contact$")
    public void create_a_contact() throws Throwable {

        System.out.println("Creating the contact ");
    }

    @Then("^Contact should be created$")
    public void contact_should_be_created() throws Throwable {

        System.out.println("Verifying contact is created");

    }
}
