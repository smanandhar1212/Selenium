package ProgressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectVehicleProgressive {

	WebDriver driver = null;

	public SelectVehicleProgressive(WebDriver driver) {
		this.driver = driver;
	}
	// *[@id="VehiclesNew_embedded_questions_list_Year"]/ul/li[4]

	// *[@id="VehiclesNew_embedded_questions_list_Year"]/ul/li[4]
	// *[@id="UnlistedVehicleFormModel_Year_Value"]/li[3]
	// /html/body/div[1]/form/div/div/div/div[2]/div/div[3]/div[4]/div/div/div[1]/div/div[2]/div[5]/div/div/div[2]/div[2]/ul/li[3]
	// *[@id="VehiclesNew_embedded_questions_list_Year"]/ul
	// *[@id="Edit_Button_On_0"]/child-outlet-backend-scope/sliding-child-router-outlet/vehicle-details/small-layout-child-template/div/div/vehicle-shared-ymm-questions/div[2]/div/div[1]/a
	// *[@id="VehiclesNew_embedded_questions_list_Make"]/ul/li[4]

	By vin = By.xpath("//*[@id=\"Edit_Button_On_0\"]/child-outlet-backend-scope/sliding-child-router-outlet/vehicle-details/small-layout-child-template/div/div/vehicle-shared-ymm-questions/div[2]/div/div[1]/a");
	By vinNumber = By.xpath("//*[@id='VehiclesNew_embedded_questions_list_Vin']");
	By clickContinueButton = By.xpath("//*[@id=\"Div1\"]/forward-navigation/loading-button/button");

//		By year = By.xpath("*[@id=\"VehiclesNew_embedded_questions_list_Year\"]/ul/li[5]");
//		By make = By.xpath("//ul[@id='UnlistedVehicleFormModel_Make_Value']/li[3]"); 
//		By type = By.xpath("//ul[@id='UnlistedVehicleFormModel_Model_Value']/li[2]");
//		By bodyType = By.name("UnlistedVehicleFormModel.BodyStyle.Value");
	//*[@id="VehiclesNew_embedded_questions_list_VehicleUse"]/option[1]
	//*[@id="VehiclesNew_embedded_questions_list_VehicleUse"]/option[2]
	By primaryUse = By.xpath("//*[@id=\"VehiclesNew_embedded_questions_list_VehicleUse\"]/option[2]");
	By zipCode1 = By.xpath("//input[@name='UnlistedVehicleFormModel.GaragingZip.Value']");
	By ownOrLease = By.id("UnlistedVehicleFormModel_OwnOrLease_Value");
	By ownershipPeriod = By.id("UnlistedVehicleFormModel_LengthOfOwnership_Value");
	By aebYesNo = By.xpath("//input[@name='UnlistedVehicleFormModel.AutomaticEmergencyBraking.Value']");
	By blindSpotYesNo = By.xpath("//input[@name='UnlistedVehicleFormModel.BlindSpotWarning.Value']");
	By done = By.xpath("//input[@text='Done']");
	By continueNextPage = By.xpath("//input[@text='Continue']");

	public void selectVin(String VinNo) {
		driver.findElement(vin).click();
	}

	public void enterVin(String VinNo) {
		driver.findElement(vinNumber).sendKeys(VinNo);
	}

	public void clickContinueButton() throws InterruptedException {
		driver.findElement(clickContinueButton).click();
	}

//		public void selectVehicleYear(String carYear) {
//			driver.findElement(year).click();
//			driver.findElement(make).click();
//			driver.findElement(type).click();
//		}
//		
//
//		public void selectVehicleMake(String type) throws InterruptedException {
//			driver.findElement(make).click();
//			Select makeType = new Select(driver.findElement(make));
//			makeType.selectByVisibleText(type);
//		}
//		
//		public void selectType(String type) throws InterruptedException {
//			driver.findElement(this.type).click();
//			Select type1 = new Select(driver.findElement(this.type));
//			type1.selectByVisibleText(type);
//		}
//		
//		public void selectBodyType(String type) throws InterruptedException {
//			driver.findElement(bodyType).click();
//			Select body = new Select(driver.findElement(bodyType));
//			body.selectByVisibleText(type);
//		}
//		
	public void primaryUse(String primaryUseName) {
		WebElement element = driver.findElement(primaryUse);
		Select choosePrimaryUse = new Select(element);
		choosePrimaryUse.selectByVisibleText(primaryUseName);
	}

	public void enterZip(String code) {
		driver.findElement(zipCode1).clear();
		driver.findElement(zipCode1).sendKeys(code);
	}

	public void ownOrLeaseCar(String value) throws InterruptedException {
		driver.findElement(ownOrLease).click();
		Select items = new Select(driver.findElement(ownOrLease));
		items.selectByVisibleText(value);
	}

	public void yearOfOwnership(String value) throws InterruptedException {
		driver.findElement(ownershipPeriod).click();
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
	}

	public void clickContinue() throws InterruptedException {
		driver.findElement(continueNextPage).click();
	}

}
