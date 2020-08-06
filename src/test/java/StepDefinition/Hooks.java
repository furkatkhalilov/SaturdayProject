package StepDefinition;

import Utilities.Driver;
import cucumber.api.java.After;

public class Hooks {

//    This after annotation will run the code after each scenario
//      We should import it from cucumber.api.java
    @After
    public void after(){
        
        Driver.QuitDriver();

    }

}
