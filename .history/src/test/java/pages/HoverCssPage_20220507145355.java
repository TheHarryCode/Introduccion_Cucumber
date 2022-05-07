package pages;

public class HoverCssPage extends BasePage{

String locatorClickHoverPara = "//p[@id='hoverpara']";
String locatorClickHoverDiv = "//p[@id='hoverdivpara']";

    public HoverCssPage() {
        super(driver);
    }
    
    public void navigateTo(){
        navigateTo("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");
    }

    public void darClickHoverPara(){
        clickElement(locatorClickHoverPara);
    }

    public void darClickHoverDiv(){
        clickElement(locatorClickHoverDiv);
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

   

    public String obtenerTextoResultado(){
        return getText(locatorMessageCreacion);
    }
}
