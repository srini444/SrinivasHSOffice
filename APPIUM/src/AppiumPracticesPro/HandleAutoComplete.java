package AppiumPracticesPro;


import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAutoComplete {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "29699e0d9904");
		capabilities.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	
	@Test
	public void test() throws InterruptedException {
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='msite_sprite stky_menu--flite-icn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@mt-id='fromCity']")).click();
		
		WebElement listbox1 = driver.findElement(By.id("search_box_flight"));
		listbox1.sendKeys("Goa");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-index='1']")).click();
		
			
				
			

			
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
