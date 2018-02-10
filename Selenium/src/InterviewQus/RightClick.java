package InterviewQus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	private static final WebElement WebElement = null;

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hellosaarthi.com/");
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath(".//*[@id='site-nav']/ul/li[5]/a"));
		Actions oAction = new Actions(driver);
		
		
		oAction.contextClick().sendKeys(Keys.ENTER).perform();
	}

}
