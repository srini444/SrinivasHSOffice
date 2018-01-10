package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MultipleWindows_Firefox {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
		
	driver = new FirefoxDriver();

		
	}

	@Test
	public void test() throws Exception {
		
		 //First window
	    driver.get("http://newtours.demoaut.com/mercuryunderconst.php");
	    
	    driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "n");
	    
	    driver.findElement(By.tagName("html")).sendKeys(Keys.CONTROL + "n");
	    
	    //Printing window handle id's
	    System.out.println(driver.getWindowHandles());
	    
	   Thread.sleep(3000);
	    
	    //Move to second window
	    driver.switchTo().window("23");
	    driver.get("http://parabank.parasoft.com/parabank/index.htm");
	   
	    Thread.sleep(3000);
	    
	    //Move to first window
	    driver.switchTo().window("13");
	  	driver.findElement(By.linkText("REGISTER")).click();
	  	
	  	 Thread.sleep(3000);
	  	 
	  	  //Move to second window
		 driver.switchTo().window("23");
		 driver.findElement(By.linkText("Services")).click();
		 
		 
		   //Printing window's count
		   System.out.println(driver.getWindowHandles().size());
	}
	
	@AfterTest
	public void afterTest() {
		
	}


}
