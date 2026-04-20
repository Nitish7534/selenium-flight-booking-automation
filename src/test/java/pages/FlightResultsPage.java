package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

public class FlightResultsPage {

    WebDriver driver;
    WebDriverWait wait;

    By chooseFlight = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public FlightResultsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void selectFlight() {
        wait.until(ExpectedConditions.elementToBeClickable(chooseFlight)).click();
    }
}