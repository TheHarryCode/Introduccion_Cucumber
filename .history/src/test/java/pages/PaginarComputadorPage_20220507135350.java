package pages;

public class PaginarComputadorPage extends BasePage{

String locatorClickFiltrarComputador = "//input[@id='searchsubmit']";
String locatorInputNameFilter = "//input[@id='searchbox']";
String locatorMensajeObtenido = "//h1[contains(text(),'One computer found')]";

    public PaginarComputadorPage() {
        super(driver);
    }
    
    public void navigateTo(){
        navigateTo("http://computer-database.gatling.io/computers");
    }

    public void escribirNombreComputadorFiltrar(){
        write(locatorInputNameFilter, "Acer Iconia");
    }

    public void clickFiltrarComputador(){
        clickElement(locatorClickFiltrarComputador);
    }

    public String obtenerTextoResultado(){
        return getText(locatorMensajeObtenido);
    }

}
