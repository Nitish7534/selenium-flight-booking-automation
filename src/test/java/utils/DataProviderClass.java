package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "flightData")
    public Object[][] getData() {

        return new Object[][]{
                {"Boston", "London"},
                {"Paris", "Berlin"},
                {"Philadelphia", "Rome"}
        };
    }
}