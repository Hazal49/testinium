import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends Base_Page{

    SearchBox searchBox; //null
    By counterLocator =By.id("spanCart");
    By cartContainerLocator=By.id("header-cart");
    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver); //değer atandı
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isCountUp() {
        return getCountCart()==2;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }
    private int getCountCart(){  //Sepetteki ürün sayısını gösteren numara alındı.
        String count = find(counterLocator).getText();
        return Integer.parseInt(count);
    }
}
