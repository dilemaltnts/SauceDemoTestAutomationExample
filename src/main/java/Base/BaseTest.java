package Base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest extends BaseLibrary{


    @BeforeMethod
    public void openBrowser(){

        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


    }


    @AfterMethod
    public void tearDown()
    {

        driver.quit();
    }
}
