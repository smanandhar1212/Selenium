package ProgressivePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

	WebDriver driver = null;

	By firstName = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_FirstName']");
	By middleName = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_MiddleInitial']");
	By lastName = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_LastName']");
	By dob = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_DateOfBirth']");
	By streetName = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']");
	By apt = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_ApartmentUnit']");
	By city = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_City']");
	By zipCode = By.xpath("//input[@name='NameAndAddressEdit_embedded_questions_list_ZipCode']");

	By startPersonalInformation = By.xpath("//button[contains(.,'Okay, start my quote.')]");

	public PersonalInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterFirstName(String fName) {
		driver.findElement(firstName).sendKeys(fName);
	}

	public void enterMiddleName(String middleInitial) {
		driver.findElement(middleName).sendKeys(middleInitial);
	}

	public void enterLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}

	public void enterDOB(String date) {
		driver.findElement(dob).sendKeys(date);
	}

	public void enterStreetName(String street) {
		driver.findElement(streetName).sendKeys(street);

	}

	public void enterAptNo(String aptNo) {
		driver.findElement(apt).sendKeys(aptNo);

	}

	public void enterCity(String cityName) {
		driver.findElement(city).clear();
		driver.findElement(city).sendKeys(cityName);
	}

	public void enterZipcode(String code) throws InterruptedException {
		driver.findElement(zipCode).clear();
		driver.findElement(zipCode).sendKeys(code);
		Thread.sleep(2000);

	}

	public void GetQuoteByAutoTest() {
		driver.findElement(startPersonalInformation).click();

	}

}
