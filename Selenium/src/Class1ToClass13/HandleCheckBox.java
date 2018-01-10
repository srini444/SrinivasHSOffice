package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleCheckBox {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();

	
		
	}

	@Test
	public void test() throws Exception {
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("findFlights")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("reserveFlights")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("ticketLess")).click();
		
		//De-select check box
		Thread.sleep(5000);
		driver.findElement(By.name("ticketLess")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.name("buyFlights")).click();
	
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
