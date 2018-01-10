package AppiumPracticesPro;


import static org.testng.Assert.assertEquals;

import java.net.URL;



import io.appium.java_client.android.AndroidDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAssertion {

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
	public void test() throws Exception {
		
		/*
		//Check Title using If-Else
		driver.get("http://newtours.demoaut.com/");
		if(driver.getTitle().equals("Welcome: Srinivas"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
		*/
		
		/*
		//Assert Title
		driver.get("http://newtours.demoaut.com/");
		String title = driver.getTitle();
		assertEquals("Welcome: Mercury Tours", title);
		System.out.println(title);
		*/
		
		
		
		//Assert Text
		driver.get("http://newtours.demoaut.com/");
		String text = driver.findElement(By.xpath("//div[@class='footer']")).getText();
		assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", text);
		assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", driver.findElement(By.xpath("//div[@class='footer']")).getText());
		System.out.println(text);
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		
				
	
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
