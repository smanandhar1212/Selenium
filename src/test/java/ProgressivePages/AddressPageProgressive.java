package ProgressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddressPageProgressive {

	// Class level variable
		WebDriver driver = null;

		@FindBy(how = How.XPATH, using = "//input[zipCode_overlay']")
		
		
		
		public WebElement autoLink;

		public AddressPageProgressive(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);

		}
		
		public void GetQuoteByAutoTest() {
			autoLink.click();
			
		}
}
