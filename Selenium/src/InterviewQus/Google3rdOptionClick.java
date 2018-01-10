package InterviewQus;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google3rdOptionClick {

WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception 
	{

	driver = new FirefoxDriver();
	}

	@Test
	public void SelfEmployTestCase() throws InterruptedException 
		{
		/*driver.get("https://google.com");
		WebElement listbox2 = driver.findElement(By.name("q"));
		listbox2.sendKeys("ind");
		Thread.sleep(5000);
		
		//3rd List Option
		driver.findElement(By.xpath("(//div[@class='sc']/div)[3]")).click();*/
		
		//Google
				
		{
				driver.get("https://google.com");
				WebElement listbox2 = driver.findElement(By.id("lst-ib"));
				listbox2.sendKeys("ind");
				Thread.sleep(5000);

				//1st List Option
				//driver.findElement(By.id("sbse0")).click();


				//2nd List Option
				//driver.findElement(By.id("sbse1")).click();
				
				//
				driver.findElement(By.id("sbse8")).click();
				} 
		
		
		}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		
	}


	
}
