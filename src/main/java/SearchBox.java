import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends Base_Page{

    By searchBoxLocator=By.id("search_input"); //Sitedeki arama textbox id si
    By searchBoxButtonLocator= By.className("searchButton");  //Arama butonu class ismi
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        click(searchBoxLocator);
        type(searchBoxLocator, text); //Arama kutusuna texti yazdır.
        click(searchBoxButtonLocator);
    }
}
