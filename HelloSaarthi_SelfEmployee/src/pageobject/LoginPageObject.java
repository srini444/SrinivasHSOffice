package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	
	
		
	@FindBy(id="com.saarthi.main:id/mobile")
	WebElement mobilefield;
	
	@FindBy(id="com.saarthi.main:id/password")
	WebElement passwordfield;

	@FindBy(id="com.saarthi.main:id/email_sign_in_button")
	WebElement loginbutton;
		
	

		
		public void Login(String mobile, String password) throws Exception
		{
			
			mobilefield.sendKeys(mobile);
			passwordfield.sendKeys(password);
			Thread.sleep(3000);
			loginbutton.click();
			
		}

	}

	

