package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public WebDriver driver;
    public ChromeOptions chromeOptions;
    public EdgeOptions edgeOptions;
    public Logger logger;
    public Properties prop;

    public String browser;
    public String os;
    public String runMode;

    @BeforeClass(groups = {"Sanity", "Regression", "Master"})
    @Parameters({"browser", "os", "runMode"})
    public void setup(
            @Optional("chrome") String browser,
            @Optional("windows") String os,
            @Optional("local") String runMode) throws IOException {

        this.browser = browser;
        this.os = os;
        this.runMode = runMode;

        logger = LogManager.getLogger(this.getClass());
        logger.info("Starting tests with Browser: " + browser + ", OS: " + os + ", Run Mode: " + runMode);

        try (FileInputStream file = new FileInputStream("src/test/resources/config.properties")) {
            prop = new Properties();
            prop.load(file);
        }

        String env = prop.getProperty("execution_env", "local");

        if (env.equalsIgnoreCase("local")) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--incognito");
                    driver = new ChromeDriver(chromeOptions);
                    break;

                case "edge":
                case "microsoftedge":
                    edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--inprivate");
                    driver = new EdgeDriver(edgeOptions);
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Browser Name: " + browser);
            }
        } else if (env.equalsIgnoreCase("remote")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setBrowserName(browser);
            driver = new RemoteWebDriver(new URL(prop.getProperty("gridURL")), caps);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("baseURL"));

        logger.info("Navigated to: " + prop.getProperty("baseURL"));
    }

    // Attach driver to test result attributes before each test method
    @BeforeMethod(alwaysRun = true)
    public void attachDriverToTestResult(Method method, ITestResult result) {
        result.setAttribute("driver", driver);
    }

    @AfterClass(groups = {"Sanity", "Regression", "Master"})
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed successfully.");
        }
    }

}
