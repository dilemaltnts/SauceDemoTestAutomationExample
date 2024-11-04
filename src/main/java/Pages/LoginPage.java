package Pages;

import Base.BaseTest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Kullanıcı Adı Alanı Doldurulur.")
    public LoginPage fillUsername(String text) {
        driver.findElement(By.name("user-name")).sendKeys(text);
        return this;
    }

    @Step("Password Alanı Doldurulur.")
    public LoginPage fillPassword(String text) {

        driver.findElement(By.name("password")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Login Butonuna Tıklanır")
    public LoginPage clickLogin() {
        driver.findElement(By.cssSelector("[value='Login']")).click();
        screenshot();
        return this;

    }



}
