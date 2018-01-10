package pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObject {
	
	
	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	
	
	@FindBy(name="firstName")
	WebElement firstnamefield;
	
	
	@FindBy(name="lastName")
	WebElement lastnamefield;
	
	
	@FindBy(name="email")
	WebElement usernamefield;

	@FindBy(name="password")
	WebElement passwordfield;

	@FindBy(name="confirmPassword")
	WebElement confirmpasswordfield;
	
	@FindBy(name="register")
	WebElement registerbutton;
	
	@FindBy(linkText="sign-in")
	WebElement signinlink;
	
	public void Registration(String firstname, String lastname, String username, String password, String confirmpassword) throws Exception
	{
		registerlink.click();
		Thread.sleep(2000);
		firstnamefield.sendKeys(firstname);
		lastnamefield.sendKeys(lastname);
		usernamefield.sendKeys(username);
		passwordfield.sendKeys(password);
		confirmpasswordfield.sendKeys(confirmpassword);
		registerbutton.click();
		Thread.sleep(5000);
		signinlink.click();
	}


}
