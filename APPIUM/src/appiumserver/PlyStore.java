package appiumserver;



import java.net.URL;



import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlyStore {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "0123456789ABCDEF");
		capabilities.setCapability("appPackage", "com.android.vending");
		capabilities.setCapability("appActivity", "com.android.vending/com.google.android.finsky.activities.MainActivity");
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
		
	}
	
	
	
	@Test
	public void test() throws InterruptedException {
	
	
	}

	@AfterTest
	public void tearDown() throws Exception {
	}

	

}
