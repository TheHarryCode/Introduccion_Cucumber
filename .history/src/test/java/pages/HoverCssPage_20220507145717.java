package pages;

public class HoverCssPage extends BasePage{

String locatorClickHoverPara = "//p[@id='hoverpara']";
String locatorClickHoverDiv = "//p[@id='hoverdivpara']";
String locatorMainTitle = "//h1[contains(text(),'CSS Pseudo Class - hover')]";
String locatorHoverDivLink = "//a[@id='hoverlink']";

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

    public void darClickHoverDivLink(){
        clickElement(locatorHoverDivLink);
    }

    public String obtenerTituloPrincipal(){
        return getText(locatorMainTitle);
    }

}
