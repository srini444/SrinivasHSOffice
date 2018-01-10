package appiumserver;



import java.net.URL;



import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleDropdownBox {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "0123456789ABCDEF");
		capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\selendroid-test-app-0.16.0.apk");
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
		
		
	}
	
	
	
	@Test
	public void test() throws InterruptedException {
	
	
		driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
		//driver.scrollTo("Register User (verify)");
		
		
		//java-client-4.1.2 or above
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("s="+scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
		
		
		driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage")).click();
		
	}

	@AfterTest
	public void tearDown() throws Exception {
	}

	

}
