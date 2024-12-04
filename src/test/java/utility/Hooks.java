package utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utility.BrowserDriver.driver;

public class Hooks {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
