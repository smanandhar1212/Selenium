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
		// time out

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// get title
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
		PersonalInformationOBJ.selectSuffix("");
		PersonalInformationOBJ.enterDOB("12291995");
		PersonalInformationOBJ.enterApartmentNo("601");
		PersonalInformationOBJ.selectPOBoxMilitiry();
		PersonalInformationOBJ.enterStreetAddress("3762 W Pionner Drive");
		PersonalInformationOBJ.clickStartMyQuote();
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void selectVehicleProgressive() throws InterruptedException {
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ = new SelectVehicleProgressive(driver);

		selectVehicleProgressiveOBJ.chooseVehicleYear("2020");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.chooseVehicleMake("AUDI");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.chooseVehicleModel("A5");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.chooseBodyType("4DR 4CYL");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.choosePrimaryUse("Personal (to/from work or school, errands, pleasure)");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.chooseOwnOrLease("Own");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.chooseOwnPeriod("1 year - 3 years");
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.chooseBlindSpotWarning();
		selectVehicleProgressiveOBJ.clickOnDone();
		Thread.sleep(3000);
		selectVehicleProgressiveOBJ.continueToNextPage();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void DriverInformation() throws InterruptedException {
		driverInformationOBJ = new DriverInformation(driver);

		driverInformationOBJ.chooseGender();
		driverInformationOBJ.chooseMaritalStatus("Single");
		driverInformationOBJ.chooseLevelOfEducation("College degree");
		driverInformationOBJ.chooseEmployementStatus("Employed");
		Thread.sleep(3000);
		driverInformationOBJ.driverOccupation("Information Tech Engineer - Software");
		driverInformationOBJ.driverSSN("1234567890");
		Thread.sleep(3000);
		driverInformationOBJ.choosePrimaryResidence("Rent");
		driverInformationOBJ.chooseLatestMovedIn("No");
		Thread.sleep(3000);
		driverInformationOBJ.chooseLicenseStatus("Valid");
		driverInformationOBJ.chooseYearLicensed("3 years or more");
		Thread.sleep(3000);
		driverInformationOBJ.selectAccidentClaimOrNot();
		Thread.sleep(3000);
		driverInformationOBJ.selectTicketVoilationOrNot();
		Thread.sleep(3000);
		driverInformationOBJ.selectContinueForNextPage();
		Thread.sleep(4000);
		driverInformationOBJ.selectContinueToReviewPage();
		Thread.sleep(4000);
		driverInformationOBJ.selectContinueToFinalDetailPage();
		Thread.sleep(4000);
	}

	@Test(priority = 5)
	public void ConitnueFromAddDriversPage() throws InterruptedException {
		addDriversPageObj = new AddDriversPage(driver);

		addDriversPageObj.clickConitnue();
	}

	@Test(priority = 6)
	public void fillPreviousInsuranceDetails() throws InterruptedException {
		previousInsuranceDetailsOBJ = new PreviousInsuranceDetails(driver);

		previousInsuranceDetailsOBJ.haveAutoInsuranceToday();
		Thread.sleep(2000);
		previousInsuranceDetailsOBJ.autoInsurancePolicyPeriod("1 to 3 years");
		Thread.sleep(2000);
		previousInsuranceDetailsOBJ.currentInsuredLimit("$50,000/$100,000");
		Thread.sleep(2000);
		previousInsuranceDetailsOBJ.haveNonAutoPolicy();
		previousInsuranceDetailsOBJ.hasPastAutoPolicyWithUs();
		Thread.sleep(2000);
		previousInsuranceDetailsOBJ.AutoPolicyStartingDate("04212020");
		previousInsuranceDetailsOBJ.policyHolderEmailId("jenefer.winget@gmail.com");
		Thread.sleep(2000);
		previousInsuranceDetailsOBJ.policyHolderFamilyNumber("3");
		Thread.sleep(2000);
		previousInsuranceDetailsOBJ.previousNoOfInjuryClaims("0");
		previousInsuranceDetailsOBJ.clickContinueToSnapShotwPage();
		Thread.sleep(4000);
		previousInsuranceDetailsOBJ.snapShotEnrolled();
		previousInsuranceDetailsOBJ.snapShotEnrollementOption();
		Thread.sleep(4000);
		previousInsuranceDetailsOBJ.clickContinueToBundleInsurancePage();
		Thread.sleep(4000);
		previousInsuranceDetailsOBJ.clickToFinalRatePage();
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
