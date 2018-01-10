package com.test.automation.uiAutomation.testBase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 


{
	public static final Logger log = Logger.getLogger(TestBase.class.getName()); 
	public WebDriver driver;
	public void init() 
	{
		log.info("Launch Firefox Browser");
		driver = new FirefoxDriver();
		log.info("Launch WebSite URL");
		driver.get("http://automationpractice.com/index.php");
		
		String log4jConfpath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfpath);
	}

}
