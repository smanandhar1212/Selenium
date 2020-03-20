package ProgressivePages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectVehicleProgressive {

	WebDriver driver;

	public SelectVehicleProgressive(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void chooseVehicleYear(String vehicleYear) {
		WebElement buildYearElements = driver
				.findElement(By.xpath("//*[@name='VehiclesNew_embedded_questions_list_Year']"));
		List<WebElement> buildYearList = buildYearElements.findElements(By.tagName("li"));
		for (WebElement selectBuildYear : buildYearList) {
			if (selectBuildYear.getText().equalsIgnoreCase(vehicleYear)) {
				selectBuildYear.click();
				break;
			}
		}
	}

	public void chooseVehicleMake(String vehicleMake) {
		WebElement vehicleMakeElement = driver
				.findElement(By.xpath("//*[@name='VehiclesNew_embedded_questions_list_Make']"));
		List<WebElement> vehicleMakeList = vehicleMakeElement.findElements(By.tagName("li"));
		for (WebElement selectVehicleMake : vehicleMakeList) {
			if (selectVehicleMake.getText().equalsIgnoreCase(vehicleMake)) {
				selectVehicleMake.click();
				break;
			}
		}
	}

	public void chooseVehicleModel(String vehicleModel) {
		WebElement vehicleModelElement = driver
				.findElement(By.xpath("//*[@name='VehiclesNew_embedded_questions_list_Model']"));
		List<WebElement> vehicleModelList = vehicleModelElement.findElements(By.tagName("li"));
		for (WebElement selectVehicleModel : vehicleModelList) {
			if (selectVehicleModel.getText().equalsIgnoreCase(vehicleModel)) {
				selectVehicleModel.click();
				break;
			}
		}
	}

	@FindBy(how = How.XPATH, using = "//select[@id='VehiclesNew_embedded_questions_list_BodyStyle']")
	public WebElement chooseBodyType;

	@FindBy(how = How.XPATH, using = "//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']")
	public WebElement choosePrimaryUse;

	@FindBy(how = How.XPATH, using = "//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']")
	public WebElement chooseOwnOrLease;

	@FindBy(how = How.XPATH, using = "//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']")
	public WebElement chooseOwnPeriod;

	@FindBy(how = How.XPATH, using = "//*[@id='VehiclesNew_embedded_questions_list_BlindSpotWarning_Y']")
	public WebElement chooseBlindSpotWarning;

	@FindBy(how = How.XPATH, using = "//loading-button[contains(.,'Done')]")
	public WebElement clickOnDone;

	@FindBy(how = How.XPATH, using = "//loading-button[contains(.,'Continue')]")
	public WebElement clickContinue;

	public void chooseBodyType(String bodyType) {
		Select selectVehicleBodyType = new Select(chooseBodyType);
		selectVehicleBodyType.selectByVisibleText(bodyType);
	}

	public void choosePrimaryUse(String primaryUse) {
		Select selectVehiclePrimaryUse = new Select(choosePrimaryUse);
		selectVehiclePrimaryUse.selectByVisibleText(primaryUse);
	}

	public void chooseOwnOrLease(String OwnOrLease) {
		Select selectVehicleOwnOrLease = new Select(chooseOwnOrLease);
		selectVehicleOwnOrLease.selectByVisibleText(OwnOrLease);
	}

	public void chooseOwnPeriod(String OwnPeriod) {
		Select selectVehicleOwnPeriod = new Select(chooseOwnPeriod);
		selectVehicleOwnPeriod.selectByVisibleText(OwnPeriod);
	}

	public void chooseBlindSpotWarning() {
		chooseBlindSpotWarning.click();
	}

	public void clickOnDone() {
		clickOnDone.click();
	}

	public void continueToNextPage() {
		clickContinue.click();
	}
}