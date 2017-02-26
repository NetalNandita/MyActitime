package script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import generic.BaseTest;
import pom.LoginPage;

public class verifyVersion extends BaseTest 
{
	@Test
	public void testVerifyVersion()
	{
		LoginPage l=new LoginPage(driver);
		l.verifyVersion("actiTIME 2016.1");
		
	}

}
