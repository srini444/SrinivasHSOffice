package OnlineClass;


import java.net.URL;





import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleImage {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("browserName", "Browser");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	
	@Test
	public void test() throws InterruptedException {
		
	driver.get("http://www.seleniumhq.org/");
	
	WebElement print = driver.findElement(By.xpath("//img[@src='images/selenium-ide-logo.png']"));
	
	//Print Attribute Value/Image Name
	System.out.println(print.getAttribute("alt"));
	
	//Print Css Value
	System.out.println(print.getCssValue("font-size"));
	
	//Print Tag Name
	System.out.println(print.getTagName());
	
	//Print Class
	System.out.println(print.getClass());
	
	//Print Image Size
	System.out.println(print.getSize());
	
	
	//Print Image Location(x,y)
	System.out.println(print.getLocation());
		
	//Image Icon
	driver.findElement(By.xpath("//img[@src='images/selenium-ide-logo.png']")).click();
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
