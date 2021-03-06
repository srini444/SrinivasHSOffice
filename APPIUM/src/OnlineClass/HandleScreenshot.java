package OnlineClass;


import java.io.File;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;



public class HandleScreenshot {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appPackage", "net.tecnotopia.SimpleCalculator");
		capabilities.setCapability("appActivity","net.tecnotopia.SimpleCalculator");
		capabilities.setCapability("noReset", true);
		//capabilities.setCapability("browserName", "Browser");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	
	@Test
	public void test() throws Exception {
		driver.get("http://newtours.demoaut.com/");
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:/myfile.png"));
	
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	}

}
