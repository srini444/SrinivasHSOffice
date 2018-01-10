package test;


import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pageobject.LoginPageObjectModel2;
import pageobject.RegistrationPageObjectModel2;

public class MercuryToursModel2 {
	AppiumDriver<WebElement> driver;
	static ServerArguments serverArguments;
	static AppiumServer appiumServer;
	
	RegistrationPageObjectModel2 Registrationpage;
	LoginPageObjectModel2 Loginpage;
	
	@BeforeTest
	public void setUp() throws Exception {
		startAppiumServer();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("browserName", "Browser");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Registrationpage = PageFactory.initElements(driver, RegistrationPageObjectModel2.class);
		Loginpage = PageFactory.initElements(driver, LoginPageObjectModel2.class);
		
	
	}

	
	@Test
	public void test() throws Exception {
		
		
		
		
		//Registration Operations
		Registrationpage.clickRegisterLink();
		Thread.sleep(3000);
		Registrationpage.enterFirstName("firstuser");
		Registrationpage.enterLastName("lastuser");
		Registrationpage.selectDropdown();
		Registrationpage.enterUserName("user1");
		Registrationpage.enterPassword("pass1");
		Registrationpage.enterConfirmPassword("pass1");
		Registrationpage.clickRegisterButton();
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//div[@class='footer']")).getText();
		assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", text);
		System.out.println(text);
		
		Registrationpage.clickSignInLink();
		Thread.sleep(3000);
		
		//Login Operations
		Loginpage.enterUserName("mercury");
		Loginpage.enterPassword("mercury");
		Loginpage.clickLogin();
		Thread.sleep(3000);
		
		
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
