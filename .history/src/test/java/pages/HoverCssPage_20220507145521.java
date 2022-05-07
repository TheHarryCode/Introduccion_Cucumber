package pages;

public class HoverCssPage extends BasePage{

String locatorClickHoverPara = "//p[@id='hoverpara']";
String locatorClickHoverDiv = "//p[@id='hoverdivpara']";
String localtorMainTitle = "//h1[contains(text(),'CSS Pseudo Class - hover')]";

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

    public String obtenerTituloPrincipal(){
        return getText(localtorMainTitle);
    }

    public void escribirDiaFechaInicial(){
        write(locatorInputDayStartDate, "10");
    }

  

    
}
