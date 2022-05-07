package pages;

public class GridPage extends BasePage{

    String TableLocator = "/html/body/div/div";

    public GridPage() {
        super(driver);
    }

    public void navigate(){
        navigateTo("https://1v2njkypo4.csb.app");
    }

    public String textCell(int row, int colum){
        return getTextTable(TableLocator, row, colum);
    }
    
}
