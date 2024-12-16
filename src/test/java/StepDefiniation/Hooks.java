package StepDefiniation;

import com.shaft.driver.SHAFT;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
    public static SHAFT.GUI.WebDriver driver;

    @Before
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();

        driver.browser().navigateToURL("https://ecommerce.tealiumdemo.com/");
    }

    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
