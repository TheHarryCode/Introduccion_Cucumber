package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.FiltrarComputadorPage;

public class PaginarComputadorStep {

	FiltrarComputadorPage computo = new FiltrarComputadorPage();

	@Given("^navego al sitio web de computadores paginados")
	public void navegarSitioWeb(){
		computo.navigateTo();
	}

	@And("^doy click en el boton filtrar por nombre")
	public void clickFiltrarComputador(){
		computo.clickFiltrarComputador();
	}

	@And("^comparo si en la lista esta el computador buscado")
	public void compararResultado(){
		String mensajeEsperoado = "One computer found";
		String mensajeRetornado = computo.obtenerTextoResultado();
		assertEquals(mensajeEsperoado, mensajeRetornado);
	}

}
