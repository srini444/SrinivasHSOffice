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
public class HScrollTabs {
 AndroidDriver driver;
 Dimension size;
 
 @BeforeTest
 public void setUp() throws Exception {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "emulator-5554");
	  capabilities.setCapability("platformVersion", "6.0");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\ApiDemos.apk");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }

 @Test
 public void ScrollToTab() throws InterruptedException 
 {
	    Thread.sleep(3000);
	    verticalSwipe();
	    Thread.sleep(5000);
	    driver.findElement(By.name("Views")).click();
	    Thread.sleep(3000);
	    
	    Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("s="+scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
				
		for(int i=0; i<dimensions.getHeight(); i++)
		{
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);   
		if(driver.findElements(By.name("Tabs")).size()!= 0)
		   {
			driver.findElement(By.name("Tabs")).click();
			break;
			}
			 
		 }
		
		Thread.sleep(3000);
		driver.findElement(By.name("5. Scrollable")).click();
		Thread.sleep(5000);
		
		
		
		boolean f =false;
		for(int i =1;i<=10;i++)
		{
			try {
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				f = driver.findElementByXPath("//*[@text='TAB 28']").isDisplayed();
				 
				f = true;
				
				break;
			} catch (Exception e) 
			{
				hortizonalSwipe();
				
			}
		}
		
		Thread.sleep(5000);
		driver.findElement(By.name("Tab 28")).click();
		
		
		
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
		int y = (int)(height*0.20);
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