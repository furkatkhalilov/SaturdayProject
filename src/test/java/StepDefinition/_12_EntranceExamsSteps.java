package StepDefinition;

import PageObjectModel.FormsClass;
import PageObjectModel.LeftNavElements;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.List;

public class _12_EntranceExamsSteps {

    LeftNavElements leftNavElements = new LeftNavElements();
    FormsClass formsClass = new FormsClass();


    @And("^Click in the leftnav class$")
    public void click_in_the_leftnav_class(DataTable ElementFromFeature) throws Throwable {

        List<String> eachElement =  ElementFromFeature.asList(String.class);

        for(int i =0 ; i<eachElement.size() ; i++){

            leftNavElements.findElementAndClickFunction(eachElement.get(i));

        }

    }


    @When("^Click in the formsClass class$")
    public void click_in_the_formsClass_class(DataTable ElementFromFeature) {

        List<String> eachElement =  ElementFromFeature.asList(String.class);

        for(int i =0 ; i<eachElement.size() ; i++){

            formsClass.findElementAndClickFunction(eachElement.get(i));

        }

    }
}
