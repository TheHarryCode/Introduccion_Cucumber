package steps;

import static org.junit.Assert.assertTrue;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ListPage;

public class ListSteps {
    
    ListPage listPage = new ListPage();

    @Given("^Como usuario navego a la pagina de la lista$")
    public void navigate(){
        listPage.navigate();
    }

    @When("^Busco un (.+) en la lista$")
    public void EnviarCriterioBusqueda(String state){
        listPage.escribirCriterioBusqueda(state);
    }

    @Then("^Comparo si la (.+) esta en lista$")
    public void evaluarContenidoLista(String city){
        List<String> lista = listPage.getAllSearchResult();
        boolean afirmacion = lista.contains(city);
        assertTrue("No esta contenida la ciudad dentro del listado", afirmacion);
    }
}
