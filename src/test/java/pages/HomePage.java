package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By fromCity = By.name("fromPort");
    By toCity = By.name("toPort");
    By findFlights = By.xpath("//input[@value='Find Flights']");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void selectCities(String from, String to) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fromCity)).sendKeys(from);
        driver.findElement(toCity).sendKeys(to);
    }

    public void clickFindFlights() {
        wait.until(ExpectedConditions.elementToBeClickable(findFlights)).click();
    }
}