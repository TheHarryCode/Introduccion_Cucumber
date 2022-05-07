package pages;
public class GooglePage extends BasePage{

    String inputSearchLocator = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    String  buttonSearch = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    String locatorBusqueda = "//h3[contains(text(),'¡Bogotá, más cerca de la gente! | Bogota.gov.co')]";

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void writeSearch(String busqueda){
        write(this.inputSearchLocator, busqueda);
    }

    public void clickSearch(){
        clickElement(this.buttonSearch);
    }

    public boolean resultado(){
        return elementDisplay(locatorBusqueda);
    }
}
