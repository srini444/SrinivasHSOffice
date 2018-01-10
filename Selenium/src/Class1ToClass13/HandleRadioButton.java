package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleRadioButton {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");	
	driver = new FirefoxDriver();

	
		
	}

	@Test
	public void test() throws Exception {
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='oneway']")).isSelected());
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
