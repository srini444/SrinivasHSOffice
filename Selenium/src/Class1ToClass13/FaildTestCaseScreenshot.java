package Class1ToClass13;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class FaildTestCaseScreenshot {
 WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
	  
  }
  @Test
  public void f() throws IOException {
	 
	  
	  try {
		  driver.get("https://www.google.co.in/");
		  driver.findElement(By.name("")).sendKeys("Testing");
		  
	  	  }
	  catch(Exception e) 
	  {
		  File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(srcFile, new File("D:/myfile.jpg"));
	  }
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
