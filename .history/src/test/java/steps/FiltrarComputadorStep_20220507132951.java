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

	@And("^doy click en el boton de add new computer")
	public void clickAdicionarComputador(){
		computo.clickAdicionarComputador();
	}

	

	@And("^ingreso una fecha de introduccion")
	public void ingresoFechaIngreso(){
		computo.escribirFechaIngreso();
	}

	@And("^ingreso una fecha de descontinuar")
	public void ingresoFechaDescontinuar(){
		computo.escribirFechaDescontinuar();
	}

	@And("^selecciono una compania")
	public void seleccionarCompania(){
		computo.seleccionarCompania();
	}

	@Then("^doy click en el boton crear computador")
	public void creoComputador(){
		computo.crearComputador();
	}

	@And("^comparo si la respuesta es correcta al crear un computador")
	public void compararResultado(){
		String mensajeEsperado = "Done ! Computer Prueba Computo has been created";
		String mensajeReal = computo.obtenerTextoCreacionExitosa();
		assertEquals(mensajeEsperado, mensajeReal);
	}

}
