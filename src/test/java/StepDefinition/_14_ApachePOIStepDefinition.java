package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.ReleaseNotesPage;
import Utilities.ReadExcelReusableMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _14_ApachePOIStepDefinition {

    DialogContent dialogContent = new DialogContent();
    String path1 = "src/main/resources/LoginData.xlsx";
    ReadExcelReusableMethods readExcelReusableMethods = new ReadExcelReusableMethods(path1 , "DiologContent");
    ReleaseNotesPage releaseNotesPage = new ReleaseNotesPage();

    @When("^User create a citizenship with ApachePOI$")
    public void userCreateACitizenshipWithApachePOI() {

        dialogContent.findElementAndClickFunction("AddButton");

        String name = readExcelReusableMethods.getSpecificData("Name",1);

        dialogContent.findElementAndSendKeysFunction("NameInput" , name);

        String shortName  = readExcelReusableMethods.getSpecificData("ShortName",1);

        dialogContent.findElementAndSendKeysFunction("shortNameInput" , shortName);

        dialogContent.findElementAndClickFunction("SaveButton");

    }

    @When("^User delete a citizenship with ApachePOI$")
    public void userDeleteACitizenshipWithApachePOI() {

        dialogContent.editAndDeleteFunction(readExcelReusableMethods.getSpecificData("Name",1) , "delete");

        dialogContent.findElementAndClickFunction("yesButton");

    }

    @When("^User create a Fees with ApachePOI$")
    public void userCreateAFeesWithApachePOI() {

        dialogContent.findElementAndClickFunction("AddButton");

        String name = readExcelReusableMethods.getSpecificData("Name",1);

        dialogContent.findElementAndSendKeysFunction("NameInput" , name);

        String code = readExcelReusableMethods.getSpecificData("Code",1);

        dialogContent.findElementAndSendKeysFunction("CodeInput" , code);

        String integrationCode = readExcelReusableMethods.getSpecificData("Integration Code",1);

        dialogContent.findElementAndSendKeysFunction("IntegrationCode", integrationCode);

        String Priority = readExcelReusableMethods.getSpecificData("Priority",1);

//      Priority = 1.0

//        We got the number from the excel as 0.0 and website is not accept it so we change the 0.0 to 0
        Priority = Priority.substring(0 , Priority.length()-2);

        dialogContent.findElementAndSendKeysFunction("PriorityInput", Priority);

        dialogContent.findElementAndClickFunction("SaveButton");
    }

    @When("^User delete a Fees with ApachePOI$")
    public void userDeleteAFeesWithApachePOI() {

        String name = readExcelReusableMethods.getSpecificData("Name",1);

        dialogContent.editAndDeleteFunction(name , "delete");

        dialogContent.findElementAndClickFunction("yesButton");

    }

    @And("^Verify all the points as expected in the release notes page$")
    public void verifyAllThePointsAsExpectedInTheReleaseNotesPage() {

        releaseNotesPage.CheckTwoLists();
    }
}
