package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;


public class EnterTimeTrackPage extends BasePage
{

		
	

	@FindBy(id="logoutLink")
	private WebElement lt; 

	public void logout()
	{
		lt.click();
	}

	public EnterTimeTrackPage(WebDriver driver) {
		super(driver);
}
}

