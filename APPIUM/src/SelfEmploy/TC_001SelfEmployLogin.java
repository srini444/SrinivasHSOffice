package SelfEmploy;

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

public class TC_001SelfEmployLogin {
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
		capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\Self Employ.apk");
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void SelfEmployTestCase() throws InterruptedException 
		{
	     driver.findElement(By.name("JOIN NOW")).click();
	     driver.findElement(By.id("com.saarthi.main:id/fullname")).sendKeys("Srinivas");
	     driver.findElement(By.id("com.saarthi.main:id/email")).sendKeys("srinivas@gmail.com");
	      Dimension dimensions = driver.manage().window().getSize();
		  Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  System.out.println("s="+scrollStart);
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();
		  driver.swipe(0,scrollStart,0,scrollEnd,2000);
	     driver.findElement(By.id("com.saarthi.main:id/mobile")).sendKeys("9871536225");
	     driver.findElement(By.id("com.saarthi.main:id/password")).sendKeys("123456");
	     driver.hideKeyboard();
	     driver.findElement(By.id("com.saarthi.main:id/confirmpassword")).sendKeys("123456");
	     driver.hideKeyboard();
	     driver.findElement(By.id("com.saarthi.main:id/pincode")).sendKeys("123456");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.hideKeyboard();
	     driver.findElement(By.id("com.saarthi.main:id/checkbox")).click(); 
	     Thread.sleep(3000);
	     driver.findElement(By.name("Join Now")).click();
	     //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     Thread.sleep(5000);
	    //driver.findElement(By.name("LOG IN")).click();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     driver.findElement(By.id("com.saarthi.main:id/mobile")).sendKeys("9871536225");
	     driver.findElement(By.id("com.saarthi.main:id/password")).sendKeys("123456");
	     driver.findElement(By.id("com.saarthi.main:id/email_sign_in_button")).click();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     driver.findElement(By.id("com.saarthi.main:id/tv_more")).click();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     driver.findElement(By.name("Hello")).click();
	     
		}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
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
