package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsClass extends _01_ParentClass{

    public FormsClass(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//mat-select[@aria-label='Academic Period']")
    private WebElement academicPeriod;

        @FindBy(xpath = "(//mat-option)[1]")
        private WebElement Option1;

        @FindBy(xpath = "(//mat-option)[2]")
        private WebElement Option2;

        @FindBy(xpath = "(//mat-option)[3]")
        private WebElement Option3;

        @FindBy(xpath = "(//mat-option)[4]")
        private WebElement Option4;

    @FindBy(xpath = "//mat-select[@aria-label='Grade Level']")
    private WebElement gradeLevel;

    @FindBy(xpath = " //mat-select[@aria-label='Document Type']")
    private WebElement documentType;

    @FindBy(css = "mat-select[formcontrolname='gender']")
    private WebElement genderDropdown;

    @FindBy(xpath = "//mat-select[@aria-label='School Department']")
    private WebElement schoolDepartmentDropdown;

    @FindBy(xpath = "//mat-select[@aria-label='Section']")
    private WebElement sectionDropdown;

    @FindBy(css = "mat-select[aria-label='Citizenship']")
     private WebElement citizenshipDropdown;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement secondButtonInExtraInfo;

    @FindBy(xpath = "//ms-add-button[@tooltip='GENERAL.BUTTON.ADD_REPRESENTATIVE']//button")
    private WebElement addButtonForRepresantitive;

    @FindBy(xpath = "//mat-select[@aria-label='Representative']")
    private WebElement RepresentativeDropdown;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement popUpAddButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItButton;


    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "academicPeriod":
                myElement =academicPeriod;
                break;
            case "Option1":
                myElement =Option1;
                break;
            case "Option2":
                myElement =Option2;
                break;
            case "Option3":
                myElement =Option3;
                break;
            case "Option4":
                myElement =Option4;
                break;
            case "gradeLevel":
                myElement =gradeLevel;
                break;
            case "documentType":
                myElement =documentType;
                break;
            case "genderDropdown":
                myElement =genderDropdown;
                break;
            case "schoolDepartmentDropdown":
                myElement =schoolDepartmentDropdown;
                break;
            case "sectionDropdown":
                myElement =sectionDropdown;
                break;
            case "citizenshipDropdown":
                myElement =citizenshipDropdown;
                break;
            case "secondButtonInExtraInfo":
                myElement =secondButtonInExtraInfo;
                break;
            case "addButtonForRepresantitive":
                myElement =addButtonForRepresantitive;
                break;
            case "RepresentativeDropdown":
                myElement =RepresentativeDropdown;
                break;
            case "popUpAddButton":
                myElement =popUpAddButton;
                break;
            case "gotItButton":
                myElement =gotItButton;
                break;

        }

        clickFunction(myElement);

    }

    @FindBy(css = "ms-text-field[formcontrolname='firstName']>input")
    private WebElement FirstNameInput;

    @FindBy(css = "ms-text-field[formcontrolname='lastName']>input")
    private WebElement LastNameInput;

    @FindBy(css = "input[formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(css = "input[formcontrolname='firstName']")
    private WebElement popUpFirstName;

    @FindBy(css = "input[formcontrolname='lastName']")
    private WebElement popUpLastName;

    @FindBy(css = " input[formcontrolname='phone']")
    private WebElement popUpPhoneNumber;


    public void findElementAndSendKeysFunction(String ElementName , String value){

        switch (ElementName){

            case "FirstNameInput":
                myElement = FirstNameInput;
                break;

            case "LastNameInput":
                myElement = LastNameInput;
                break;
            case "documentNumber":
                myElement = documentNumber;
                break;
            case "popUpFirstName":
                myElement = popUpFirstName;
                break;
            case "popUpLastName":
                myElement = popUpLastName;
                break;
            case "popUpPhoneNumber":
                myElement = popUpPhoneNumber;
                break;
        }

        sendKeysFunction(myElement ,value );

    }


}

    /*
        stale element reference

     */