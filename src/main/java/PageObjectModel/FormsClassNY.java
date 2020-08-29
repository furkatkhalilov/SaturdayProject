package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsClassNY extends _01_ParentClass{

    public FormsClassNY(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


//----------------------------//

    @FindBy(xpath = "//mat-select[@aria-label='Academic Period']")
    private WebElement academicPeriod;

    @FindBy(css = "ms-text-field[formcontrolname='firstName']>input")
    private WebElement FirstNameInput;

    //---------------------------//

    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "academicPeriod":
                myElement =academicPeriod;
                break;

        }

        clickFunction(myElement);

    }




    public void findElementAndSendKeysFunction(String ElementName , String value){

        switch (ElementName){

            case "FirstNameInput":
                myElement = FirstNameInput;
                break;

        }

        sendKeysFunction(myElement ,value );

    }


}

