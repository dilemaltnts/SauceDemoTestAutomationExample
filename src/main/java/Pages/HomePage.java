package Pages;


import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;





public class HomePage extends BaseTest {

    @Step("Kullanıcı Giriş Kontrolü")

    public HomePage accountControl(String value)
    {
        String text =  driver.findElement(By.cssSelector("[class='title']")).getText();
        System.out.println(text);
        Assert.assertEquals(value , text);
        screenshot();

        return this;
    }


}
