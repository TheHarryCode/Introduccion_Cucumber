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

	@And("^ingreso el dia de la fecha final")
	public void escribirDiaFechaFin(){
		page.escribirDiaFechaFin();
	}
	
	@And("^ingreso el mes de la fecha final")
	public void escribirMesFechaFin(){
		page.escribirMesFechaFin();
	}

	@When("^ingreso el ano de la fecha final")
	public void escribirAnoFechaFin(){
		page.escribirAnoFechaFin();
	}

	@Then("^doy click en el boton calcular duracion")
	public void calcularDuracion(){
		page.calcularDuracion();
	}

	@And("^comparo si la respuesta es correcta al calcular un rango de fechas")
	public void compararResultado(){
		String resultadoEsperado = "Result: 10 days";
		String resultadoReal = page.obtenerTextoResultado();
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
