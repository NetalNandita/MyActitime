package script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;

import pom.LoginPage;

public class verifyInvalidLogin extends BaseTest
{

	@Test
	public void testVerifyInvalidLogin()
	{
		SoftAssert s= new SoftAssert();
		LoginPage l= new LoginPage(driver);
		l.setUsername("abc");
	
	l.setPassword("xyz");
	l.clickOnLogin();
	
	l.verifyErrIsPresent(s);
	s.assertAll();

	
	
	
	
	}
	
	
	
	
}
