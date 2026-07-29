package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ExtentReportListener implements ITestListener {

    public  static ExtentReports extentReports ;
    public  static ExtentTest test ;
    public ExtentSparkReporter sparkReporter;

    public void onStart(ITestContext context){

        System.out.println("onStart - Test Suite started: " + context.getName());

        String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(new java.util.Date());

        new java.io.File("reports").mkdirs();

        String reportPath = "reports/SparkReport_" + timestamp + ".html";

        sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setReportName("Ecommerce Automation Report");
        sparkReporter.config().setDocumentTitle("Automation Test Report");

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    public void onTestStart(ITestResult result){
        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();

        test = extentReports.createTest(className + " : " + methodName);

        test.info("Test Started: " + methodName + " in class " + className);
    }

    public void onTestSuccess(ITestResult result) {

        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();

        System.out.println("onTestSuccess - Passed Test: " + className + "." + methodName);

        test.pass("Test Passed: " + methodName + " in class " + className);
    }

    public void onTestFailure(ITestResult result){
        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();

        System.out.println("onTestFailure - Test Failed: " + className + "." + methodName);

        test.fail("Test Failed: " + methodName + " in class " + className);

        test.fail(result.getThrowable());

        WebDriver driver = getDriverFromResult(result);

        if (driver != null){
            try {
                String screenshotpath = ScreenshotUtil.captureScreenshot(driver, methodName);
                if (screenshotpath != null && new File(screenshotpath).exists()){
                    test.fail("Screenshot of failure:",
                            MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
                    } else {
                    test.info("Screenshot path invalid or file does not exist.");
                }
            } catch (Exception e) {
                test.info("Could not attach screenshot: " + e.getMessage());
            }

        }

    }

    public void onTestSkipped(ITestResult result) {

        String className = result.getTestClass().getName();
        String methodName = result.getMethod().getMethodName();

        System.out.println("onTestSkipped - Skipped Test: " + className + "." + methodName);

        test.skip("Test Skipped: " + methodName + " in class " + className);
    }

    public void onFinish(ITestContext context){

        System.out.println("onFinish - Test Suite finished: " + context.getName());
        extentReports.flush();
    }
    public WebDriver getDriverFromResult(ITestResult result) {
        Object driverObj = result.getAttribute("driver");

        if (driverObj instanceof WebDriver){
            return (WebDriver) driverObj;
        }else {
            System.out.println("WebDriver not found in ITestResult attributes.");
            return null;
        }
    }
}
