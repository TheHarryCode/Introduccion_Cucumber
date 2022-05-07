package pages;

public class FiltrarComputadorPage extends BasePage{

String locatorClickFiltrarComputador = "//input[@id='searchsubmit']";
String locatorInputNameFilter = "//input[@id='searchbox']";


    public FiltrarComputadorPage() {
        super(driver);
    }
    
    public void navigateTo(){
        navigateTo("http://computer-database.gatling.io/computers");
    }

    public void clickAdicionarComputador(){
        clickElement(locatorClickAdicionarComputador);
    }

    public void escribirNombreComputador(){
        write(locatorInputName, "Prueba Computo");
    }

    public void escribirFechaIngreso(){
        write(locatorInputFechaIngreso, "1995-04-02");
    }

    public void escribirFechaDescontinuar(){
        write(locatorInputFechaDescontinuar, "2022-04-02");
    }

    public void seleccionarCompania(){
       selectFromDropDownByValue(locatorInputCompany, "6");
    }

    public void crearComputador(){
        clickElement(locatorClickCreateComputador);
    }

    public String obtenerTextoCreacionExitosa(){
        return getText(locatorMessageCreacion);
    }
}
