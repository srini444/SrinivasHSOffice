package AppiumPracticesPro;



import java.net.URL;
import java.util.List;






import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleDropdownBox {

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
	public void test() {
	
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).submit();
		
		Select dp = new Select(driver.findElement(By.name("passCount")));
		dp.selectByVisibleText("2");
		//dp.selectByValue("2");
		//dp.selectByIndex(1);

		
		//Dropdown items count
		List<WebElement> count = dp.getOptions();
		int itemscount = count.size();
		System.out.println(itemscount);
	
		//Dropdown items print
		for(int i = 0; i < itemscount; i++)
		{
		System.out.println(count.get(i).getText());
		}
		
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
