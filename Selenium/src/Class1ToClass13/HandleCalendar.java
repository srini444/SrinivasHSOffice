   package Class1ToClass13;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleCalendar {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		
	driver = new FirefoxDriver();
	
	}

	@Test
	public void test() throws Exception {
		
		/*
		//Calendar Static Handling 
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_depart_date")).click();
		driver.findElement(By.id("a_2017_7_12")).click();
		driver.findElement(By.id("BE_flight_return_date")).click();
		driver.findElement(By.id("a_2017_7_13")).click();
		*/
		
		
		//Handle Onward Calendar 
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		
		//It will store all web elements in List
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		
		//It will return total node count for calendar
		int count = dates.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String date = dates.get(i).getText();
			System.out.println(date);
			if(date.equals("28"))
			{
				dates.get(i).click();
				break;
			}
		}
		
		
		//Handle Return Calendar
		driver.findElement(By.id("return_cal")).click();
		
		List<WebElement> dates2 = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table[1]//td"));
				
				int count2 = dates2.size();
				System.out.println(count2);
				
				for(int j=0; j<count2; j++)
				{
					String date2 = dates2.get(j).getText();
					System.out.println(date2);
					if(date2.equals("29"))
					{
						dates2.get(j).click();
						break;
					}
					
				}
				
	}
	
	@AfterTest
	public void afterTest() {
	}


}
