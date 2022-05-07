package pages;

public class PaginarComputadorPage extends BasePage{

String locatorClickNextPageComputador = "//a[contains(text(),'Next →')]";
String locatorMensajeObtenido = "//h1[contains(text(),'574 computers found')]";

    public PaginarComputadorPage() {
        super(driver);
    }
    
    public void navigateTo(){
        navigateTo("http://computer-database.gatling.io/computers");
    }

    public void clickPaginarSiguienteComputador(){
        clickElement(locatorClickNextPageComputador);
    }

    public String obtenerTextoResultado(){
        return getText(locatorMensajeObtenido);
    }

}
