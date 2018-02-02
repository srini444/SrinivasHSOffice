package OnlineClass;

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

public class Google3rdOptionClick {
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
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void SelfEmployTestCase() throws InterruptedException 
		{
		/*driver.get("https://google.com");
		WebElement listbox2 = driver.findElement(By.name("q"));
		listbox2.sendKeys("ind");
		Thread.sleep(5000);
		
		//3rd List Option
		driver.findElement(By.xpath("(//div[@class='sc']/div)[3]")).click();*/
		
		//Google
				
		{
				driver.get("https://google.com");
				WebElement listbox2 = driver.findElement(By.id("lst-ib"));
				listbox2.sendKeys("ind");
				Thread.sleep(5000);

				//1st List Option
				//driver.findElement(By.id("sbse0")).click();


				//2nd List Option
				//driver.findElement(By.id("sbse1")).click();
				
				//
				driver.findElement(By.id("sbse6")).click();
				} 
		
		
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
