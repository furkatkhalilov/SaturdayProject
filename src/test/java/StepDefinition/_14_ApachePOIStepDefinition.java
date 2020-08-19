package StepDefinition;

import PageObjectModel.DialogContent;
import Utilities.ReadExcelReusableMethods;
import cucumber.api.java.en.When;

public class _14_ApachePOIStepDefinition {

    DialogContent dialogContent = new DialogContent();
    String path1 = "src/main/resources/LoginData.xlsx";
    ReadExcelReusableMethods readExcelReusableMethods = new ReadExcelReusableMethods(path1 , "DiologContent");

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
}
