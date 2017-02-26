package script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import generic.BaseTest;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class verifyLoginLogout extends BaseTest
{

	@Test
	public void testVerifyLoginLogout()
	{
		//enter valid un
		LoginPage l= new LoginPage(driver);
		l.setUsername("admin");
		
		//enter valid pw
		l.setPassword("manager");
		//click on login
		l.clickOnLogin();
		//verify home page is displayed
		l.verifyTitle("actiTIME - Login");
		//click on logout
		EnterTimeTrackPage e= new EnterTimeTrackPage(driver);
		e.logout();
		//verify loginPage is displayed
		e.verifyTitle("actiTIME - Enter Time Track");
	}
	
	
}
