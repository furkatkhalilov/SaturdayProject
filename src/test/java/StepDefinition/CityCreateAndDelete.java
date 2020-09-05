package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.DialogContentNY;
import PageObjectModel.FormsClassNY;
import PageObjectModel.LeftNavElementsNY;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class CityCreateAndDelete {

    WebDriver driver;

    LeftNavElementsNY leftNavElements = new LeftNavElementsNY();
    DialogContentNY dialogContent = new DialogContentNY();
    FormsClassNY formsClass= new FormsClassNY();


    @When("^Delete City \"([^\"]*)\"$")
    public void deleteCity(String cityName)  {

        dialogContent.waitAllElementsVisible("nameList");
        dialogContent.waitAllElementsVisible("deleteButton");

        dialogContent.editAndDeleteFunction(cityName,"delete");

        dialogContent.findElementAndClickFunction("yesButton");

    }


    @When("^Navigate to countries page from City page$")
    public void navigateToCountriesPageeee() {

        leftNavElements.findElementAndClickFunction("CountriesButton");

    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {

        dialogContent.findElementAndVerifyElementContainText("ErrorMessage" , "Error");


    }

    @And("^Create City \"([^\"]*)\"$")
    public void createCity(String cityName) {
        dialogContent.waiting(1000);
        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.waitAllElementsVisible("nameList");
        formsClass.findElementAndClickFunction("CountryButtonInTheForm");
        formsClass.findElementAndSendKeysFunction("cityInput", cityName);
        formsClass.clickOnTheLastItemInTheList("ListOfCountries");
        dialogContent.findElementAndClickFunction("SaveButton");
    }
}
