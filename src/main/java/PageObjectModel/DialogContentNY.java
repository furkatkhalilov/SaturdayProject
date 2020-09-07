package PageObjectModel;

import PageObjectModel._01_ParentClass;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DialogContentNY extends _01_ParentClass {

    WebElement myElement;
    List<WebElement> listOfWebElement;

    public DialogContentNY(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    //-------------------------//
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement NameInput;

    @FindBy(xpath = "//ms-text-field[@placeholder=\"GENERAL.FIELD.NAME\"]/input")
    private WebElement Name;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(css = "ms-delete-button>button")
    })
    private List<WebElement> deleteButton;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement CodeInput;

    @FindBy(css = "ms-save-button>button")
    private WebElement SaveButton;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement yesButton;

    @FindBy(xpath = "//mat-select[@role='listbox']//span[text()='Subject Category']")
    private WebElement subjectCatDropdown;

    @FindBy(xpath = "//mat-select[@role='listbox']//span[text()='Style']")
    private WebElement subjectStyle;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//input[@placeholder='User Type']")
    private WebElement UserTypeDropDownButton;

    @FindBy(xpath = "//mat-icon[text()='cancel']")
    private WebElement UserIconImg;











    //----------------------//

    public void findElementAndClickFunction(String ElementName){

        switch (ElementName){
            case "AddButton":
                myElement = AddButton;
                break;
            case "SaveButton":
                myElement = SaveButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "subjectCatDropdown":
                myElement = subjectCatDropdown;
                break;
            case "subjectStyle":
                myElement = subjectStyle;
                break;
            case "UserTypeDropDownButton":
                myElement = UserTypeDropDownButton;
                break;
            case "UserIconImg":
                myElement = UserIconImg;
                break;










        }


        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName , String value){

        switch (ElementName){
            case "NameInput":
                myElement = NameInput;
                break;
            case "CodeInput":
                myElement = CodeInput;
                break;
            case "Name":
                myElement = Name;
                break;
            case "shortNameInput":
                myElement = shortNameInput;
                break;





        }

        sendKeysFunction(myElement , value);

    }


    public void findElementAndVerifyElementContainText(String elementName , String WhichText){

        switch (elementName){
            case "SuccessfullyMessage":
                myElement=SuccessfullyMessage;
                break;
            case "ErrorMessage":
                myElement=ErrorMessage;
                break;

        }

        ElementContainsText(myElement , WhichText);

    }


    public void editAndDeleteFunction(String nameCountry , String editOrDelete)  {

        waiting(1500);

        List<WebElement> whichList = new ArrayList<>();

        if(editOrDelete.equalsIgnoreCase("edit")){
            whichList=editButtonList;
        }else{
            whichList=deleteButton;
        }

        waitUntilAllElementVisible(nameList);
        waitUntilAllElementVisible(deleteButton);

        for(int i =0; i<nameList.size() ;i++){
            if(nameList.get(i).getText().equals(nameCountry)){
                clickFunction(whichList.get(i));

            }
        }
    }

    public void clickOnElementInTheDropdown(String whichOption){

        for(int i = 0 ; i<userTypeAllOptions.size() ; i++){

            if(userTypeAllOptions.get(i).getText().contains(whichOption)){

                userTypeAllOptions.get(i).click();
                break;
            }

        }

    }

    public void waitAllElementsVisible(String ListOfWebElement){
        switch (ListOfWebElement) {
            case "nameList":
                listOfWebElement = nameList;
                break;
            case "deleteButton":
                listOfWebElement = deleteButton;
                break;


        }
        waitUntilAllElementVisible(listOfWebElement);
    }

    public void selectAndClickOnRandomElementInDropdown( String ListOfWebElement){
        switch (ListOfWebElement) {
            case "userTypeAllOptions":
                listOfWebElement = userTypeAllOptions;
                break;
        }
        clickOnRandomElementInTheDropdown(listOfWebElement);
    }


}