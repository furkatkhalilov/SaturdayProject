package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReleaseNotesPage extends _01_ParentClass{

    public ReleaseNotesPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindAll({
            @FindBy(css = "div[class='ng-star-inserted'] li")
    })
    private List<WebElement> releaseNotesPoints;

    public void CheckTwoLists(){

//        scrollToElement(releaseNotesPoints.get(releaseNotesPoints.size()-1));
//        If I do not add the -1 it give array index out of bound exception

        for (WebElement e1:releaseNotesPoints){
            scrollToElement(e1);
            System.out.println(e1.getText());
        }
    }


}
