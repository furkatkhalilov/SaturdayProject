package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    /*
        Not able to create same step in multiple step definition classes.

     */
    @Given("^Navigate to website$")
    public void navigate_to_website()  {

        System.out.println("Navigating to website ");
    }

    @When("^Enter the username and password$")
    public void enter_the_username_and_password() {

        System.out.println("enter the username and password");

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully(){

        System.out.println("Success message is displayed");
    }

    @Given("^Navigate to some website$")
    public void navigate_to_some_website() throws Throwable {

        System.out.println("Navigate to some website");
    }

    @Given("^Click on contact button$")
    public void click_on_contact_button() throws Throwable {

        System.out.println("Click on contact butto");
    }


}
