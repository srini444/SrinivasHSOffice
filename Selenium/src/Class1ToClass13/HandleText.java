package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleText {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	
	driver = new FirefoxDriver();

		
	}

	@Test
	public void test() throws Exception {
		
		
		/*
		//Mercury Tours page text
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.findElement(By.className("footer")).getText());
		*/
		
		/*
		//Mercury Tours entered text
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		System.out.println(driver.findElement(By.name("userName")).getAttribute("value"));
		*/
		
		
		//Parabank page error text
		driver.get("http://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();	
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
				
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.close();
		throw  new SkipException(" skipping the test ");
		
	}


}
