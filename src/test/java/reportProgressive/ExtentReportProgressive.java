package reportProgressive;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ExtentReportProgressive {

WebDriver driver;

		public ExtentHtmlReporter htmlReporter;
		public ExtentReports extentReport;
		public ExtentTest extentTest;

		@BeforeSuite
		public void setUpExtent() {
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/progressiveExtentReport.html");

			htmlReporter.config().setDocumentTitle("Automation Final Report");
			htmlReporter.config( ).setReportName("Testing Testing");
			htmlReporter.config().setTheme(Theme.DARK);

			extentReport = new ExtentReports();
			extentReport.attachReporter(htmlReporter);
			extentReport.setSystemInfo("hostname", "localHost");
			extentReport.setSystemInfo("Os", "MacOS");
			extentReport.setSystemInfo("Browser", "Chrome");
			extentReport.setSystemInfo("Test", "Smoke");
			extentReport.setSystemInfo("Author", "Selina Manandhar");

		}

		@AfterSuite
		public void endReport() {
			extentReport.flush();
		}
		

		public void tearDown(ITestResult result) throws IOException {

			if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, "The test Passed is "+result.getName());
				extentTest.log(Status.FAIL, "The test Passed is "+result.getThrowable());
				
				String screenShotPath = getScreenshot(driver, result.getName());
				extentTest.addScreenCaptureFromPath(screenShotPath);

			}
			else if (result.getStatus() == ITestResult.SKIP) {
				extentTest.log(Status.SKIP, "The test Passed is "+result.getName());

			}
			else if (result.getStatus() == ITestResult.SUCCESS) {
				extentTest.log(Status.PASS, "The test Passed is "+result.getName());

			}

		}

		public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
			String dateTime = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			
			//creating folder failed test in src
			String destination = System.getProperty("user.dir")+ "/Screenshots/" + screenshotName+ dateTime+".png";
			File finalDestination = new File(destination);
			Files.copy(source,finalDestination);
			return destination;
			
		}
		
		@Test
		public void positiveTest() {
			extentTest = extentReport.createTest("positiveTest");
			String b = driver.getTitle();
			Assert.assertEquals(b, "Progressive Auto Insurance");
			
		}
}