package ProgressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SnapShot {
	WebDriver driver;

	public SnapShot(WebDriver driver) {
		this.driver = driver;
	}

	By clickNoOn = By.id("SnapshotFormModel_SnapshotPolicyEnrollment_Value_N");
	By continueButton = By.xpath("//input[@text='Continue']");

	// for next page
	By continueButtons = By.xpath("//input[@id='next']");

	public void clickNOonSnapShot() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(clickNoOn).click();
	}

	public void clickContinue() throws InterruptedException {
		driver.findElement(continueButton).click();
	}

	public void clickContinue1() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(continueButtons).click();
	}
}
