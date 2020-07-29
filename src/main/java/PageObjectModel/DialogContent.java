package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    WebElement myElement;

//    In this method we are going to click on the element.
    public void findElementAndClickFunction(String ElementName){

        switch (ElementName){

            case "AddButton":
                myElement = AddButton;
                break;

        }

        clickFunction(myElement);
    }

//      In this method we are going to sendKeys to element
        public void findElementAndSendKeysFunction(String ElementName , String value){

            switch (ElementName){

                case "NameInput":
                    myElement = NameInput;
                    break;
                case "CodeInput":
                    myElement = CodeInput;
                    break;
            }

//            Create a method in parentClass which is going to wait first and sendKeys


        }

}
