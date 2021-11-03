import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Add_To_Cart_Test extends Base_Test{
    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_product(){
        homePage=new HomePage(driver);
        productPage=new ProductPage(driver);
        homePage.searchBox().search("  Pantolon");
        Assertions.assertTrue(productPage.isOnProductPage(), "Ürün sayfasında değilsin");

    }
   @Test
   @Order(2)
   public void more_product() {
       productPage=new ProductPage(driver);
       productPage.moreProducts().ClickIt();
       Assertions.assertTrue(productPage.isOnProductPage(), "Sepet arttırılamadı");
   }

    @Test
    @Order(3)
    public void select_product(){
        productDetailPage=new ProductDetailPage(driver);
        productPage.selectProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Detay sayfasında değilsin");

    }
    @Test
    @Order(4)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isCountUp(), "Sepet arttırılamadı");

    }
    @Test
    @Order(5)
    public void go_to_cart(){
        cartPage=new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkDeleting(), "Ürün eklenemedi");
    }
}
