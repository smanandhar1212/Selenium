package ProgressiveTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ProgressivePages.AddressPageProgressive;
import ProgressivePages.HomePageProgressive;

public class GetQuoteByAutoTest {
	WebDriver driver;

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
		driver = new ChromeDriver();

		// invoking the webBrowser
		driver.get("https://google.com");

		// Maximize the browser
		driver.manage().window().maximize();

	}

	public void invokeBrowser() {

		driver.get("https://www.progressive.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void performAction() {
		invokeBrowser();
		HomePageProgressive home = new HomePageProgressive(driver);
		home.GetQuoteByAutoTest();
		
		AddressPageProgressive address = new AddressPageProgressive(driver);
		address.GetQuoteByAutoTest();
		

	}

	/* @AfterTest
	public void tearDownTest() {
		// close browser
		driver.close();
		driver.quit();
	}
	/*
	 */

}
