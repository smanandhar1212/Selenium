package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CerotidObjectModelWithMethods;

public class CerotidObjectModelWithMethodsTest {
	public static WebDriver driver = null;

	public static void main(String[] args) {

		invokeBrowser();
		completeForm();
	}

	// 1. Invoke Browser
	public static void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.cerotid.com");
		driver.manage().window().maximize();
	}

	// 2. Complete the Form
	public static void completeForm() {
		CerotidObjectModelWithMethods obj = new CerotidObjectModelWithMethods(driver);
		obj.selectCourse("QA Automation");
		obj.selectSession("Upcoming Session");
		obj.eterName("Selina Manandhar");
	}

}
