package com.qa.Banking.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Banking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		
		
		logger.info("Url is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Enter username");
		
		lp.setPassword(password);
		logger.info("Enter password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
