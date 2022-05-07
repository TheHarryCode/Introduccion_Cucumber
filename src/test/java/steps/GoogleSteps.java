package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^Como usuario navego a google$")
    public void navigateTo(){
        google.navigateToGoogle();
    }

    @When("^Deseo realizar una busqueda de algo$")
    public void escribirBusqueda(){
        google.writeSearch("Bogota");
    }

    @And("^Doy click en el boton buscar$")
    public void clickBuscar(){
        google.clickSearch();
    }

    @Then("^Encuentro un resultado$")
    public void resultado(){
        boolean result = google.resultado();
        assertTrue("El primer resultado esperado no se visualiza", result);
    }


}
