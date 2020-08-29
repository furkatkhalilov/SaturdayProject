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

    //------------------------------------------//



    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "Setup1Button":
                myElement =Setup1Button;
                break;


        }
        clickFunction(myElement);

    }



}
