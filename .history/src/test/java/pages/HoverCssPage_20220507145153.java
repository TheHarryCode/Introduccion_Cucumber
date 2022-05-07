package pages;

public class HoverCssPage extends BasePage{

String locatorClickHoverPara = "//p[@id='hoverpara']";
String locatorClickHoverDiv = "//p[@id='hoverdivpara']";

    public HoverCssPage() {
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
