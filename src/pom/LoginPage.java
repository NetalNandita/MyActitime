package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//nobr[text()='actiTIME 2017.1']")
	private WebElement version;
	
	@FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	 public void setUsername(String un)
	 {
		 unTB.sendKeys(un);
	 }

	 public void setPassword(String pw)
	 {
		 pwTB.sendKeys(pw);
	 }
	 
	 public void clickOnLogin()
	 {
		loginBtn.click(); 
	 }
	 public void clickOnLogout()
	 {
		 logout.click();
	 }
	public void verifyVersion(String eVersion)
	{
		
		String aVersion =version.getText();
		Assert.assertEquals(aVersion , eVersion);
		
	}
	
	public void verifyErrIsPresent(SoftAssert s)
	{
		try
		{		
		WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(errMsg));
		Reporter.log("Error message is Displayed",true);
	}
	catch(Exception e)
	{
		Reporter.log("Error message is Not Displayed",true);
		s.fail();
	}
	
	}
	
 
}
