package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SampleTest {

    WebDriver driver;

    // Set up WebDriver before the tests start
    @BeforeTest
    public void setUp() {
        // WebDriver Manager automatically manages ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    // Test case for a successful test scenario
    @Test(priority = 1)
    public void passingTest() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"), "Title does not contain 'Google'");
    }

    // Test case for a failing test scenario
    @Test(priority = 2)
    public void failingTest() {
        Assert.fail("This test is supposed to fail");
    }

    // Tear down WebDriver after tests complete
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
