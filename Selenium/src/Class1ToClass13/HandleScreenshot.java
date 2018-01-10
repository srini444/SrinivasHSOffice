package Class1ToClass13;


import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleScreenshot {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	
	driver = new FirefoxDriver();
	
	
		
	}

	@Test
	public void test() throws Exception {

		driver.get("http://newtours.demoaut.com/");
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("D:/myfile.jpg"));
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
