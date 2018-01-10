package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectModel2 {

	
	
		@FindBy(name="userName")
		WebElement usernamefield;
		
		@FindBy(name="password")
		WebElement passwordfield;

		@FindBy(name="login")
		WebElement loginbutton;

		
		public void enterUserName(String userID)
		{
		usernamefield.sendKeys(userID);	
		}
		
		public void enterPassword(String password)
		{
		passwordfield.sendKeys(password);	
		}
		
		public void clickLogin()
		{
		loginbutton.click();
		}
		
		
	}

	

