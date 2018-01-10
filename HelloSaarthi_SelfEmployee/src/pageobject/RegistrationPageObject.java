package pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageObject {
	
	
	@FindBy(id="com.saarthi.main:id/join_btn")
	WebElement JoinButton;
	
	@FindBy(id="com.saarthi.main:id/fullname")
	WebElement namefield;
	
	@FindBy(id="com.saarthi.main:id/email")
	WebElement emailidfield;
	
	@FindBy(id="com.saarthi.main:id/mobile")
	WebElement mobilefield;
	
	@FindBy(id="com.saarthi.main:id/password")
	WebElement passwordfield;

	@FindBy(id="com.saarthi.main:id/confirmpassword")
	WebElement confirmpasswordfield;
	
	@FindBy(id="com.saarthi.main:id/pincode")
	WebElement pincodefield;
	
	@FindBy(id="com.saarthi.main:id/checkbox")
	WebElement checkboxfield;
	
	@FindBy(id="com.saarthi.main:id/btn_register")
	WebElement joinnowButton;
	
	public void Registration(String name, String emailID, String mobile, String password, String confirmpassword, String pincode) throws InterruptedException
	{
		JoinButton.click();
		Thread.sleep(3000);
		namefield.sendKeys(name);
		emailidfield.sendKeys(emailID);
		mobilefield.sendKeys(mobile);
		passwordfield.sendKeys(password);
		confirmpasswordfield.sendKeys(confirmpassword);
		pincodefield.sendKeys(pincode);
		Thread.sleep(2000);
		checkboxfield.click();
		Thread.sleep(3000);
		joinnowButton.click();
	}


}
