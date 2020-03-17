package ProgressiveTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ProgressivePages.AddressPageProgressive;
import ProgressivePages.HomePageProgressive;
import ProgressivePages.PersonalInformation;
import ProgressivePages.SelectVehicleProgressive;
import ProgressivePages.DriverInformation;
import ProgressivePages.AddDriversPage;
import ProgressivePages.PreviousInsuranceDetails;
import ProgressivePages.SnapShot;
import reportProgressive.ExtentReportProgressive;

public class GetQuoteByAutoTest {
	WebDriver driver;
	PersonalInformation PersonalInformationOBJ;
	SelectVehicleProgressive selectVehicleProgressiveOBJ;
	DriverInformation driverInformationOBJ;
	AddDriversPage addDriversPageObj;
	PreviousInsuranceDetails previousInsuranceDetailsOBJ;
	SnapShot snapShotOBJ;
	ExtentReportProgressive extentReportProgressive;



	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "./libs/chromedriver");
		driver = new ChromeDriver();

		// invoking the webBrowser
		driver.get("https://google.com");

		// Maximize the browser
		driver.manage().window().maximize();
		//time out
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get title
		String s = driver.getTitle();
		System.out.println(s);
	}

	public void invokeBrowser() {

		driver.get("https://www.progressive.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void homePage() {
		invokeBrowser();
		HomePageProgressive home = new HomePageProgressive(driver);
		home.GetQuoteByAutoTest();

	}

	@Test(priority = 1)
	public void addressPageProgressive() {
		AddressPageProgressive address = new AddressPageProgressive(driver);
		address.GetQuoteByAutoTest();

	}
	
	@Test(priority = 2)
	public void PersonalInformation() throws InterruptedException {
		Thread.sleep(4000);
		PersonalInformationOBJ = new PersonalInformation(driver);

		PersonalInformationOBJ.enterFirstName("Jenefer");
		PersonalInformationOBJ.enterMiddleName("RL");
		PersonalInformationOBJ.enterLastName("Winget");
		PersonalInformationOBJ.enterDOB("12291995");
		PersonalInformationOBJ.enterCity("Irving");
		PersonalInformationOBJ.enterZipcode("75061");
		PersonalInformationOBJ.enterStreetName("3762 W Pionner Drive");
		PersonalInformationOBJ.enterAptNo("601");
		PersonalInformationOBJ.GetQuoteByAutoTest();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 3)
	public void selectVehicleProgressive() throws InterruptedException {
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ = new SelectVehicleProgressive(driver);
		
		selectVehicleProgressiveOBJ.selectVin("");
		selectVehicleProgressiveOBJ.enterVin("5YFBURHEXEP010694");
		selectVehicleProgressiveOBJ.clickContinueButton();
		
//		selectVehicleProgressiveOBJ.selectVehicleYear("2018");
//		selectVehicleProgressiveOBJ.selectVehicleMake("Audi");
//		selectVehicleProgressiveOBJ.selectType("A4");
//		selectVehicleProgressiveOBJ.selectBodyType("2DR 4CYL");
		
		selectVehicleProgressiveOBJ.primaryUse("Personal (to/from work or school, errands, pleasure)");
		selectVehicleProgressiveOBJ.enterZip("75061");
		selectVehicleProgressiveOBJ.ownOrLeaseCar("Own");
		selectVehicleProgressiveOBJ.yearOfOwnership("string:B");
		selectVehicleProgressiveOBJ.clickAEBYes();
		selectVehicleProgressiveOBJ.clickBlindSpotYes();
		selectVehicleProgressiveOBJ.clickDone();
		selectVehicleProgressiveOBJ.clickContinue();
	}

	@Test(priority = 4)
	public void DriverInformation() throws InterruptedException {
		driverInformationOBJ = new DriverInformation(driver);
		Thread.sleep(5000);
		driverInformationOBJ.selectGenderFemale();
		driverInformationOBJ.selectGenderMale();
		driverInformationOBJ.selectMaritialStatus("string:S");
		driverInformationOBJ.selectEducation("string:7");
		driverInformationOBJ.selectEmployment("string:EM");
		driverInformationOBJ.selectOccupation("Information Tech Engineer - Software");
		driverInformationOBJ.enterSSN("1838484848");
		driverInformationOBJ.SelectPrimaryResedence("string:H");
		driverInformationOBJ.selectMovedTime("string:N");
		driverInformationOBJ.selectYearsLicenced("string:3");
		driverInformationOBJ.clickAccidentNo();
		driverInformationOBJ.clickTicketsNo();
		driverInformationOBJ.clickContinue();
	}
	
	@Test(priority = 5)
	public void ConitnueFromAddDriversPage() throws InterruptedException {
		addDriversPageObj = new AddDriversPage(driver);
		Thread.sleep(1000);
		addDriversPageObj.clickConitnue();
	}
	
	@Test(priority = 6)
	public void fillPreviousInsuranceDetails() throws InterruptedException {
		previousInsuranceDetailsOBJ = new PreviousInsuranceDetails(driver);
		
		previousInsuranceDetailsOBJ.click_No_on_having_insurance();
		previousInsuranceDetailsOBJ.click_No_on_having_insurance_last_31_days();
		previousInsuranceDetailsOBJ.clickNonAutoPolicyCo();
		previousInsuranceDetailsOBJ.enterEmail("celinamdr02a@gmail.com");
		previousInsuranceDetailsOBJ.selectResidentNumber("string:2");
		previousInsuranceDetailsOBJ.selectInjuryClaimNumbers("string:0");
		previousInsuranceDetailsOBJ.clickContinue();
	}
	
	@Test(priority = 7)
	public void selectSnapShot() throws InterruptedException {
		snapShotOBJ = new SnapShot(driver);
		snapShotOBJ.clickNOonSnapShot();
		snapShotOBJ.clickContinue();
		snapShotOBJ.clickContinue1();
	}

	@AfterTest
	public void tearDown1() {

		// driver.close();
		// driver.quit();
	}
	

}
