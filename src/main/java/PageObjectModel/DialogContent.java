package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends _01_ParentClass{

    public DialogContent(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//ms-add-button//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement NameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement CodeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement PriorityInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement IntegrationCode;

    @FindBy(css = "ms-save-button>button")
    private WebElement SaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement yesButton;

//    //table/tbody/tr/td[2]
//        tr is a row of the table and td is a colomn of the table
//         //table/tbody/tr[5]/td[2] row 5 column 2

    @FindAll({
           @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(css = "ms-delete-button>button")
    })
    private List<WebElement> deleteButton;

    WebElement myElement;

//    In this method we are going to click on the element.
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
            case "closeDialog":
                myElement = closeDialog;
                break;



        }

        clickFunction(myElement);
    }

//      In this method we are going to sendKeys to element
        public void findElementAndSendKeysFunction(String ElementName , String value){

//        Find the element in this class and send the element to sendKeysFunction
            switch (ElementName){
                case "NameInput":
                    myElement = NameInput;
                    break;
                case "CodeInput":
                    myElement = CodeInput;
                    break;
                case "IntegrationCode":
                    myElement = IntegrationCode;
                    break;
                case "PriorityInput":
                    myElement = PriorityInput;
                    break;
                case "shortNameInput":
                    myElement = shortNameInput;
                    break;

            }
//            Create a method in parentClass which is going to wait first and sendKeys
            sendKeysFunction(myElement , value);

        }

//      Create one method finding the element
        public void findElementAndVerifyElementContainText(String elementName , String WhichText){

            switch (elementName){

                case "SuccessfullyMessage":
                    myElement=SuccessfullyMessage;
                    break;
                case "ErrorMessage":
                    myElement=ErrorMessage;
                    break;

            }

//            Creating one method in parent class which is get the element and it is containing the WhichText(parameter)

            ElementContainsText(myElement , WhichText);

        }

        /*
            This method is going to click on edit button according to names.
         */
        public void editAndDeleteFunction(String nameCountry , String editOrDelete)  {

            waiting(1000);

            List<WebElement> whichList = new ArrayList<>();

//        With this if else statement we are able to handle edit and delete functionality together.
            if(editOrDelete.equalsIgnoreCase("edit")){
                whichList=editButtonList;
            }else{
                whichList=deleteButton;
            }

            for(int i =0; i<nameList.size() ;i++){
                if(nameList.get(i).getText().equals(nameCountry)){
                    clickFunction(whichList.get(i));

                }
            }
        }
}


 /*
        Find All vs Find by

            With a find all we can use multiple locators

        As like as ::

            @FindAll({
               @FindBy(xpath = "//table/tbody/tr/td[2]"),
               @FindBy(xpath = "//table/tbody/tr/td[3]")
        })
       private List<WebElement> nameList;

          @FindBy(xpath = "//table/tbody/tr/td[2]")
            private List<WebElement> nameList2;




    so you are saying nameList and nameList2 are the same.
        it means FindBy doesnt return the first occurence but returns all occurences ?

         @FindBy(xpath = "//table/tbody/tr/td[2]")
            private WebElement nameList;


     */