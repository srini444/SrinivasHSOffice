   package RND;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;



public class RNDHandleCalendar {

	AndroidDriver<WebElement> driver;
	@BeforeTest
	public void beforeTest() throws MalformedURLException 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appPackage", "naukriApp.appModules.login");
		capabilities.setCapability("appActivity", "com.naukri.fragments.NaukriSplashScreen");
		// capabilities.setCapability("noReset", false);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws Exception {
		driver.findElement(By.name("Search Jobs")).click();
		Thread.sleep(2000);
		driver.hideKeyboard();
		Thread.sleep(2000);
		driver.findElement(By.name("Choose your Function / Department")).click();
		
		
		List<WebElement> location = driver.findElements(By.id("naukriApp.appModules.login:id/dropdown_value"));
		int count = location.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
			{
				//String locations = location.get(i).getText();
				//System.out.println(locations);
				/*if(locations.equals("Site Engineering, Project Management"))
				{
					location.get(i).click();
				break;
				}*/
			
				Dimension dimensions = driver.manage().window().getSize();
				Double screenHeightStart = dimensions.getHeight() * 0.5;
				int scrollStart = screenHeightStart.intValue();
				System.out.println("s="+scrollStart);
				Double screenHeightEnd = dimensions.getHeight() * 0.2;
				int scrollEnd = screenHeightEnd.intValue();
				
				
				for(int i1=0; i1<dimensions.getHeight(); i1++)
				{
				driver.swipe(0,scrollStart,0,scrollEnd,5000);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
				
				String locations = location.get(i).getText();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
				System.out.println(locations);
			}	
	
			}	
		
					
	}
	
	@AfterTest
	public void afterTest() {
	}


}
