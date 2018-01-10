package MavenTest.MavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reg {
	
	WebDriver driver;

	{
		driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("srinivaa@gmail.com");
		driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath(".//*[@id='id_gender1']")).click();
		driver.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys("srini");
		driver.findElement(By.xpath(".//*[@id='customer_lastname']")).sendKeys("srini");
		driver.findElement(By.xpath(".//*[@id='passwd']")).sendKeys("srini");
		driver.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys("srini");
		
	}
	

}
