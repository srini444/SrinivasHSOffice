package AppiumPracticesPro;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchApp {

	AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception {
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("deviceName", "110158e934f1334a");
		capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\calculator.apk");
		
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
			
	@Test
	public void test() throws InterruptedException, IOException 
	{
	
		driver.findElement(By.name("9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("+")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("=")).click();
		Thread.sleep(2000);
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:/myfile.png"));
		
		System.out.println(driver.findElement(By.id("net.tecnotopia.SimpleCalculator:id/display")).getText());
		
		Thread.sleep(3000);
		driver.findElement(By.name("C")).click();
		driver.findElement(By.name("9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("-")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("=")).click();
		Thread.sleep(2000);
		
		File srcFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1, new File("D:/myfile1.png"));
		
		System.out.println(driver.findElement(By.id("net.tecnotopia.SimpleCalculator:id/display")).getText());
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("C")).click();
		driver.findElement(By.name("9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("×")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("=")).click();
		Thread.sleep(2000);
		
		File srcFile2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile2, new File("D:/myfile2.png"));
		
		System.out.println(driver.findElement(By.id("net.tecnotopia.SimpleCalculator:id/display")).getText());
		
		
		Thread.sleep(3000);
		driver.findElement(By.name("C")).click();
		driver.findElement(By.name("9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("÷")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("=")).click();
		Thread.sleep(2000);
		
		File srcFile3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile3, new File("D:/myfile3.png"));
		
		System.out.println(driver.findElement(By.id("net.tecnotopia.SimpleCalculator:id/display")).getText());
		
	}

	@AfterTest
	public void tearDown() throws Exception 
	{
		
		Thread.sleep(3000);
		driver.closeApp();
	}

	

}
