package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage{

    String InputList = "//body/form[1]/input[1]";
    String locatorList = "name";

    public ListPage() {
        super(driver);
    }

    public void navigate(){
        navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void escribirCriterioBusqueda(String state){
        write(InputList, state);
    }

    public List<String> getAllSearchResult(){
        List<WebElement> list = obtenerElemetos(locatorList);
        List<String> textoLista = new ArrayList<String>();
        for (WebElement webElement : list) {
            textoLista.add(webElement.getText());
        }
        return textoLista;
    }
    
}
