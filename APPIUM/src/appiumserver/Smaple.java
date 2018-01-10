package appiumserver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Smaple {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("btnK")).getCssValue("btnK");
		System.out.println(driver.findElement(By.name("btnK")).getCssValue("btnK"));
	}

}
