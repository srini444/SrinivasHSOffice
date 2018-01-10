package com.test.automation.uiAutomation.homepage;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

import junit.framework.Assert;

public class TC001_VerifyLoginWithInvalidCredentails extends TestBase
{
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentails.class.getName()); 
	HomePage homepage;
	
	@BeforeTest
	public void setUp() 
	{
		init();
	}
	@Test
	public void verifyLoginWithInvalidCredentails () throws InterruptedException
	{
		
		log.info("==============Staring VerifyLoginWithInvalidCredentails Test==============");
		homepage = new HomePage(driver);
		homepage.loginToApplicatio("Test@gmail.com", "Password123");
		Assert.assertEquals(homepage.getInvalidloginText(), "Authentication failed.");
		log.info("==============Finished VerifyLoginWithInvalidCredentails Test==============");
		
	}
	
	@AfterTest
	public void endTest() 
	{
		driver.close();
	}

}
