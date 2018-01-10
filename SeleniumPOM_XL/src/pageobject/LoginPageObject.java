package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	
	
		@FindBy(name="userName")
		WebElement usernamefield;
		
		@FindBy(name="password")
		WebElement passwordfield;

		@FindBy(name="login")
		WebElement loginbutton;
		
	

		
		public void Login(String userID, String password) throws Exception
		{
			Thread.sleep(5000);
			usernamefield.sendKeys(userID);
			passwordfield.sendKeys(password);
			loginbutton.click();
			Thread.sleep(10000);
			
		}

	}

	

