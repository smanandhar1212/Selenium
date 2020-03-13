package ProgressivePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddressPageProgressive {

	   // Class level variable
		WebDriver driver = null;

		@FindBy(how = How.XPATH, using = "//input[@id='zipCode_overlay']")
		public WebElement autoLink;
		
		@FindBy(how = How.XPATH, using = "//input[@id='qsButton_overlay']")
		public WebElement searchBtn;
		
		
		public AddressPageProgressive(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);

		}
		
		public void GetQuoteByAutoTest() {
			autoLink.sendKeys("75061");
			searchBtn.sendKeys(Keys.RETURN);
			
		}
		
}

