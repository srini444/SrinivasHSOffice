package Class1ToClass13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChromeBrowser_ClassTest {
	
	public static void main(String[] args) {

		/*
		//By using system path(outside eclipse project)
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		*/
		
		/*
		//By using system path(inside eclipse project)
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		*/
		
		//By using C:\Windows
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		  
		  
	

	}

}
