package ProgressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DriverInformation {

	WebDriver driver;

	public DriverInformation(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By genderFemale = By.id("EditPniDetailsFormModel_DriverDetail_Gender_Value_F");
	By genderMale = By.id("EditPniDetailsFormModel_DriverDetail_Gender_Value_M");
	By maritialStatus = By.id("EditPniDetailsFormModel_DriverDetail_MaritalStatus_Value");
	By education = By.id("EditPniDetailsFormModel_DriverDetail_HighestLevelOfEducation_Value");
	By employment = By.id("EditPniDetailsFormModel_DriverDetail_EmploymentStatus_Value");
	By occupation = By.xpath("//input[@id='EditPniDetailsFormModel_DriverDetail_Occupation_Value']");
	By ssn = By.xpath("//input[@name='EditPniDetailsFormModel_DriverDetail_SocialSecurityNumber.SSNPart1']");
	By primaryResedense = By.name("EditPniDetailsFormModel_DriverDetail.PrimaryResidence.Value");
	By moveWithlast2months = By.name("EditPniDetailsFormModel_DriverDetail.HasPriorAddress.Value");
	By yearLicensed = By.name("EditPniDetailsFormModel_DriverDetail.DriverYearsLicensed.Value");
	By accident = By.id("EditPniDetailsFormModel_DriverDetail_HasAccidentsOrClaims_Value_N");
	By tickets = By.id("EditPniDetailsFormModel_DriverDetail_HasTicketsOrViolations_Value_N");
	By continueButton = By.xpath("//input[@text='Continue']");

	public void selectGenderFemale() {
		driver.findElement(genderFemale).click();
	}

	public void selectGenderMale() {
		driver.findElement(genderMale).click();
	}

	public void selectMaritialStatus(String value) throws InterruptedException {
		driver.findElement(maritialStatus);
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(maritialStatus));
		select.selectByValue(value);
	}

	public void selectEducation(String value) throws InterruptedException {
		driver.findElement(education);
		Thread.sleep(1000);
		Select select = new Select(driver.findElement(education));
		select.selectByValue(value);

	}

	public void selectEmployment(String value) throws InterruptedException {
		driver.findElement(employment);
		Thread.sleep(1000);
		Select select = new Select(driver.findElement(employment));
		select.selectByValue(value);
	}

	public void selectOccupation(String value) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(occupation).sendKeys(value);
	}

	public void enterSSN(String value) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(ssn).sendKeys(value);
	}

	public void SelectPrimaryResedence(String value) throws InterruptedException {
		driver.findElement(primaryResedense);
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(primaryResedense));
		select.selectByValue(value);
	}

	public void selectMovedTime(String value) throws InterruptedException {
		driver.findElement(moveWithlast2months);
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(moveWithlast2months));
		select.selectByValue(value);
	}

	public void selectYearsLicenced(String value) throws InterruptedException {
		driver.findElement(yearLicensed);
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(yearLicensed));
		select.selectByValue(value);
	}

	public void clickAccidentNo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(accident).click();

	}

	public void clickTicketsNo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(tickets).click();

	}

	public void clickContinue() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(continueButton).click();
	}

}
