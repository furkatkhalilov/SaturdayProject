package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsClassNY extends _01_ParentClass{
    WebElement myElement;
    List<WebElement> myWebElementList;
    public FormsClassNY(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


//----------------------------//

//    @FindBy(xpath = "//mat-select[@aria-label='Academic Period']")
//    private WebElement academicPeriod;

//    @FindBy(css = "ms-text-field[formcontrolname='firstName']>input")
//    private WebElement FirstNameInput;

    @FindAll(
            @FindBy(xpath = "//mat-option[contains(@id, 'mat-option')]")
    )
    private List<WebElement> ListOfCountries;

    @FindBy(xpath = "//mat-form-field[@formgroupname='country']")
    private WebElement CountryButtonInTheForm;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME']/input)[2]")
    private WebElement cityInput;







    //---------------------------//



    public void findElementAndClickFunction(String elementName){

        switch (elementName){

//            case "academicPeriod":
//                myElement =academicPeriod;
//                break;
            case "CountryButtonInTheForm":
                myElement =CountryButtonInTheForm;
                break;

        }

        clickFunction(myElement);

    }




    public void findElementAndSendKeysFunction(String ElementName , String value){

        switch (ElementName){
//
//            case "FirstNameInput":
//                myElement = FirstNameInput;
//                break;
            case "cityInput":
                myElement = cityInput;
                break;

        }

        sendKeysFunction(myElement ,value );

    }

    public void findElementFromTheList(String ElementName, String text){
        switch (ElementName){

            case "ListOfCountries":
                myWebElementList = ListOfCountries;
                break;

        }

        clickOnElementInTheDropdown(myWebElementList, text);

    }
    public void clickOnTheLastItemInTheList (String ElementName){
        switch (ElementName){

            case "ListOfCountries":
                myWebElementList = ListOfCountries;
                break;

        }
        scrollToElement(myWebElementList.get(myWebElementList.size()-1));
        clickOnTheLastElement(myWebElementList);


    }


}

