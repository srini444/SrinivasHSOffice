package Appium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG {
  
  WebDriver driver;	
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() throws IOException 
  {
	  driver.get("http://toolsqa.com/selenium-webdriver/install-testng/");
	   File HomePage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(HomePage, new File("D:\\test.jpg"));
  }
  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.close();
  }

}
