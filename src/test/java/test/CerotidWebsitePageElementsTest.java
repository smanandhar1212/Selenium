package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; // what is TDD and BDD, DDD? what is POM module
import org.openqa.selenium.support.ui.Select;

import pages.CerotidWebsitePageElements;
												// Test Driven Development, Behavior Driven Development, Data Driven Development

public class CerotidWebsitePageElementsTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		invokeBrowserCerotidPage();
		fillForm();

	}

	public static void invokeBrowserCerotidPage() throws InterruptedException {
		// set the system path to point to the chromedriver.exe.
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");

		// utilizing the driver global variable and creating a new chrome driver
		driver = new ChromeDriver();

		driver.navigate().to("http://www.cerotid.com");
		driver.manage().window().maximize();
		TimeUnit.SECONDS.sleep(4);
		driver.navigate().refresh();

		String titleName = "Cerotid";
		if (driver.getTitle().contains(titleName)) {
			System.out.println(driver.getTitle() + "----------------------- was launched");
		} else {
			System.out.println("Expected title" + titleName + " was not seen");
			System.out.println("Test Fail-----------Ending Test");
			driver.quit();
			driver.close();
		}
	}

	public static void fillForm() {
		// Select course
		Select chooseCourse = new Select(CerotidWebsitePageElements.selectCourse(driver));
		chooseCourse.selectByVisibleText("QA Automation");
		
		// Select Session
		Select selectSession = new Select(CerotidWebsitePageElements.chooseSession(driver));
		selectSession.selectByVisibleText("Upcoming Session");
		
		//Enter Name
		CerotidWebsitePageElements.inputName(driver).sendKeys("John Doe");
		
		// Enter Address
		CerotidWebsitePageElements.inputAddress(driver).sendKeys("11569 Address SomeWher");
		
		//Enter City
		CerotidWebsitePageElements.inputCity(driver).sendKeys("Irving");
		
		//select State
		Select selectState = new Select(CerotidWebsitePageElements.selectState(driver));
		selectState.selectByVisibleText("TX");
		
		CerotidWebsitePageElements.inputZipCode(driver).sendKeys("75038");
		
		CerotidWebsitePageElements.inputEmail(driver).sendKeys("dev.xxxxxxxxx@gmail.com");
		
		CerotidWebsitePageElements.inputPhone(driver).sendKeys("972-xxx-xxxx");
		
		Select selectVisaStatus = new Select(CerotidWebsitePageElements.selectVisaStatus(driver));
		selectVisaStatus.selectByVisibleText("GreenCard");
		
		Select selectMediaSource = new Select(CerotidWebsitePageElements.selectMediaSource(driver));
		selectMediaSource.selectByVisibleText("Other");
		
		CerotidWebsitePageElements.ableToRelocate(driver).click();
		
		
		// Sabin has told that, you have some internal projects also?
		//how long will take to get the projects?
		// 
		
		
		
	}

}
