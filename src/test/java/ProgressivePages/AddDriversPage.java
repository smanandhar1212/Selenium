package ProgressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddDriversPage {
	WebDriver driver;

	public AddDriversPage(WebDriver driver) {
		this.driver = driver;
	}

	By continueToNextPage = By.xpath("//input[@text='Continue']");

	public void clickConitnue() {
		driver.findElement(continueToNextPage).click();
		;
	}

}
