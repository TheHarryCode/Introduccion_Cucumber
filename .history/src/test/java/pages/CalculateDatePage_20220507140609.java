package pages;

public class CalculateDatePage extends BasePage{

String locatorClickAdicionarComputador = "//a[@id='add']";
String locatorInputName = "//input[@id='name']";
String locatorInputFechaIngreso = "//input[@id='introduced']";
String locatorInputFechaDescontinuar = "//input[@id='discontinued']";
String locatorInputCompany = "//select[@id='company']";
String locatorClickCreateComputador = "//body/section[@id='main']/form[1]/div[1]/input[1]";
String locatorMessageCreacion = "//body/section[@id='main']/div[1]";

    public CalculateDatePage() {
        super(driver);
    }
    
    public void navigateTo(){
        navigateTo("https://www.timeanddate.com/date/durationresult.html");
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
