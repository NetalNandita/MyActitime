package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage // actions which are common

{
	public WebDriver driver;

	

	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void verifyTitle(String eTitle) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.titleIs(eTitle));
	}
}
