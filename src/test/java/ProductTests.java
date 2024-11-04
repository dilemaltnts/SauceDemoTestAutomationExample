import Base.BaseTest;


import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

public class ProductTests extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private ProductPage productPage;

    @BeforeMethod
    public void setUp() {
        super.openBrowser();
        loginPage = new LoginPage();
        homePage = new HomePage();
        productPage = new ProductPage();
    }

    @Test(description = "Ürün Detaylarını Görüntüle ve Sepete Ekle")
    public void viewProductDetailsAndAddToCart() {
        // Giriş işlemi
        loginPage.fillUsername("standard_user")
                .fillPassword("secret_sauce")
                .clickLogin();

        // Ürüne tıklayıp detayını gör
        productPage.selectProduct(1); // İlk ürünü seç
        String productName = productPage.getProductName(); // Ürün adını al

        // Ürünü sepete ekle
        productPage.addToCart();

        // Ürünün doğru şekilde eklendiğini kontrol et
        assertEquals("Sauce Labs Backpack", productName);
    }
}


