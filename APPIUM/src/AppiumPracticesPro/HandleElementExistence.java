package AppiumPracticesPro;


import java.net.URL;




import io.appium.java_client.android.AndroidDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleElementExistence {

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
		
		/*
		//If-Else
		
		if(driver.findElement(By.linkText("REGISTER")).isDisplayed())
		{
		
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		driver.findElement(By.linkText("Cruises")).click();


		*/

		
		//Try-Catch
		

		try
		{
		if(driver.findElement(By.linkText("REGISTE")).isDisplayed());
		{
			System.out.println("pass");
		}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("fail");
		}
		
		driver.findElement(By.linkText("Cruises")).click();
		
	

		

	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
