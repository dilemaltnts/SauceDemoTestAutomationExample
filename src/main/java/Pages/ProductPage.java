package Pages;

import Base.BaseTest;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BaseTest {

    @Step("Ürün detayına gitmek için tıklama işlemi sağlanır")
    public ProductPage selectProduct(int productIndex) {
        WebElement productLink = driver.findElement(By.xpath("//div[@class='inventory_item'][" + productIndex + "]//a"));
        productLink.click();
        screenshot();
        return this;
    }

    @Step("Ürünü sepete ekleme işlemi sağlanır")
    public ProductPage addToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(), 'Add to cart')]"));
        addToCartButton.click();
        screenshot();
        return this;
    }

    @Step("Ürün detaylarını kontrol etme işlemi sağlanır")
    public String getProductName()

    {
        screenshot();
        return driver.findElement(By.className("inventory_details_name")).getText();

    }
}
