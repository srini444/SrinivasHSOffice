package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleMouseHover {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
	}

	@Test
	public void test() {
		driver.get("http://store.demoqa.com/");		
		WebElement element = driver.findElement(By.linkText("Product Category"));
		
		//Create Actions Object
		Actions action = new Actions(driver);
		
		//Build & Perform Action
		action.moveToElement(element).build().perform();
		
		//Click Option from List 
		driver.findElement(By.linkText("iPads")).click();
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
