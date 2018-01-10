package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class QuitBrowser {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	
	driver = new FirefoxDriver();
	driver.get("https://www.gmail.com/");
	Assert.assertEquals("Gmail", driver.getTitle());
		
	}

	@Test
	public void test() throws Exception {
		
		/*
		//For previous browser version & selenium server standalone version
		driver.get("http://newtours.demoaut.com/");
		WebElement ele = driver.findElement(By.linkText("CONTACT"));
		Actions Act = new Actions(driver);
		Act.moveToElement(ele);
		Act.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		*/
		
		
		//Newer Version
	    WebElement body = driver.findElement(By.tagName("html"));
	    body.sendKeys(Keys.chord(Keys.CONTROL, "n"));
	    
	    
	   
	}
	
	@AfterTest
	public void afterTest() {
		 //driver.close();
		driver.quit();
	}


}
