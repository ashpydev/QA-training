package tests;

import org.testng.annotations.Test;

import pages.login;

public class loginTest extends baseTest{
	
	@Test
	public void loginToApplication() {
		login log = new login();
		log.loginApp();
	} 

}
