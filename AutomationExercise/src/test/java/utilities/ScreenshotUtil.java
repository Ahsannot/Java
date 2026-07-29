package utilities;

// Log4j imports for logging execution details
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

// Selenium imports for taking screenshots
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

// Java imports for file handling
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Java imports for timestamp generation
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    // Logger instance for logging screenshot status
    public static Logger logger;

    /**
     * Captures screenshot and saves it in /screenshots folder
     *
     * @param driver         WebDriver instance
     * @param screenshotname Name to identify screenshot
     * @return Absolute path of saved screenshot
     * @throws IOException If file operation fails
     */
    public static String captureScreenshot(WebDriver driver, String screenshotname) throws IOException {

        // Initialize logger for this utility class
        logger = LogManager.getLogger(ScreenshotUtil.class);

        try {
            // Cast WebDriver to TakesScreenshot interface
            TakesScreenshot ts = (TakesScreenshot) driver;

            // Capture screenshot and store it as a temporary file
            File source = ts.getScreenshotAs(OutputType.FILE);

            // Define destination directory path
            String dirdest = System.getProperty("user.dir") + "/screenshots/";

            // Create screenshots directory if it does not exist
            Files.createDirectories(Paths.get(dirdest));

            // Generate timestamp to avoid file name overwrite
            String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

            // Create final destination path with screenshot name and timestamp
            String dest = dirdest + screenshotname + "_" + timestamp + ".png";

            // Create destination file
            File destination = new File(dest);

            // Copy screenshot from source to destination
            Files.copy(source.toPath(), destination.toPath());

            // Console log for confirmation
            System.out.println("Screenshot saved to: " + dest);

            // Log4j info log
            logger.info("Screenshot successfully saved to: {}", dest);

            // Return screenshot path for reporting (Extent / Allure)
            return dest;

        } catch (IOException e) {
            // Handles file IO related exceptions
            System.out.println("Error while saving screenshot: " + e.getMessage());
            logger.error("IOException during screenshot capture", e);
            return null;

        } catch (Exception e) {
            // Handles any unexpected runtime exception
            System.out.println("Unexpected error during screenshot capture: " + e.getMessage());
            logger.error("Unexpected error during screenshot capture", e);
            return null;
        }
    }
}
