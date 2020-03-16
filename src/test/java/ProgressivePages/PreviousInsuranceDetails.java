package ProgressivePages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PreviousInsuranceDetails {
	WebDriver driver;
	
	public PreviousInsuranceDetails(WebDriver driver) {
		this.driver = driver;
	}
	By doYouHaveInsurance = By.id("FinalDetailsFormModel_InsuranceToday_Value_N");
	By doYouHaveInsuranceLast_31days = By.id("FinalDetailsFormModel_InsuranceLastMonth_Value_N");
	By nonAutoPolicyNo = By.id("FinalDetailsFormModel_OtherPolicies_Value_N");
	By email = By.id("FinalDetailsFormModel_PrimaryEmailAddress_Value");
	By residentInHome = By.id("FinalDetailsFormModel_TotalResidents_Value");
	By noOfInjuryClaim = By.id("FinalDetailsFormModel_TotalPipClaimsCount_Value");
	By continueButton = By.xpath("//input[@text='Continue']");

	public void click_No_on_having_insurance() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.findElement(doYouHaveInsurance).click();
	}

	public void click_No_on_having_insurance_last_31_days() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(doYouHaveInsuranceLast_31days).click();
	}

	public void clickNonAutoPolicyCo() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(nonAutoPolicyNo).click();
	}

	public void enterEmail(String value) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(email).sendKeys(value);
	}

	public void selectResidentNumber(String value) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(residentInHome);
		Select select = new Select(driver.findElement(residentInHome));
		select.selectByValue(value);
	}

	public void selectInjuryClaimNumbers(String value) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(residentInHome);
		Select select = new Select(driver.findElement(noOfInjuryClaim));
		select.selectByValue(value);
	}

	public void clickContinue() throws InterruptedException {
		driver.findElement(continueButton).click();
	}

}
