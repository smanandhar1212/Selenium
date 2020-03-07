package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleObject {
	// class level Variable
	WebDriver driver;
	 
	public GoogleObject(WebDriver drive) {
		this.driver = driver;
		PageFactory.initElements(drive,this);
	}
		
	@FindBy(how = How.XPATH, using = "//input[@name='q']")
	public WebElement googleSearchBox;
	
	@FindBy(how = How.XPATH, using = "//input[@name='btnk']")
	public WebElement searchBtn;
	
	
	
	public void GoogleSearch(String search) {
		googleSearchBox.sendKeys(search);
		searchBtn.sendKeys(Keys.RETURN);
	}
}
