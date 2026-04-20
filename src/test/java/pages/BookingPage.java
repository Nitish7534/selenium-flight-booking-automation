package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class BookingPage {

    WebDriver driver;
    WebDriverWait wait;

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By card = By.id("creditCardNumber");
    By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

    public BookingPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void enterDetails() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys("Nitish");
        driver.findElement(address).sendKeys("India");
        driver.findElement(city).sendKeys("Delhi");
        driver.findElement(card).sendKeys("1234567890123456");
    }

    public void clickPurchase() {
        wait.until(ExpectedConditions.elementToBeClickable(purchaseBtn)).click();
    }
}