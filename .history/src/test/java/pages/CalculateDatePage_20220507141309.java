package pages;

public class CalculateDatePage extends BasePage{

String locatorClickAdicionarComputador = "//a[@id='add']";
String locatorInputMonthStartDate = "//input[@id='name']";
String locatorInputYearStartDate = "//input[@id='name']";
String locatorInputDayEndDate = "//input[@id='name']";
String locatorInputMonthEndDate = "//input[@id='name']";
String locatorInputYearEndDate = "//input[@id='name']";
String locatorInputDayStartDate = "//input[@id='name']";

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
