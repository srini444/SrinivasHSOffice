package appiumserver;

import io.appium.java_client.AppiumDriver;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_003VRCHomeUploadCourseTestCase {
	AppiumDriver<WebElement> driver;
	static ServerArguments serverArguments;
	static AppiumServer appiumServer;

	@BeforeTest
	public void setUp() throws Exception 
	{

		startAppiumServer();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\VirtualPaathshala.apk");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void VRCLoginTestCase() throws InterruptedException 
		{
		  /*driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/mobile")).sendKeys("9871536225");
		  driver.hideKeyboard();
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/password")).sendKeys("123456");
		  driver.hideKeyboard();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/email_sign_in_button")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  /*driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/menu_settings")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("Logout")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("OK")).click();*/
		  
		  Dimension dimensions = driver.manage().window().getSize();
		  Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  System.out.println("s="+scrollStart);
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();
		  driver.swipe(0,scrollStart,0,scrollEnd,2000);
		
		  driver.findElement(By.name("Add More")).click();
		  //Thread.sleep(3000);
		  //driver.findElement(By.name("Upload Course")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("Whats")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("00:28")).click();
		 
		  Thread.sleep(5000);	  
		  driver.findElement(By.name("Video Title")).sendKeys("Srinivas Appium Test");
		  driver.hideKeyboard();
		  Thread.sleep(3000);
		
		  
		  Dimension dimensions1 = driver.manage().window().getSize();
		  Double screenHeightStart1 = dimensions1.getHeight() * 0.5;
		  int scrollStart1 = screenHeightStart1.intValue();
		  System.out.println("s="+scrollStart1);
		  Double screenHeightEnd1 = dimensions1.getHeight() * 0.2;
		  int scrollEnd1 = screenHeightEnd1.intValue();
		  driver.swipe(0,scrollStart1,0,scrollEnd1,2000);
		  
		  driver.findElement(By.name("Description")).sendKeys("Srinivas Appium Test");
		  driver.hideKeyboard();
		  Thread.sleep(3000);
		  
		  Dimension dimensions11 = driver.manage().window().getSize();
		  Double screenHeightStart11 = dimensions11.getHeight() * 0.5;
		  int scrollStart11 = screenHeightStart11.intValue();
		  System.out.println("s="+scrollStart11);
		  Double screenHeightEnd11 = dimensions11.getHeight() * 0.2;
		  int scrollEnd11 = screenHeightEnd11.intValue();
		  driver.swipe(0,scrollStart11,0,scrollEnd11,2000);
		  
		  driver.findElement(By.name("Add Tags")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("Type here...")).sendKeys("Test");
		  Thread.sleep(2000);
		  
		  Select AddTag = new Select(driver.findElement(By.name("Type here...")));
		  	  
		  driver.findElement(By.name("Add")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/tv_playlist")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("Add New Playlist")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("Create Playlist")).sendKeys("Test");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("CREATE")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("Choose Category")).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.name("        - Slabs")).click();
		  Thread.sleep(3000);
		}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		
		//driver.closeApp();
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
