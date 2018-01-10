package AppiumPracticesPro;


import java.net.URL;





import io.appium.java_client.android.AndroidDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleAlert {

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
	public void test() throws InterruptedException {
		
		
		driver.get("http://output.jsbin.com/usidix/1");

		driver.findElement(By.xpath("//input[@value='Go!']")).click();
		Thread.sleep(2000);
		
		//It will get the text which is present on the Alert
		System.out.println(driver.switchTo().alert().getText());
		
		//It will click on "OK" button
		driver.switchTo().alert().accept();
		
		//It will click on Cancel button
		//driver.switchTo().alert().dismiss();
		
		//It will pass the text to the Alert
		//driver.switchTo().alert().sendKeys("test");
		
		
		
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

}
