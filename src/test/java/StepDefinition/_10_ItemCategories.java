package StepDefinition;

import PageObjectModel.DialogContent;
import PageObjectModel.LeftNavElements;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _10_ItemCategories {

    LeftNavElements leftNavElements = new LeftNavElements();
    DialogContent dialogContent = new DialogContent();

    @And("^Navigate to item categories page$")
    public void navigateToItemCategoriesPage() {

        leftNavElements.findElementAndClickFunction("Inventory");
        leftNavElements.findElementAndClickFunction("setupButtonUnderInventory");
        leftNavElements.findElementAndClickFunction("ItemCategory");

    }


    @When("^User create a item categories name as \"([^\"]*)\" user type as \"([^\"]*)\"$")
    public void userCreateAItemCategoriesNameAsUserTypeAs(String itemCategoriesName, String UserType) {

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , itemCategoriesName);
        dialogContent.findElementAndClickFunction("UserTypeDropdown");
        dialogContent.clickOnElementInTheDropdown(UserType);
        dialogContent.findElementAndClickFunction("SaveButton");

    }



}
