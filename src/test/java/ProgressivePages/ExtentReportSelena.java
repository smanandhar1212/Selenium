package ProgressivePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Extentreport.GooglePage;

public class ExtentReportSelena {
	// Global Variables
		WebDriver driver;
		ExtentHtmlReporter htmlReporter;
		ExtentReports extent;

		@BeforeSuite
		public void setUp() {
			// Creating ExtentReporter obj and creating new ExtentReport Html file
			htmlReporter = new ExtentHtmlReporter("ExtendReport.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
		}

		@BeforeTest
		public void setUPTest() {
			System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
			driver = new ChromeDriver();

		}

		public void InvokeBrowser() {
			driver.get("https://www.progressive.com/");
			if (driver.getTitle().contains("progressive")) {
				System.out.println(driver.getTitle() + " ....... Was launched");
			} else {
				System.out.println("Failed........ Incorrect title page");
				System.exit(0);
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			ExtentTest isBrowserOpened = extent.createTest("Invoke Browser",
					"This test ensures that the browser is opened");
			isBrowserOpened.pass("Browser was invoked as Expected");

		}

		@Test(priority = 0)
		public void failPage() {
			InvokeBrowser();
			
			// Utilizing the class we created in extentreport package
			GooglePage obj = new GooglePage(driver);
			obj.googleSearch("What is Extent Reports");
			ExtentTest search = extent.createTest("Search criteria", "This test is ensure our search was successful");

			if (driver.findElement(By.xpath("//span[@class='e24Kjd']")).getText().contains("Extent Report")) {
				search.pass("Correct page was displayed");
			}else { 
				
				search.fail("Incorrect page was displayed");
			}
		}

		@Test(priority = 1)
		public void GoogleHomePageTest() {
			ExtentTest info1 = extent.createTest("Google negative test", "The test is failed for negative testing");
			info1.info("This is showing information");
			info1.fail("This was failed on purpose for negative testing");
		

		}

		@AfterTest
		public void tearDownTestCloseBrowser() {
			driver.close();
			driver.quit();

		}

		@AfterSuite
		public void tearDown() {
			// calling the log file
			extent.flush();
		}

	
}
