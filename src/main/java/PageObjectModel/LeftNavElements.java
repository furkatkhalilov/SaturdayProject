package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNavElements extends _01_ParentClass{

    /*
        Finish the Countries.feature
        Parent class
            Click function --> wait for element then click on the element
            SendKys function --> wait for element then send keys on the element

     */

     /*
        In the cucumber each element in the page object model should be private
            and each element should have a method to click on it or send keys.
     */

    public LeftNavElements(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement Setup1Button;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement ParametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement CountriesButton;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement Nationalities;


    /*
        We can create couple methods which is finding the element in the class

             And calling the method from the parent class.

     */

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
            case "Nationalities":
                myElement =Nationalities;
                break;

        }

//    Call the method from the parent class.
        clickFunction(myElement);

    }




    /*
        One parent method --> click function , sendKeysfunction
     */

//      If you have 100 elements then you need a 100 methods. This is way one.
//    public void ClickOnSetup1Button(){
//        Setup1Button.click();
//    }

}
