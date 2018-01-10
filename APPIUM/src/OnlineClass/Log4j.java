package OnlineClass;
 

import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
 
	public class Log4j {
	 AndroidDriver driver;
	 static Logger Log = Logger.getLogger(Log4j.class.getName());
	 

		@BeforeTest
		public void setUp() throws Exception {
		
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "4.4");
			capabilities.setCapability("deviceName", "110158e934f1334a");
			capabilities.setCapability("browserName", "Chrome");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			Thread.sleep(3000);
			driver.get("http://newtours.demoaut.com/");
		
		
		}
 
	 @Test
		public void test() throws Exception {
			
		DOMConfigurator.configure("log4j.xml");
 
        driver.get("http://newtours.demoaut.com/");
 
        Log.info("Web application launched");
 
        driver.findElement(By.name("userName")).sendKeys("mercury");
 
        Log.info("Username entered");
 
        driver.findElement(By.name("password")).sendKeys("mercury");
 
        Log.info("Password entered");
 
        driver.findElement(By.name("logi")).submit();
 
        Log.info("Clicked on Sign-In button");
              
 
	}
	 
	 @AfterTest
		public void tearDown() throws Exception {
		}
 
}