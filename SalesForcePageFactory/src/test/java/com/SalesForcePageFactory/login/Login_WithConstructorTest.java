package com.SalesForcePageFactory.login;

import org.testng.annotations.Test;

import com.SalesForcePageFactory.base.BaseTest;
import com.SalesForcePageFactory.loginPage.Login_WithConstructor;

public class Login_WithConstructorTest extends BaseTest{
	
	
	
	@Test(priority=1)

	public void loginWithValidCredentialTest() {
		log.info("login test started");
		Login_WithConstructor login = new Login_WithConstructor(driver);
		login.loginPage("dddd", "1234");
		log.info("user name and password inserted");
		log.info("log in test finish");
	
	}
	
	
}
