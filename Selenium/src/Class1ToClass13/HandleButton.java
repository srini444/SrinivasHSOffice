package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleButton {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();

	
		
	}

	@Test
	public void test(){
		
		/*
		//Image Button
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		*/
		
		//Using Submit
		//driver.findElement(By.name("login")).submit();
		
		
		//Non-Image Button
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
