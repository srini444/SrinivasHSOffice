package Class1ToClass13;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleDropdownBox {

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
		
		Thread.sleep(7000);
		Select dp = new Select(driver.findElement(By.name("passCount")));
		//dp.selectByVisibleText("2");
		//dp.selectByValue("2");
		//dp.selectByIndex(1);

			
		//Dropdown items count
		List<WebElement> count = dp.getOptions();
		
		
		int itemscount = count.size();
		System.out.println(itemscount);
		
		
		//Dropdown items print
		for(int i = 0; i < itemscount; i++)
		{
		    System.out.println(count.get(i).getText());
		}
		
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
