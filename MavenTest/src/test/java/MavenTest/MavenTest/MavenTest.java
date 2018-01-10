package MavenTest.MavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class MavenTest 
{
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
  }
  @Test
  public void Test() 
  {
	  driver.get("http://www.barbequenation.com/todays-menu");
  }
  @AfterTest
  public void afterTest() 
  {
	  //driver.close();
  }

}
