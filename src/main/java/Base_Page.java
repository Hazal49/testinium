import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Base_Page {
    WebDriver driver;
    public Base_Page(WebDriver driver){
        this.driver=driver;
    }
    public WebElement find(By locator) {  //Ürünü bul...
        return driver.findElement(locator);
    }
    public List<WebElement> findAll(By locator){  //Tüm ürünleri getir...
        return driver.findElements(locator);
    }
    public void click(By locator){ //Basıldı mı?
        find(locator).click();
    }
    public void type(By locator, String text){ // Ürünün adını yazmak için...
        find(locator).sendKeys(text);
    }
    public Boolean isDisplayed(By locator){ //Sayfada mı?
        return find(locator).isDisplayed();
    }
}
