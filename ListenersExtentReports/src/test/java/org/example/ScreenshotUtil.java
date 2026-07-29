package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String testName) {
        // Capture the screenshot
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Generate timestamp and build file path
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String path = "screenshots/" + testName + "_" + timestamp + ".png";

        try {
            File destFile = new File(path);

            // Ensure the 'screenshots' folder exists
            File screenshotDir = destFile.getParentFile();
            if (!screenshotDir.exists()) {
                boolean dirCreated = screenshotDir.mkdirs();
                if (!dirCreated) {
                    System.err.println("⚠️ Failed to create screenshots directory.");
                }
            }

            // Copy screenshot to the destination path
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("✅ Screenshot saved at: " + destFile.getAbsolutePath());

            return destFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
