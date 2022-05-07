package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.GridPage;

public class GridSteps {
    
    GridPage grid = new GridPage();

    @Given("^navego a la pagina de la grilla$")
    public void navegar(){
        grid.navigate();
    }

    @Then("^obtengo el valor$")
    public void encontrarValor(){
        String resultado = grid.textCell(2, 2);
        assertEquals("r: 1, c: 1", resultado);
    }
}
