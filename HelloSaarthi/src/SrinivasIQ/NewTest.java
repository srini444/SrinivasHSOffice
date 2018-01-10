package SrinivasIQ;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("http://www.magicbricks.com/");
	  Thread.sleep(3000);
	  
  }
  @AfterTest
  public void afterTest() {
  }

}
