package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.SampleTestPage;

public class SamplePageTest {
    
    SampleTestPage sampleTestPage = new SampleTestPage();

    @Given("^navego al sitio web$")
    public void navigate(){
        sampleTestPage.navigateTo();
    }

    @When("^Selecciono un valor en el dropdown$")
    public void SelectValue(){
        sampleTestPage.SelectValue("Economy");
    }
}
