package Appium;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class One 
{
 RemoteWebDriver driver;
  @BeforeTest
  public void beforeTest() throws MalformedURLException 
  {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setCapability("deviceName", "emulator-5554");
	  cap.setCapability(CapabilityType.VERSION, "6.0");
	  cap.setCapability("platformName", "Android");
	  cap.setCapability("appPackage", ";com.saarthi.main");
	  cap.setCapability("appActivity", "com.saarthi.main.SplashScreen");
	  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }
  @Test
  public void Test() throws InterruptedException, IOException 
  {
	   driver.findElement(By.id("com.saarthi.main:id/username")).sendKeys("9871536225");
	   driver.findElement(By.id("com.saarthi.main:id/password")).sendKeys("12345");
	   Thread.sleep(3000);
	   driver.findElement(By.id("com.saarthi.main:id/signin")).click();
	   
	   /*File HomePage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(HomePage, new File("D:\\test.jpg"));*/
	   
  }
  @AfterTest
  public void afterTest() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
