package RND;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HSScrollBanner {
 AndroidDriver driver;
 Dimension size;
 
 @BeforeTest
 public void setUp() throws Exception {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "emulator-5554");
	  capabilities.setCapability("platformVersion", "6.0");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\Self Employ.apk");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }

 @Test
 public void ScrollToTab() throws InterruptedException 
 {
	    boolean f =false;
		for(int i =1;i<=10;i++)
		{
			try {
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				f = driver.findElementByXPath("//*[@text='vivek']").isDisplayed();
				 
				f = true;
				
				break;
			} catch (Exception e) 
			{
				hortizonalSwipe();
				
			}
		}
		
		Thread.sleep(5000);
		driver.findElement(By.name("vivek")).click();
		
		
		
 }		

 
 public void verticalSwipe()
	{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		driver.swipe(x, starty, x, endy, 500);
		
	}
 
   
 public void hortizonalSwipe()
	{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int y = (int)(height*0.80);
		int startx = (int)(width*0.75);
		int endx = (int)(width*0.35);
		driver.swipe(startx, y, endx, y, 500);
	}
 
 
 
 
 @AfterTest
 public void End() 
 {
  driver.quit();
 }
}