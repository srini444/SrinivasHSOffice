package OnlineClass;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Paytm {
	
	AndroidDriver driver;

	@BeforeTest
	public void setUp() throws Exception {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		//capabilities.setCapability("appPackage", "net.one97.paytm");
		//capabilities.setCapability("appActivity", "net.one97.paytm.AJRJarvisSplash");
		
		//capabilities.setCapability("appPackage",  "com.mi.global.shop");
		//capabilities.setCapability("appActivity", "com.mi.global.shop.activity.SplashActivity");
		
		capabilities.setCapability("appPackage", "naukriApp.appModules.login");
		capabilities.setCapability("appActivity", "com.naukri.fragments.AdvanceSearch");
		
		capabilities.setCapability("noReset", false);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		

	}

	

	@Test
	public void test() throws InterruptedException {
		//Thread.sleep(3000);
		//driver.findElement(By.name("Do It Later")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.name("Mobile Prepaid")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Postpaid")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("net.one97.paytm:id/edit_no")).sendKeys("9871536225");
		Thread.sleep(2000);
		driver.findElement(By.id("net.one97.paytm:id/edit_amount")).sendKeys("30");
		Thread.sleep(2000);
		driver.hideKeyboard();
		driver.findElement(By.name("Proceed to Pay Bill")).click();
		Thread.sleep(2000);
		driver.hideKeyboard();
		driver.findElement(By.name("Create a New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("net.one97.paytm:id/edit_mob_number")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.id("net.one97.paytm:id/edit_password")).sendKeys("123456s");
		Thread.sleep(2000);
		driver.findElement(By.id("net.one97.paytm:id/edit_email_id")).sendKeys("test495@yahoo.com");
		Thread.sleep(2000);
		driver.hideKeyboard();
		driver.findElement(By.name("Create a New Account")).click();
		Thread.sleep(2000);*/
		
		
		
	}

	
	@AfterTest
	public void tearDown() throws Exception {
	}
}
