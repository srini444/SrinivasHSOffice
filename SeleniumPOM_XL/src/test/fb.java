package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class fb {
  
WebDriver driver;	
 @BeforeTest
  public void beforeTest() 
 {
	 driver = new FirefoxDriver();
	 
  }
 
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default");
	  Thread.sleep(3000);
	  Select dp = new Select(driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"))); 
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
  public void afterTest() 
  {
	  
  }

}
