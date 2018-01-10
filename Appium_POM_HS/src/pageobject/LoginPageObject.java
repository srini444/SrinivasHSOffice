package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	
	
		@FindBy(name="LOG IN")
		WebElement welcompageLogin;
		
		@FindBy(id="com.saarthi.main:id/mobile")
		WebElement mobilefield;
		
		@FindBy(id="com.saarthi.main:id/password")
		WebElement passwordfield;

		@FindBy(id="com.saarthi.main:id/email_sign_in_button")
		WebElement loginbutton;
		

		
		public void Login(String userID, String password) throws InterruptedException
		{
			welcompageLogin.click();
			mobilefield.sendKeys(userID);
			passwordfield.sendKeys(password);
			Thread.sleep(3000);
			//loginbutton.click();
			
		}

	}

	

