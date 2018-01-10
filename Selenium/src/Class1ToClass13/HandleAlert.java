package Class1ToClass13;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleAlert {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	
	//driver = new FirefoxDriver();
	driver = new ChromeDriver();
		
		
	}

	@Test
	public void test() throws Exception {
		
		/*
		//jsbin App
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@value='Go!']")).click();
		Thread.sleep(1000);
				
		//It will get the text which is present on the Alert
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		
		//It will click on OK button
		driver.switchTo().alert().accept();
		*/
		
		
		/*
		//Alert HTML File
		driver.get("file:///D:/Selenium/Alert.html");
		driver.findElement(By.xpath("//button[text()='Click on me']")).click();
		
		//It will get the text which is present on the Alert
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		
		//It will pass the text to the Alert
		driver.switchTo().alert().sendKeys("test");
		Thread.sleep(3000);
		
		//It will click on "OK" button
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click on me']")).click();
		Thread.sleep(3000);
		
		//It will click on Cancel button
		driver.switchTo().alert().dismiss();
		*/
		
		
		
		
		

		

		
	}
	
	@AfterTest
	public void afterTest() {
	}


}
