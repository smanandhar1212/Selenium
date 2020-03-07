package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleObject;

public class SimpleTestNgClassDemo {

	// Class level variable
	static WebDriver driver;

	@BeforeTest
	public void setUpTest() {

		// Setting the system path to utilize the chrome driver
		System.setProperty("webDriver.chrome.driver", "./libs/chromedriver");

		// Creating webdriver object to drive my browser
		WebDriver driver = new ChromeDriver();

	}

	public static void invokeBrowser() {
		driver.navigate().to("http://wwww.google.com");
		driver.navigate().refresh();
		System.out.println(driver.getTitle() + "--------- was launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	
	@Test(priority = 0)
	public static void performAction() {
		//navigate to google.com	
		invokeBrowser();
		
		GoogleObject obj = new GoogleObject(driver);
		obj.GoogleSearch("what is TestNg");
		
		
	}
	
	@AfterTest
	public static void terminateTest() {
		driver.close();
		driver.quit();
		
	}
}
