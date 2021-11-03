import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends Base_Page {

    By AddCartButtonLocator=By.id("pd_add_to_cart");
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(AddCartButtonLocator);
    }

    public void addToCart() {
        click(AddCartButtonLocator);
    }
}
