package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.FiltrarComputadorPage;

public class FiltrarComputadorStep {

	FiltrarComputadorPage computo = new FiltrarComputadorPage();

	@Given("^navego al sitio web de computadores")
	public void navegarSitioWeb(){
		computo.navigateTo();
	}

	@When("^ingreso el nombre del computador a buscar")
	public void ingresoNombreComputadorFiltrar(){
		computo.escribirNombreComputadorFiltrar();
	}

	@And("^doy click en el boton filtrar por nombre")
	public void clickFiltrarComputador(){
		computo.clickFiltrarComputador();
	}

	@And("^comparo si en la lista esta el computador buscado")
	public void compararResultado(){
		String registradoEsperado = "ACE";
		String registradoObtenido = computo.obtenerTextoResultado();
		assertEquals(registradoEsperado, registradoObtenido);
	}

}
