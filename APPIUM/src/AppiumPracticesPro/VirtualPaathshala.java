package AppiumPracticesPro;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class VirtualPaathshala 
{
 AndroidDriver driver;
  @BeforeTest
  public void beforeTest() throws MalformedURLException 
  {
	   DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		capabilities.setCapability("app", "C:\\Users\\HS013\\Downloads\\VirtualPaathshala.apk");
		
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
  @Test
  public void Test() throws InterruptedException 
  {
	  
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/mobile")).sendKeys("9871536225");
	  driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/password")).sendKeys("123456");
	  driver.hideKeyboard();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/email_sign_in_button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/menu_settings")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.name("Logout")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.name("OK")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.name("Don't have an account? Register Here ")).click();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/fullname")).sendKeys("Srinivas");
	  //driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/username")).sendKeys("Srinivas1");
	  driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/email")).sendKeys("Srinivas495@gmail.com");
	  driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/password")).sendKeys("123456");
	  driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/confirmpassword")).sendKeys("123456");
	  driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/mobile")).sendKeys("9014626620");
	  driver.hideKeyboard();
	  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/pincode")).sendKeys("123456");
	  driver.hideKeyboard();
	  driver.findElement(By.id("Accept Terms and Conditions")).click();
	  driver.hideKeyboard();
	  driver.findElement(By.name("Register Now")).click();
  }
  @AfterTest
  public void afterTest() throws InterruptedException 
  {
/*	  Thread.sleep(3000);
	  driver.closeApp();*/
  }

}
