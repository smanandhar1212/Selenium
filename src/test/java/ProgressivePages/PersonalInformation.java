package ProgressivePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformation {

	WebDriver driver = null;
	
	@FindBy(how = How.XPATH, using = "//input[@id='NameAndAddressEdit_embedded_questions_list_FirstName']")
	public WebElement sendFirstName;

	
	@FindBy(how = How.XPATH, using = "//input[@name='NameAndAddressEdit_embedded_questions_list_MiddleInitial']")
	public WebElement sendMiddleName;	
	
	@FindBy(how = How.XPATH, using = "//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']")
	public WebElement sendLastName;
	
	@FindBy(how = How.XPATH, using = "//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']")
	public WebElement sendSuffix;
	
	@FindBy(how = How.XPATH, using = "//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']")
	public WebElement sendDateOfBirth;
	
	@FindBy(how = How.XPATH, using = "//input[@id='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
	public WebElement sendStreetName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='NameAndAddressEdit_embedded_questions_list_ApartmentUnit']")
	public WebElement sendUnitNumber;
	
	@FindBy(how = How.XPATH, using = "//input[@id='NameAndAddressEdit_embedded_questions_list_MailingZipType']")
	public WebElement clickBtn;
	
	
	public PersonalInformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);

	}

	
	public void GetQuoteByAutoTest() {
		sendFirstName.sendKeys("John");
		sendMiddleName.sendKeys(" ");
		sendLastName.sendKeys("Mayor");
		sendSuffix.click();
		sendDateOfBirth.sendKeys("10/01/1995");
		sendStreetName.sendKeys("3839 W Pioneer Drive ");
		sendUnitNumber.sendKeys("101");
		clickBtn.sendKeys(Keys.RETURN);
		
	}
}
