package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleElementExistence {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() 
	{
	driver = new FirefoxDriver();
	}

	@Test
	public void test() {
		
		driver.get("http://newtours.demoaut.com/");
		
/*		
				//If-Else
				
				if(driver.findElement(By.linkText("REGISTER")).isDisplayed())
				{
				
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}

*/
				
				//Try-Catch
				
				try
				{
				if(driver.findElement(By.linkText("REGISTER")).isDisplayed())
				{
					System.out.println("pass");
				}
				}
				catch(NoSuchElementException e)
				{
					System.out.println("fail");
				}
				
				driver.findElement(By.linkText("Cruises")).click();
							
				
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
