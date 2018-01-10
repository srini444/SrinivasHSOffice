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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_002VRCRegisterTestCase {
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
	public void VRCRegisterTestCase() throws InterruptedException 
		{
		  driver.findElement(By.name("Don't have an account? Register Here ")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/fullname")).sendKeys("Srinivas");
		  driver.hideKeyboard();
		  
		  Dimension dimensions = driver.manage().window().getSize();
		  Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  System.out.println("s="+scrollStart);
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();
		  driver.swipe(0,scrollStart,0,scrollEnd,2000);
		  
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/username")).sendKeys("Srinivas1");
		  driver.hideKeyboard();
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/email")).sendKeys("Srinivas495@gmail.com");
		  driver.hideKeyboard();
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/mobile")).sendKeys("9014626620");
	      driver.hideKeyboard();
		  
		  Dimension dimensions1 = driver.manage().window().getSize();
		  Double screenHeightStart1 = dimensions1.getHeight() * 0.5;
		  int scrollStart1 = screenHeightStart1.intValue();
		  System.out.println("s="+scrollStart1);
		  Double screenHeightEnd1 = dimensions1.getHeight() * 0.2;
		  int scrollEnd1 = screenHeightEnd1.intValue();
		  driver.swipe(0,scrollStart1,0,scrollEnd1,2000);
			
	      driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/password")).sendKeys("123456");
		  driver.hideKeyboard();
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/confirmpassword")).sendKeys("123456");
		  driver.hideKeyboard();
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/pincode")).sendKeys("110092");
		  driver.hideKeyboard();
		  driver.findElement(By.name("Accept Terms and Conditions")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/btn_register")).click();
		  Thread.sleep(3000);
		 
		}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		
		driver.closeApp();
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
