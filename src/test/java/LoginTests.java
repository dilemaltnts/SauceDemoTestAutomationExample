
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import static org.junit.Assert.assertTrue;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı Kullanıcı Girişi Kontrolü")
    public void successfulLogin() {
        loginPage.fillUsername(username)
                .fillPassword(password)
                .clickLogin();
        homePage.accountControl("Products");
    }

    @Test(description = "Doğru Kullanıcı Adı  & Yanlış Şifre Girişi Kontrolu")
    public void LoginUnsuccesfulControl() {

        loginPage.fillUsername(username)
                .fillPassword("12354")
                .clickLogin();

        mainPage.errorControlMessage("Epic sadface: Username and password do not match any user in this service");


    }

    @Test(description = "Yanlış Kullanıcı Adı &  Doğru Şifre Girişi Kontrolü")
    public void LoginUnsuccesful2Control() {

        loginPage.fillUsername("deneme")
                .fillPassword(password)
                .clickLogin();

        mainPage.errorControlMessage("Epic sadface: Username and password do not match any user in this service");


    }

    @Test(description = "Yanlış Kullanıcı &  Yanlış Şifre Girişi Kontrolü")
    public void LoginUnsuccesful3Control() {

        loginPage.fillUsername("deneme")
                .fillPassword("denemepassword")
                .clickLogin();

        mainPage.errorControlMessage("Epic sadface: Username and password do not match any user in this service");


    }

    @Test(description = "Kullanıcı Adı ve Şifrenin Boş Bırakılma Kontrolü")
    public void LoginRequiredControl() {


        loginPage.fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Epic sadface: Username is required");


    }
}
