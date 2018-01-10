package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleTextBox {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");	
	driver = new FirefoxDriver();
	
	
		
	}

	@Test
	public void test() throws Exception {
		driver.get("http://newtours.demoaut.com/");

		//It will print result in True/False
		System.out.println(driver.findElement(By.name("userName")).isDisplayed());
		
		//It will print result in True/False
		System.out.println(driver.findElement(By.name("userName")).isEnabled());
		
		//By using name
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		//By using xpath1
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
		
		//By using xpath2
		//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		
		//By using xpath3
		//driver.findElement(By.xpath("//input[@size='10']")).sendKeys("mercury");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("userName")).clear();
	}
	
	@AfterTest
	public void afterTest() {
	}


}
