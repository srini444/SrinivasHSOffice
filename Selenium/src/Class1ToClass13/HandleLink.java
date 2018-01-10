package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleLink {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();
	
		
	}

	@Test
	public void test(){
		driver.get("http://newtours.demoaut.com/");
		
		//Using linkText
		//driver.findElement(By.linkText("REGISTER")).click();
				
		//Using partiallinkText1
		driver.findElement(By.partialLinkText("REG")).click();
				
		//Using partiallinkText2	
		//driver.findElement(By.partialLinkText("IST")).click();
		
		//Using Relative Xpath
		//driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		
		//Using Absolute Xpath(FirePath)
		//driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
