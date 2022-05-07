package pages;

public class CalculateDatePage extends BasePage{

String locatorClickCalcularDuracion = "//input[@id='subbut2']";
String locatorInputDayStartDate = "//input[@id='d1']";
String locatorInputMonthStartDate = "//input[@id='m1']";
String locatorInputYearStartDate = "//input[@id='y1']";
String locatorInputDayEndDate = "//input[@id='d2']";
String locatorInputMonthEndDate = "//input[@id='m2']";
String locatorInputYearEndDate = "//input[@id='y2']";
String locatorMessageCreacion = "//h2[contains(text(),'Result: 10 days')]";

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
        write(locatorInputMonthStartDate, "11");
    }

    public void escribirAnoFechaInicial(){
        write(locatorInputYearStartDate, "1995");
    }

    public void escribirDiaFechaFin(){
        write(locatorInputDayEndDate, "20");
    }

    public void escribirMesFechaFin(){
        write(locatorInputMonthEndDate, "11");
    }

    public void escribirAnoFechaFin(){
        write(locatorInputYearEndDate, "1995");
    }

    public void calcularDuracion(){
        clickElement(locatorClickCalcularDuracion);
    }

    public String obtenerTextoResultado(){
        return getText(locatorMessageCreacion);
    }
}
