package Class1ToClass13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchFirefoxBrowser_ClassTest {
	
	public static void main(String[] args) {

		/*
		//By using system path(outside eclipse project)
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		*/
		
		/*
		//By using system path(inside eclipse project)
		System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
		*/
		
		//By using C:\Windows
		WebDriver driver =	new	FirefoxDriver();
		driver.get("http://www.google.co.in/");  
		  
	

	}

}
