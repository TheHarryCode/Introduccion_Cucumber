package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CrearComputadorPage;
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
	
}
