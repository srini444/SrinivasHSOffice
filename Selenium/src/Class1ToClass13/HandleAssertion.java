package Class1ToClass13;






import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleAssertion {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();
		
	}

	@Test
	public void test() throws Exception {
		
		
		//Check Title using If-Else
		driver.get("http://newtours.demoaut.com/");
		if(driver.getTitle().equals("Welcome: Mercury Tours"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			File ScreenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
			FileUtils.copyFile(ScreenShot, new File("D:/Srinivas.jpg"));		
		}
		
		
		/*
		//Assert Title
		driver.get("http://newtours.demoaut.com/");
		String title = driver.getTitle();
		assertEquals("Welcome: Mercury Tours", title);
		System.out.println(title);
		*/
		
		/*
		//Assert Text
		driver.get("http://newtours.demoaut.com/");
		String text = driver.findElement(By.xpath("//div[@class='footer']")).getText();
		assertEquals("© 2005, Mercury Interactive (v. 011003-1.01-058)", text);
		System.out.println(text);
		*/
		
		/*
		//Assert Alert
		driver.get("http://www.ksrtc.in/oprs-web/");
		Thread.sleep(3000);
		driver.findElement(By.id("searchBtn")).click();				
		String actualmsg = driver.switchTo().alert().getText();
		assertEquals("Please select start place.", actualmsg);
		System.out.println(actualmsg);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
				
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
