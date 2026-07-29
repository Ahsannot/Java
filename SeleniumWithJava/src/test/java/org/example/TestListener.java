package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {

    private ExtentReports extent;
    private ExtentTest test;

    private String reportFolder;
    private String screenshotFolder;
    private String reportPath;

    @Override
    public void onStart(ITestContext context) {
        // Create timestamp for folders & report name
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        reportFolder = "test-output/Report_" + timestamp;
        screenshotFolder = reportFolder + "/screenshots";
        reportPath = reportFolder + "/ExtentReport_" + timestamp + ".html";

        // Create folders dynamically
        new File(screenshotFolder).mkdirs();

        // Setup ExtentReports
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setDocumentTitle("Automation Test Report");
        sparkReporter.config().setReportName("Functional Test Suite");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("Tester", "Your Name");

        System.out.println("🔵 Test Suite started: " + context.getName());
        System.out.println("📝 Report will be generated at: " + reportPath);
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        test.log(Status.INFO, "Test Started");
        System.out.println("🔷 Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
        System.out.println("✅ Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test Failed: " + result.getThrowable());

        // Get driver from test class using reflection
        Object testClass = result.getInstance();
        WebDriver driver = extractDriver(testClass);

        if (driver != null) {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotPath = screenshotFolder + "/" + result.getMethod().getMethodName() + "_" + timestamp + ".png";

            try {
                File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File(screenshotPath));
                test.addScreenCaptureFromPath(screenshotPath, "Screenshot on Failure");
                System.out.println("📸 Screenshot saved: " + screenshotPath);
            } catch (IOException e) {
                test.log(Status.WARNING, "Failed to capture screenshot: " + e.getMessage());
                System.err.println("❌ Failed to save screenshot: " + e.getMessage());
            }
        } else {
            System.err.println("⚠️ WebDriver instance not found. Screenshot not captured.");
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP, "Test Skipped");
        System.out.println("⚠️ Test skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        System.out.println("🔴 Test Suite finished: " + context.getName());
        System.out.println("📝 Report generated at: " + reportPath);
    }

    // Helper method to get WebDriver from your SampleTest instance via reflection
    private WebDriver extractDriver(Object testClassInstance) {
        try {
            Field driverField = testClassInstance.getClass().getDeclaredField("driver");
            driverField.setAccessible(true);
            Object driverObject = driverField.get(testClassInstance);
            if (driverObject instanceof WebDriver) {
                return (WebDriver) driverObject;
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
