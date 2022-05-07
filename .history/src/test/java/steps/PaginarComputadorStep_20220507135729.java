package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.FiltrarComputadorPage;
import pages.PaginarComputadorPage;

public class PaginarComputadorStep {

	PaginarComputadorPage computo = new PaginarComputadorPage();

	@Given("^navego al sitio web de computadores paginados")
	public void navegarSitioWeb(){
		computo.navigateTo();
	}

	@And("^doy click en el boton paginar siguiente")
	public void clickPaginarSiguienteComputador(){
		computo.clickPaginarSiguienteComputador();
	}

	@And("^puedo ver los resultados encontrados")
	public void compararResultado(){
		String mensajeEsperoado = "574 computers found";
		String mensajeRetornado = computo.obtenerTextoResultado();
		assertEquals(mensajeEsperoado, mensajeRetornado);
	}

}
