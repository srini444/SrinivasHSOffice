package Class1ToClass13;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchFirefoxBrowser_JUnitTest {
	
	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
				
	
	}

	@Test
	public void test() {
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
