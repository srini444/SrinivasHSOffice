package AppiumPracticesPro;

import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selendroid {
	
	AndroidDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
			
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "Android Emulator");
		//capabilities.setCapability("avd", "TEST");
		capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\Mi Store_v2.10.3_apkpure.com.apk");
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
			

	}

	

	@Test
	public void test()
	{
		
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}
}
