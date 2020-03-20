package ProgressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DriverInformation {

	WebDriver driver;

	public DriverInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_F']")
	public WebElement selectGender;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']")
	public WebElement selectMaritalStatus;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']")
	public WebElement selectLevelOfEducation;

	@FindBy(how = How.XPATH, using = "//*[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']")
	public WebElement selectEmployementStatus;

	@FindBy(how = How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_Occupation']")
	public WebElement fillOccupation;

	@FindBy(how = How.XPATH, using = "//input[@id='DriversAddPniDetails_embedded_questions_list_SocialSecurityNumber']")
	public WebElement fillSSN;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']")
	public WebElement selectPrimaryResidence;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']")
	public WebElement selectMovedInLast2Month;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']")
	public WebElement selectLicenseStatus;

	@FindBy(how = How.XPATH, using = "//select[@id='DriversAddPniDetails_embedded_questions_list_DriverYearsLicensed']")
	public WebElement selectYearLicensed;

	@FindBy(how = How.XPATH, using = "//*[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']")
	public WebElement selectAccidentClaimOrNot;

	@FindBy(how = How.XPATH, using = "//*[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']")
	public WebElement selectTicketVoilationOrNot;

	@FindBy(how = How.XPATH, using = "//loading-button[contains(.,'Continue')]")
	public WebElement clickContinue;

	public void chooseGender() {
		selectGender.click();
	}

	public void chooseMaritalStatus(String maritalStatus) {
		Select maritalstatus = new Select(selectMaritalStatus);
		maritalstatus.selectByVisibleText(maritalStatus);
	}

	public void chooseLevelOfEducation(String education) {
		Select levelOfEdu = new Select(selectLevelOfEducation);
		levelOfEdu.selectByVisibleText(education);
	}

	public void chooseEmployementStatus(String employementStatus) {
		Select driverEmployementStatus = new Select(selectEmployementStatus);
		driverEmployementStatus.selectByVisibleText(employementStatus);
	}

	public void driverOccupation(String occupation) {
		fillOccupation.sendKeys(occupation);
	}

	public void driverSSN(String ssn) {
		fillSSN.sendKeys(ssn);
	}

	public void choosePrimaryResidence(String residence) {
		Select driverResidence = new Select(selectPrimaryResidence);
		driverResidence.selectByVisibleText(residence);
	}

	public void chooseLatestMovedIn(String latestMovedInDate) {
		Select driverMovedInDate = new Select(selectMovedInLast2Month);
		driverMovedInDate.selectByVisibleText(latestMovedInDate);
	}

	public void chooseLicenseStatus(String licenseStatus) {
		Select driverLicenseStatus = new Select(selectLicenseStatus);
		driverLicenseStatus.selectByVisibleText(licenseStatus);
	}

	public void chooseYearLicensed(String yearLicensed) {
		Select driverYearLicensed = new Select(selectYearLicensed);
		driverYearLicensed.selectByVisibleText(yearLicensed);
	}

	public void selectAccidentClaimOrNot() {
		selectAccidentClaimOrNot.click();
	}

	public void selectTicketVoilationOrNot() {
		selectTicketVoilationOrNot.click();
	}

	public void selectContinueForNextPage() {
		clickContinue.click();
	}

	public void selectContinueToReviewPage() {
		clickContinue.click();
	}

	public void selectContinueToFinalDetailPage() {
		clickContinue.click();
	}
}