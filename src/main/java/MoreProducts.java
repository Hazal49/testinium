import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoreProducts extends Base_Page{

    By moreProductsLocator= new By.ByCssSelector("a.lazy-load-button");
    public MoreProducts(WebDriver driver) {
        super(driver);
    }
    public void ClickIt() {
        click(moreProductsLocator);
    }
}
