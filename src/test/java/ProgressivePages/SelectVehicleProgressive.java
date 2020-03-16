package ProgressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectVehicleProgressive {
	
		WebDriver driver = null;

		public SelectVehicleProgressive(WebDriver driver) {
			this.driver = driver;
		}
		
		//*[@id="VehiclesNew_embedded_questions_list_Year"]/ul/li[4]
		
		//*[@id="UnlistedVehicleFormModel_Year_Value"]/li[3]
		// /html/body/div[1]/form/div/div/div/div[2]/div/div[3]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div/div[2]/div[2]/ul/li[3]
		
		By year = By.xpath("*[@id=\"VehiclesNew_embedded_questions_list_Year\"]/ul/li[4]");
		By make = By.xpath("//ul[@id='UnlistedVehicleFormModel_Make_Value']/li[28]"); 
		By type = By.xpath("//ul[@id='UnlistedVehicleFormModel_Model_Value']/li[2]");
		By bodyType = By.name("UnlistedVehicleFormModel.BodyStyle.Value");
		By primaryUse = By.id("UnlistedVehicleFormModel_VehicleUse_Value");
		By zipCode1 = By.xpath("//input[@name='UnlistedVehicleFormModel.GaragingZip.Value']");
		By ownOrLease =By.id("UnlistedVehicleFormModel_OwnOrLease_Value");
		By ownershipPeriod = By.id("UnlistedVehicleFormModel_LengthOfOwnership_Value");
		By aebYesNo = By.xpath("//input[@name='UnlistedVehicleFormModel.AutomaticEmergencyBraking.Value']");
		By blindSpotYesNo = By.xpath("//input[@name='UnlistedVehicleFormModel.BlindSpotWarning.Value']");
		By done = By.xpath("//input[@text='Done']");
		By continueNextPage = By.xpath("//input[@text='Continue']");
		
		public void selectVehicleYear(String carYear) {
			driver.findElement(year).click();
			driver.findElement(make).click();
			driver.findElement(type).click();
		}
		
		public void selectBodyType(String type) throws InterruptedException {
			driver.findElement(bodyType).click();
			Thread.sleep(1000);
			Select body = new Select(driver.findElement(bodyType));
			body.selectByVisibleText(type);
		}
		
		public void primaryUseofVehicle(String value) throws InterruptedException {
			driver.findElement(primaryUse).click();
			Thread.sleep(1000);
			Select item = new Select(driver.findElement(primaryUse));
			item.selectByVisibleText(value);
		}
		
//		public void enterZip (String code) {
//			driver.findElement(zipCode1).clear();
//			driver.findElement(zipCode1).sendKeys(code);	
//		}
		
		public void ownOrLeaseCar(String value ) throws InterruptedException {
			driver.findElement(ownOrLease).click();
			Thread.sleep(1000);
			Select items =new Select(driver.findElement(ownOrLease));
			items.selectByVisibleText(value);
		}
		
		public void yearOfOwnership(String value) throws InterruptedException {
			driver.findElement(ownershipPeriod).click();
			Thread.sleep(1000);
			Select item = new Select(driver.findElement(ownershipPeriod));
			item.selectByValue(value);
		}
		
		public void clickAEBYes() {
			driver.findElement(aebYesNo).click();
		}

		public void clickBlindSpotYes() {
			driver.findElement(blindSpotYesNo).click();
		}
		
		public void clickDone() throws InterruptedException {
			driver.findElement(done).click();
			Thread.sleep(2000);
		}
		
		public void clickContinue() throws InterruptedException {
			driver.findElement(continueNextPage).click();
		}
		
}
