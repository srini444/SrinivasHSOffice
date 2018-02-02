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

public class TC_001VRCLoginTestCase {
	
	AppiumDriver<WebElement> driver;
	static ServerArguments serverArguments;
	static AppiumServer appiumServer;

	@BeforeTest
	public void setUp() throws Exception 
	{

		startAppiumServer();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\VirtualPaathshala.apk");
		
		
		
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void VRCLoginTestCase() throws InterruptedException 
		{
	      driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/mobile")).sendKeys("9871536225");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.hideKeyboard();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/password")).sendKeys("123456");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.hideKeyboard();
	      Thread.sleep(2000);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/email_sign_in_button")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(3000);
		  
		 
		  driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		  driver.findElement(By.name("Upload Course")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("Camera")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("00:06")).click();
		  Thread.sleep(5000);
		  /*driver.findElement(By.name("Video Title")).sendKeys("Srinivas Appium Video Title");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		  
		  Dimension dimensions = driver.manage().window().getSize();
		  Double screenHeightStart = dimensions.getHeight() * 0.5;
		  int scrollStart = screenHeightStart.intValue();
		  System.out.println("s="+scrollStart);
		  Double screenHeightEnd = dimensions.getHeight() * 0.2;
		  int scrollEnd = screenHeightEnd.intValue();
		  driver.swipe(0,scrollStart,0,scrollEnd,2000);
		  
		  /*driver.findElement(By.name("Description")).sendKeys("Srinivas Appium description");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  driver.hideKeyboard();
		  Thread.sleep(5000);
		  
		  Dimension dimensions1 = driver.manage().window().getSize();
		  Double screenHeightStart1 = dimensions1.getHeight() * 0.5;
		  int scrollStart1 = screenHeightStart1.intValue();
		  System.out.println("s="+scrollStart1);
		  Double screenHeightEnd1 = dimensions1.getHeight() * 0.2;
		  int scrollEnd1 = screenHeightEnd1.intValue();
		  driver.swipe(0,scrollStart1,0,scrollEnd1,2000);*/
		  
		  driver.findElement(By.name("Add Tags")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/search_tag")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/search_tag")).sendKeys("t");
		  //driver.findElement(By.xpath("(//android.widget.TextView[@id='com.hellosaarthi.virtualpaathshala:id/textView'])[3]")).click();
		  Thread.sleep(2000);
		  
		 // driver.findElement(By.xpath("(//[@id='com.hellosaarthi.virtualpaathshala:id/textView'])[3]")).click();
		  driver.findElement(By.xpath("(.//*[id='com.hellosaarthi.virtualpaathshala:id/textView'])[3]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/tv_playlist")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.name("Add New Playlist")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.name("Create Playlist")).sendKeys("Test Playlist");
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("CREATE")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.name("Choose Category")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.name("     - Concrete Structures")).click();
		  Thread.sleep(3000);
		  		  
		  Dimension dimensions2 = driver.manage().window().getSize();
		  Double screenHeightStart2 = dimensions2.getHeight() * 0.5;
		  int scrollStart2 = screenHeightStart2.intValue();
		  System.out.println("s="+scrollStart2);
		  Double screenHeightEnd2 = dimensions2.getHeight() * 0.2;
		  int scrollEnd2 = screenHeightEnd2.intValue();
		  driver.swipe(0,scrollEnd2,0,scrollStart2,2000);
		  		
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/tv_add_questionnaire")).click();
		  
		  driver.navigate().back();
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.findElement(By.id("com.hellosaarthi.virtualpaathshala:id/menu_settings")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("Logout")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.name("OK")).click();
		  Thread.sleep(5000);
		  driver.closeApp();
		  
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
