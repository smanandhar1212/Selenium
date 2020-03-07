package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Purpose of this class is to return web element.
public class CerotidWebsitePageElements {

	static WebElement element;

	// Select course Element
	public static WebElement selectCourse(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@id='classType']"));
		return element;
	}

	public static WebElement chooseSession(WebDriver driver) {

		element = driver.findElement(By.xpath("//select[@id='sessionType']"));
		return element;
	}

	public static WebElement inputName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='name']"));
		return element;
	}

	public static WebElement inputAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='address']"));
		return element;
	}

	public static WebElement inputCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='city']"));
		return element;
	}

	public static WebElement selectState(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='state']"));
		return element;
	}

	public static WebElement inputZipCode(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='zip']"));
		return element;
	}

	public static WebElement inputEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='email']"));
		return element;
	}

	public static WebElement inputPhone(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='phone']"));
		return element;
	}

	public static WebElement selectVisaStatus(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='visaStatus']"));
		return element;
	}

	public static WebElement selectMediaSource(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='mediaSource']"));
		return element;
	}

	public static WebElement ableToRelocate(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='radio'][@value='N0']"));
		return element;
	}

}
