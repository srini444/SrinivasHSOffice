package MavenTest.MavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
  WebDriver driver;
	@Test
  public void f() {
		driver.get("https://mail.yahoo.com/d/search/keyword%3DJenkins%2520/messages/4326");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
