package pages;

public class SampleTestPage extends BasePage{

    String locatorSelect = "//select[@id='ParkingLot']";

    public SampleTestPage() {
        super(driver);
    }

    public void navigateTo(){
        navigateTo("https://www.shino.de/parkcalc/");
    }

    public void SelectValue(String valor){
        selectFromDropDownByValue(locatorSelect, valor);
    }
    
}
