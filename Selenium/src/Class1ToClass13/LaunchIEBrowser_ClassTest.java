package Class1ToClass13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class LaunchIEBrowser_ClassTest {
	
	public static void main(String[] args) {

		/*
		//By using system path(outside eclipse project)
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		*/
		
		/*
		//By using system path(inside eclipse project)
		System.setProperty("webdriver.ie.driver", ".\\IEDriverServer.exe");
		*/
		
		//By using C:\Windows
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.co.in/");  
		  
	

	}

}
