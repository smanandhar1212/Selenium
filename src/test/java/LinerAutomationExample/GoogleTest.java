package LinerAutomationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		//Setting the system path to utilize the chrome driver
		System.setProperty("webDriver.chrome.driver","./libs/chromedriver");

		//Creating webdriver object to drive my browser
		WebDriver driver = new ChromeDriver();
		
		//invoking the webBrowser
		driver.get("https://google.com");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		WebElement txtBoxSearch = driver.findElement(By.xpath("//input[@name='q']"));
		txtBoxSearch.sendKeys("what is sellenium");
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@name='btnk']"));
		searchBtn.sendKeys(Keys.RETURN);
		
	}

}
