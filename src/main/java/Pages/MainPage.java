package Pages;

import Base.BaseTest;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {


    @Step("Error Message Kontrol Edilir.")
    public MainPage errorControlMessage(String message){

        String text =  driver.findElement(By.cssSelector("[class='error-message-container error']")).getText();

        Assert.assertEquals(message , text);
        screenshot();
        return this;
    }
}
