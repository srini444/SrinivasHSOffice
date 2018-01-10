package AppiumPracticesPro;


import java.net.URL;


import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DisplayWebItems {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	
	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/");
		
		//Display URL
		System.out.println(driver.getCurrentUrl());
		
		//Display Page Title
		System.out.println(driver.getTitle());
		
		//Display Window ID
		System.out.println(driver.getWindowHandle());
		
		//Display Page Source
		System.out.println(driver.getPageSource());
			
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
