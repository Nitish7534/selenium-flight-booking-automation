package tests;

import base.BaseTest;
import pages.*;
import utils.DataProviderClass;
import utils.ScreenshotUtil;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightBookingTest extends BaseTest {

    @Test(dataProvider = "flightData", dataProviderClass = DataProviderClass.class)
    public void bookFlightTest(String from, String to) {

        try {

            HomePage home = new HomePage(driver, wait);
            home.selectCities(from, to);
            home.clickFindFlights();

            FlightResultsPage results = new FlightResultsPage(driver, wait);
            results.selectFlight();

            BookingPage booking = new BookingPage(driver, wait);
            booking.enterDetails();
            booking.clickPurchase();

            ConfirmationPage confirm = new ConfirmationPage(driver, wait);
            String text = confirm.getMessage();

            Assert.assertTrue(text.contains("Thank you"));

            System.out.println("✅ Booking successful for: " + from + " → " + to);

        } catch (Exception e) {

            ScreenshotUtil.capture(driver, "Failure_" + from + "_" + to);
            throw e;
        }
    }
}