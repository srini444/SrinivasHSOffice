package RND;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaukriApp {

	AndroidDriver driver;

	@BeforeTest
	public void setUp() throws Exception {

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
	public void test() throws InterruptedException {
		driver.findElement(By.name("Search Jobs")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Enter Skill, Designation, Role")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.ENTER);

		
        WebElement seek_bar=driver.findElement(By.id("naukriApp.appModules.login:id/sb_experience"));
        int start=seek_bar.getLocation().getX();
        System.out.println("Startpoint - " + start);
        int y=seek_bar.getLocation().getY();
        System.out.println("Yaxis - "+ y);
        int end=start + seek_bar.getSize().getWidth();
        System.out.println("End point - "+ end);
        TouchAction action=new TouchAction(driver);
        int moveTo=(int)(end*0.4);
        action.longPress(start,y).moveTo(moveTo,y).release().perform();
		
        Thread.sleep(3000);

		
		
		
		driver.findElement(By.name("Select Location")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Hyderabad / Secunderabad")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("Done")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("Minimum")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("4  lacs")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("Maximum")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("16  lacs")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("Choose your Function / Department")).click();
		Thread.sleep(2000);


		
		Dimension dimensions = driver.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("s="+scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		
		
		for(int i=0; i<dimensions.getHeight(); i++)
		{
		driver.swipe(0,scrollStart,0,scrollEnd,2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);   
		if(driver.findElements(By.name("IT Software - Mobile")).size()!= 0)
		   {
			driver.findElement(By.name("IT Software - Mobile")).click();
			break;
			}
			 
		 }
		
		Thread.sleep(3000);
		driver.findElement(By.name("Search Jobs")).click();
		Thread.sleep(5000);

	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}
}
