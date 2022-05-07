package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculateDatePage;
import pages.CrearComputadorPage;
import pages.HoverCssPage;

public class HoverCssStep {

	HoverCssPage page = new HoverCssPage();

	@Given("^navego al sitio web de hover para")
	public void navegarSitioWebPara(){
		page.navigateTo();
	}

	@Given("^navego al sitio web de hover div")
	public void navegarSitioWebDiv(){
		page.navigateTo();
	}
	@When("^doy click en el boton hover para")
	public void darClickHoverPara(){
		page.darClickHoverPara();
	}

	@And("^espero ver el mensaje inferior y titulo principal")
	public void verMensajeInferioryTituloPrincipal(){
		String resultadoEsperado = "CSS Pseudo Class - hover";
		String resultadoReal = page.obtenerTituloPrincipal();
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
