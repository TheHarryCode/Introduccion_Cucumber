package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navigateTo(String url){
        driver.get(url);
    }

    public static void close(){
        driver.quit();
    }

    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        find(locator).click();
    }

    public void write(String locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    public String getText(String locator){
        return find(locator).getText();
    }

    public boolean elementDisplay(String locator){
        return find(locator).isDisplayed();
    }

    public String getTextTable(String locator, int row, int colum){
        String cell = locator + "/table/tbody/tr["+row+"]/td["+colum+"]";
        return find(cell).getText();
    }

    public List<WebElement> obtenerElemetos(String locator){
        return driver.findElements(By.className(locator));
    }

    public void hoverOfElement(String locator){
        action.moveToElement(find(locator));
    }

    public void doubleClick(String locator){
        action.doubleClick(find(locator));
    }

    public void rightClick(String locator){
        action.contextClick(find(locator));
    }

    public void selectFromDropDownByValue(String locator, String value){
        Select dropDown = new Select(find(locator));
        dropDown.selectByValue(value);
    }

    public void selectFromDropDownByIndex(String locator, int index){
        Select dropDown = new Select(find(locator));
        dropDown.selectByIndex(index);
    }

    public void selectFromDropDownByText(String locator, String text){
        Select dropDown = new Select(find(locator));
        dropDown.selectByVisibleText(text);
    }

    
}
