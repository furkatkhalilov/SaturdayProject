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
        }

        clickFunction(myElement);

    }


}
