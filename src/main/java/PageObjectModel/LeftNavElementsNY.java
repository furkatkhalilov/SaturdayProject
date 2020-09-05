package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavElementsNY extends _01_ParentClass{


    public LeftNavElementsNY(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //----------------------------------------//
    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement Setup1Button;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement ParametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement CountriesButton;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement CityButton;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement educationSetupButton;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subjectButton;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement HumanResourcesSetup;

    @FindBy(xpath = "//span[text()='Position Salary']")
    private WebElement PositionSalary;

    @FindBy(xpath = "//span[text()='Positions']\n")
    private WebElement Position;



    //------------------------------------------//



    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "Setup1Button":
                myElement =Setup1Button;
                break;
            case "ParametersButton":
                myElement =ParametersButton;
                break;
            case "CountriesButton":
                myElement =CountriesButton;
                break;
            case "CityButton":
                myElement =CityButton;
                break;
            case "educationButton":
                myElement =educationButton;
                break;
            case "educationSetupButton":
                myElement =educationSetupButton;
                break;
            case "subjectCategories":
                myElement =subjectCategories;
                break;
            case "subjectButton":
                myElement =subjectButton;
                break;
            case "HumanResources":
                myElement = HumanResources;
                break;
            case "HumanResourcesSetup":
                myElement = HumanResourcesSetup;
                break;
            case "PositionSalary":
                myElement = PositionSalary;
                break;
            case "Position":
                myElement = Position;
                break;

        }
        clickFunction(myElement);

    }



}
