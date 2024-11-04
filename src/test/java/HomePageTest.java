
import Base.BaseTest;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class HomePageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test(description = "Kullanıcı Başarılı Giriş Sağlayarak Anasayfayı Görüntüleyebilme Kontrolü")
    public void testHomePage() {

        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("Giriş başarılı ve doğru sayfaya yönlendirildi.");
        } else {
            System.out.println("Yanlış sayfaya yönlendirildi.");
        }
    }
}
