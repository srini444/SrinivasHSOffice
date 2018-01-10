package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import pageobject.FlightBookingPageObject;
import pageobject.LoginPageObject;
import pageobject.RegistrationPageObject;

import com.github.genium_framework.appium.support.server.AppiumServer;
import com.github.genium_framework.server.ServerArguments;

import excel.ExcelRead;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumPOM_XLTest {
	AppiumDriver<WebElement> driver;
	static ServerArguments serverArguments;
	static AppiumServer appiumServer;

	RegistrationPageObject Registrationpage;
	LoginPageObject Loginpage;
	FlightBookingPageObject Flightbookingpage;

	
	@BeforeTest
	public void setUp() throws Exception 
	{

		startAppiumServer();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("browserName", "Browser");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		

		Registrationpage = PageFactory.initElements(driver,RegistrationPageObject.class);
		Loginpage = PageFactory.initElements(driver, LoginPageObject.class);
		Flightbookingpage = PageFactory.initElements(driver,FlightBookingPageObject.class);
	}

	@Test
	public void test() throws Exception {

		
		String[][] dataArray = ExcelRead.readExcel("E:/Selenium Online Class/Class21/POM_JXL/", "JXLTestsheet.xls", "Sheet1");
		
		
		for (int i = 1; i < dataArray.length; i++) {

			for (int j = 0; j < dataArray[i].length;) {

				String firstname = dataArray[i][j];
				j++;

				String lastname = dataArray[i][j];
				j++;
				
				String address = dataArray[i][j];
				j++;

				String username = dataArray[i][j];
				j++;

				String password = dataArray[i][j];
				j++;

				String confirmpassword = dataArray[i][j];
				j++;

				String userID = dataArray[i][j];
				j++;

				String password1 = dataArray[i][j];
				j++;
				

				Registrationpage.Registration(firstname, lastname, address, username,password, confirmpassword);
				Thread.sleep(3000);
				Loginpage.Login(userID, password1);
				Thread.sleep(3000);
				Flightbookingpage.Flightbooking();

			

			}
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
