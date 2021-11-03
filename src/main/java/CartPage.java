import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.util.List;

public class CartPage extends Base_Page {
    By controlNumberLocator = By.className("item-quantity-input ignored");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkDeleting() {
        return getProducts().size()==0;

    }
    private List<WebElement> getProducts(){
        return findAll(controlNumberLocator);
    }

}
