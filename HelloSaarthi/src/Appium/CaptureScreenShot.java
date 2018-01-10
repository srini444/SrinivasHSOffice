package Appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CaptureScreenShot {
 RemoteWebDriver driver;
 Dimension size;
 String destDir;
 DateFormat dateFormat;

 @BeforeTest
 public void setUp() throws Exception {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "emulator-5554");
	  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Browser");
	  capabilities.setCapability(CapabilityType.VERSION, "6.0");
	  capabilities.setCapability("platformName", "Android");
	  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.id("m_login_email")).sendKeys("9871536225");
	  Thread.sleep(3000);
	  driver.findElement(By.name("pass")).sendKeys("123456789");
	  Thread.sleep(3000);
	  driver.findElement(By.name("login")).click();
	  
 }

  public void takeScreenShot() {
  // Set folder name to store screenshots.
  destDir = "screenshots";
  // Capture screenshot.
  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  // Set date format to set It as screenshot file name.
  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
  // Create folder under project with name "screenshots" provided to destDir.
  new File(destDir).mkdirs();
  // Set file name using current date time.
  String destFile = dateFormat.format(new Date()) + ".png";

  try {
   // Copy paste file at destination folder location
   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
  } catch (IOException e) {
   e.printStackTrace();
  }
 }

 @AfterTest
 public void End() {
  driver.quit();
 }
}