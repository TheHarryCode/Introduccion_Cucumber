package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculateDatePage;
import pages.CrearComputadorPage;

public class CalculateDateStep {

	CalculateDatePage page = new CalculateDatePage();

	@Given("^navego al sitio web de calculos de fechas")
	public void navegarSitioWeb(){
		page.navigateTo();
	}

	@And("^ingreso el dia de la fecha inicial")
	public void escribirDiaFechaInicial(){
		page.escribirDiaFechaInicial();
	}

	@And("^ingreso el mes de la fecha inicial")
	public void escribirMesFechaInicial(){
		page.escribirMesFechaInicial();
	}
	
	@And("^ingreso el ano de la fecha inicial")
	public void escribirAnoFechaInicial(){
		page.escribirAnoFechaInicial();
	}

	@And("^ingreso el dia de la fecha inicial")
	public void escribirDiaFechaInicial(){
		page.escribirDiaFechaInicial();
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
