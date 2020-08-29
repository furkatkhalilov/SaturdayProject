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


        }
        clickFunction(myElement);

    }



}
