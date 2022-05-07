package pages;

public class FiltrarComputadorPage extends BasePage{

String locatorClickFiltrarComputador = "//input[@id='searchsubmit']";
String locatorInputNameFilter = "//input[@id='searchbox']";
String locatorTableResultName = "ACE";

    public FiltrarComputadorPage() {
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
        return getText(locatorTableResultName);
    }

}
