package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Filter {
	AppiumDriver<WebElement> driver;
	static ServerArguments serverArguments;
	static AppiumServer appiumServer;

	@BeforeTest
	public void setUp() throws Exception 
	{

		startAppiumServer();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		//capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\Self Employ.apk");
		capabilities.setCapability("appPackage", "com.saarthi.main");
		capabilities.setCapability("appActivity", "com.saarthi.main.SplashActivity");

		capabilities.setCapability("noReset", false);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@Test
	public void SelfEmployTestCase() throws InterruptedException, IOException 
		{
	    Thread.sleep(10000);
		driver.findElement(By.id("com.saarthi.main:id/iv_arrow")).click();
		Thread.sleep(15000);  
		/*driver.findElement(By.id("com.saarthi.main:id/tv_filter")).click();
		Thread.sleep(10000);*/
		
		 Dimension dimensions = driver.manage().window().getSize();
		 Double screenHeightStart = dimensions.getHeight() * 0.5;
		 int scrollStart = screenHeightStart.intValue();
		 System.out.println("s="+scrollStart);
		 Double screenHeightEnd = dimensions.getHeight() * 0.2;
		 int scrollEnd = screenHeightEnd.intValue();
		 driver.swipe(0,scrollStart,0,scrollEnd,2000);
		
		
		 driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout'][@index='8']")).click();
		
		/*//Price SeekBar 
        WebElement price=driver.findElement(By.id("com.saarthi.main:id/sb_price"));
        int start=price.getLocation().getX();
        System.out.println("Price Startpoint - " + start);
        int y=price.getLocation().getY();
        System.out.println("Price Yaxis - "+ y);
        int end=start + price.getSize().getWidth();
        System.out.println("Price End point - "+ end);
        TouchAction action=new TouchAction(driver);
        int moveTo=(int)(end*1);
        action.longPress(start,y).moveTo(moveTo,y).release().perform();
		Thread.sleep(5000);
		
	
		//Distance SeekBar 
        WebElement distance=driver.findElement(By.id("com.saarthi.main:id/sb_distance"));
        int start1=distance.getLocation().getX();
        System.out.println("Distance Startpoint - " + start1);
        int y1=distance.getLocation().getY();
        System.out.println("Distance Yaxis - "+ y1);
        int end1=start1 + distance.getSize().getWidth();
        System.out.println("Distance End point - "+ end1);
        TouchAction action1=new TouchAction(driver);
        int moveTo1=(int)(end1*1);
        action1.longPress(start,y1).moveTo(moveTo1,y1).release().perform();
		Thread.sleep(5000);
		
	
		//Ratings SeekBar 
        WebElement ratings=driver.findElement(By.id("com.saarthi.main:id/line1"));
        int start11=ratings.getLocation().getX();
        System.out.println("Ratings Startpoint - " + start11);
        int y11=ratings.getLocation().getY();
        System.out.println("Ratings Yaxis - "+ y11);
        int end11=start11 + ratings.getSize().getWidth();
        System.out.println("Ratings End point - "+ end11);
        TouchAction action11=new TouchAction(driver);
        int moveTo11=(int)(end11*1);
        action11.longPress(start11,y11).moveTo(moveTo11,y11).release().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.id("com.saarthi.main:id/tv_setfilter")).click();
		Thread.sleep(3000);
	     */
		
		
		
		
		}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		driver.closeApp();
		driver.quit();	
		stopAppiumServer();
	}

	public static void startAppiumServer() throws IOException,InterruptedException 
	
	{
		serverArguments = new ServerArguments();
		serverArguments.setArgument("--address", "127.0.0.1");
		serverArguments.setArgument("--no-reset", true);
		serverArguments.setArgument("--local-timezone", true);
		appiumServer = new AppiumServer(new File("C:/Program Files (x86)/Appium"),serverArguments);
		appiumServer.startServer();
		appiumServer.isServerRunning();
		
	}

	public static void stopAppiumServer() throws IOException 
	{
			appiumServer.stopServer();
	}
	
}
