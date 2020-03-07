package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CerotidObjectModelWithMethods {

	// Class level variable

	WebDriver driver = null;

	// Creating By obj and storing finding element
	By selectCourse = By.xpath("//select[@id='classType']");
	By selectSession = By.xpath("//select[@id='sessionType']");
	By enterName = By.xpath("//select[contains@id='name']");
	
	public CerotidObjectModelWithMethods(WebDriver driver) {
		this.driver = driver;
	}

	// Choose Course
	public void selectCourse(String courseName) {
		// creating new webelement obj
		WebElement element = driver.findElement(selectCourse);
		Select chooseCourse = new Select(element);
		chooseCourse.selectByVisibleText(courseName);
	}
	
	public void selectSession(String sessionName) {
		
		WebElement element = driver.findElement(selectSession);
		Select chooseSession = new Select(element);
		chooseSession.selectByVisibleText(sessionName);
	}
	
public void eterName(String name) {
		
		driver.findElement(enterName).sendKeys(name);
	}

}
