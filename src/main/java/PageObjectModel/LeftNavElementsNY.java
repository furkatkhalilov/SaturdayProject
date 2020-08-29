package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavElementsNY extends _01_ParentClass {


    public LeftNavElementsNY() {

        PageFactory.initElements(Driver.getDriver(), this);
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



    //------------------------------------------//
// Education menu elements
    @FindBy(xpath = "//span[text()='Education']")
    private WebElement educationButton;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement educationSetupButton;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subjectButton;








    WebElement myElement;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "Education":
                myElement = educationButton;
                break;
            case "Setup":
                myElement = educationSetupButton;
                break;
            case "Subject Categories":
                myElement = subjectCategories;
                break;
            case "Subject":
                myElement = subjectButton;
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


        }
        clickFunction(myElement);

    }



}
