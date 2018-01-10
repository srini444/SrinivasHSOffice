package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleSynchronization {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();

	
		
	}

	@Test
	public void test() throws Exception {
		
		/*
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Explicit Wait - Type 1
		Thread.sleep(10000);
	
		//Explicit Wait - Type 2
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("ITINERARY")));
		
		driver.findElement(By.linkText("PROFILE")).click();
		*/
		
		
		//Explicit Wait(Alert)
		driver.get("http://only-testing-blog.blogspot.in/2014/01/new-testing.html");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("First Name");
		new WebDriverWait(driver, 60).until(ExpectedConditions.alertIsPresent());
		System.out.print(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Bike']")).click();
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
