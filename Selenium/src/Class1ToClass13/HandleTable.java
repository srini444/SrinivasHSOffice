package Class1ToClass13;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class HandleTable {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
	driver = new FirefoxDriver();
	
	}

	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/");
		
		//First get the entire html table and store this in a variable of type web element	
		WebElement htmltable=driver.findElement(By.xpath("//table[@width='270']"));
		
		//Get all the rows with tag name 'tr' and store all the elements in a list of web elements
		//Now all the elements with tag 'tr' are stored in 'rows' list
		List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
		
		 //Loop through each row and get the list of elements with tag 'td'
		for(int rnum=0; rnum<rows.size(); rnum++)
		{
		
		//'rows.get(0)' will give first row and 'findElements(By.tagName("td"))' will give list of columns for the row
		//Now all the elements with tag td are stored in columns list
		List<WebElement> columns=rows.get(rnum).findElements(By.tagName("td"));
		
		// Iterate using columns.size() and get the details of each cell
		for(int cnum=0;cnum<columns.size();cnum++)
		{
		System.out.print(columns.get(cnum).getText() + "\t");
		}
		System.out.print("\n");
		}
		System.out.print("\n");
		}

		

	@AfterTest
	public void afterTest() {
	}


}
