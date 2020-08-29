package StepDefinition;

import PageObjectModel.DialogContentNY;
import PageObjectModel.FormsClassNY;
import PageObjectModel.LeftNavElementsNY;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class CityCreateAndDelete {

    WebDriver driver;

    LeftNavElementsNY leftNavElements = new LeftNavElementsNY();
    DialogContentNY dialogContent = new DialogContentNY();
    FormsClassNY formsClass= new FormsClassNY();

    @When("^Navigate to City$")
    public void navigateToCity() {

        leftNavElements.findElementAndClickFunction("CityButton");

    }


    @And("^Create City \"([^\"]*)\" within \"([^\"]*)\"$")
    public void createCityWithin(String cityName, String countryName) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dialogContent.findElementAndClickFunction("AddButton");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        formsClass.findElementAndClickFunction("CountryButtonInTheForm");
        formsClass.findElementAndSendKeysFunction("cityInput", cityName);
        formsClass.findElementFromTheList("ListOfCountries", countryName);
        dialogContent.findElementAndClickFunction("SaveButton");



            }


    @When("^Delete City \"([^\"]*)\"$")
    public void deleteCity(String cityName)  {


        System.out.println(
                dialogContent.nameList.get(0).getText() + "  "+
                        dialogContent.nameList.get(1).getText() + "  "+
                dialogContent.nameList.get(2).getText() + "  " + dialogContent.nameList.get(3).getText());

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
}
