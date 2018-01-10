package Class1ToClass13;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleImage {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();
			
	}

	@Test
	public void test() {
		driver.get("http://www.seleniumhq.org/");
		
		
		WebElement print = driver.findElement(By.xpath("//img[@src='images/selenium-ide-logo.png']"));
		
		//Print Attribute Value/Image Name
		System.out.println(print.getAttribute("alt"));
		
		//Print Css Value
		System.out.println(print.getCssValue("font-size"));
		
		//Print Tag Name
		System.out.println(print.getTagName());
		
		//Print Class
		System.out.println(print.getClass());
		
		//Print Image Size
		System.out.println(print.getSize());
		
		
		//Print Image Location(x,y)
		System.out.println(print.getLocation());
			
		//Image Icon
		driver.findElement(By.xpath("//img[@src='images/selenium-ide-logo.png']")).click();
		
		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
