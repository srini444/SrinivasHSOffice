package SrinivasIQ;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckAllCheckboxes 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> allchkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i < allchkBox.size(); i++) 
		{
			allchkBox.get(i).click();
			
		}
				
	}

}
