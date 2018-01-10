package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	
	
		@FindBy(name="userName")
		public WebElement usernamefield;
		
		@FindBy(name="password")
		public WebElement passwordfield;

		@FindBy(name="login")
		public WebElement loginbutton;

		
		public void enterUserName()
		{
		}
		
		public void enterPassword()
		{
		}
		
		public void clickLogin()
		{
		}
		
		
	}

	

