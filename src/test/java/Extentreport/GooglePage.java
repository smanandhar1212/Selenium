package Extentreport;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	//class level variables
	WebDriver driver;
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//Finding Elements
	@FindBy(how = How.XPATH, using = "//input[@name='q']")
	public WebElement searchBox;
	
	@FindBy(how = How.XPATH, using = "//input[@name='btnK']")
	public WebElement searchBtn;
	
	
	public void googleSearch(String search) {
		searchBox.sendKeys(search);
		searchBtn.sendKeys(Keys.RETURN);
		
	}
	
	

}
