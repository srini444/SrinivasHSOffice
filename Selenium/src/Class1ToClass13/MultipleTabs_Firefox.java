package Class1ToClass13;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MultipleTabs_Firefox {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws Exception {
		
		
		driver = new FirefoxDriver();
		
	//Tab1
	driver.get("http://newtours.demoaut.com/");	
		
		
	//Tab2
	driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
	ArrayList<String> tab2 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tab2.get(1));
	driver.get("http://parabank.parasoft.com/parabank/index.htm");
			
	//Tab3
	driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "t");
	ArrayList<String> tab3 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tab3.get(2));
	driver.get("http://blazedemo.com/");
		
	
	//Move to Tab1
	Thread.sleep(2000);
	driver.switchTo().window(tab3.get(0));
	driver.findElement(By.linkText("REGISTER")).click();
		
	//Move to Tab3
	Thread.sleep(2000);
	driver.switchTo().window(tab3.get(2));
	driver.findElement(By.linkText("destination of the week! The Beach!")).click();
		
	//Move to Tab2
	Thread.sleep(2000);
	driver.switchTo().window(tab3.get(1));
	driver.findElement(By.linkText("Services")).click();
	

	//Printing tabs's count
	System.out.println(driver.getWindowHandles().size());
	
	}
	

	
	@Test
	public void test() {
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
