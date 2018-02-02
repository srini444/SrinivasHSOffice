package RND;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
public class RNDHandleDropdownBox {

	AndroidDriver driver;
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
		//Click on Search Button
		driver.findElement(By.name("Search Jobs")).click();
		Thread.sleep(2000);
		driver.hideKeyboard();
		Thread.sleep(2000);
		
		//Click on Location Tab
		driver.findElement(By.name("Select Location")).click();
		Thread.sleep(4000);
		Select dp = new Select(driver.findElement(By.className("android.widget.TextView")));
		Thread.sleep(3000);
		dp.selectByVisibleText("Hyderabad / Secunderabad");
		//dp.selectByValue("2");
		//dp.selectByIndex(1);

		/*//Dropdown items count
		List<WebElement> count = dp.getOptions();
		
		
		int itemscount = count.size();
		System.out.println(itemscount);
		
		
		//Dropdown items print
		for(int i = 0; i < itemscount; i++)
		{
		    System.out.println(count.get(i).getText());
		}
		*/
		
		
	}
	
	@AfterTest
	public void afterTest() 
	{
		driver.close();
		driver.quit();
	}


}
