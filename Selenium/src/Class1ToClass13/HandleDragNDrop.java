package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleDragNDrop {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
	
	}

	@Test
	public void test() {
		driver.get("https://jqueryui.com/droppable/");
		
		//Handling frame first
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(frameElement);
		
		// Implicit Wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		
		
		// Explicit Wait
		new WebDriverWait(driver,60).until(ExpectedConditions.presenceOfElementLocated(By.id("draggable")));
		
		Actions builder;
		Action dragndrop;
		
		builder = new Actions(driver);
		
		dragndrop = builder.dragAndDrop(driver.findElement(By.id("draggable")),(driver.findElement(By.id("droppable")))).build();
		
		dragndrop.perform();
		
		System.out.println(driver.findElement(By.id("droppable")).getText());
		
		

	}
	
	@AfterTest
	public void afterTest() {
	}


}
