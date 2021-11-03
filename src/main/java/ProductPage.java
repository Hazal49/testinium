import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage extends Base_Page{
    MoreProducts moreProducts;

    By filterLocator = By.id("filter-label");
    By productNameLocator = By.className("product-item-info");
    public ProductPage(WebDriver driver) {
        super(driver);
        moreProducts=new MoreProducts(driver); //değer atandı
    }

    public boolean isOnProductPage() {
        return isDisplayed(filterLocator);
    }
    public List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
   public MoreProducts moreProducts() {
       ((JavascriptExecutor)driver).executeScript("scrollTo(0,3000)"); //Scrolling
        return this.moreProducts;
    }

    public void selectProduct() {
        // Find and click on a random product
        Random rand = new Random();
        getAllProducts().get(rand.nextInt(100)).click();
    }
}
