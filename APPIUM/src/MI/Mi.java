package MI;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mi {
	
	AndroidDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appPackage",  "com.mi.global.shop");
		capabilities.setCapability("appActivity", "com.mi.global.shop.activity.SplashActivity");
		
		capabilities.setCapability("noReset", false);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		

	}

	

	@Test
	public void test() {
		
				
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}
}
