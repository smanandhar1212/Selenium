package ProgressivePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageProgressive {

	// Class level variable
	WebDriver driver = null;

	@FindBy(how = How.XPATH, using = "//img[@src='https://www.progressive.com/Content/images/DomainProgressive/wh3/base/icons/products/blue/AU.svg']")

	public WebElement autoLink;

	public HomePageProgressive(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void GetQuoteByAutoTest() {
		autoLink.click();

	}
}
