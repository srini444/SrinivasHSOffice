package OnlineClass;


import java.net.URL;









import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCalendar {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='msite_sprite stky_menu--flite-icn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@mt-id='depDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='calendar-day   311017']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='OK']")).click();
		
	
			
			
				
			

			
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
