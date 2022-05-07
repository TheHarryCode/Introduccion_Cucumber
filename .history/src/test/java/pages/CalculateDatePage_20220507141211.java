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

    public void escribirDiaFechaInicial(){
        write(locatorInputDayStartDate, "10");
    }

    public void escribirMesFechaInicial(){
        write(locatorInputMonthStartDate, "01");
    }

    public void escribirAnoFechaInicial(){
        write(locatorInputYearStartDate, "1995");
    }

    public void escribirDiaFechaFin(){
        write(locatorInputDayEndDate, "10");
    }

    public void escribirMesFechaFin(){
        write(locatorInputMonthEndDate, "01");
    }

    public void escribirAnoFechaFin(){
        write(locatorInputYearEndDate, "1995");
    }

    
    public void crearComputador(){
        clickElement(locatorClickCreateComputador);
    }

    public String obtenerTextoCreacionExitosa(){
        return getText(locatorMessageCreacion);
    }
}
