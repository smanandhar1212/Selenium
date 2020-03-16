package ProgressiveTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleObject;

public class GoogleObjectTest {

	WebDriver driver;

	public static void main(String[] args) {

	}

	public void invokeBorwser() {
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	public void performActions() {

		GoogleObject obj = new GoogleObject(driver);

	}

}
