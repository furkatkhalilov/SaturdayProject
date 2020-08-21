package PageObjectModel;

import Utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ReleaseNotesPage extends _01_ParentClass{

    public ReleaseNotesPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindAll({
            @FindBy(css = "div[class='ng-star-inserted'] li")
    })
    private List<WebElement> releaseNotesPoints;

    public void CheckTwoLists(ArrayList<String> expectedList){

//        scrollToElement(releaseNotesPoints.get(releaseNotesPoints.size()-1));
//        If I do not add the -1 it give array index out of bound exception


        for (int i = 0 ;i<releaseNotesPoints.size() ; i++){

            scrollToElement(releaseNotesPoints.get(i));

            System.out.println(releaseNotesPoints.get(i).getText() + "from the website");
            System.out.println(expectedList.get(i) + "from the Excel");

            Assert.assertEquals(releaseNotesPoints.get(i).getText(),expectedList.get(i) );

        }
    }

}
