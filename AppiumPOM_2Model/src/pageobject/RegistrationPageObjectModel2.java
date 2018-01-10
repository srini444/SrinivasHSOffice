package pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageObjectModel2 {
		

	@FindBy(linkText="REGISTER")
	WebElement registerlink;
	
	
	@FindBy(name="firstName")
	WebElement firstnamefield;
	
	
	@FindBy(name="lastName")
	WebElement lastnamefield;
	
	@FindBy(name="country")
	WebElement dp;
	
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
	
	
	public void clickRegisterLink()
	{
	registerlink.isDisplayed();
	registerlink.click();	
	}
	
	public void enterFirstName(String firstname)
	{
	firstnamefield.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
	lastnamefield.sendKeys(lastname);
	}
	
	public void selectDropdown()
	{
	Select dropdown=new Select(dp);
	dropdown.selectByVisibleText("ALBANIA");
	}
	
	public void enterUserName(String username)
	{
	usernamefield.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
	passwordfield.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmpassword)
	{
	confirmpasswordfield.sendKeys(confirmpassword);
	}
		
	public void clickRegisterButton()
	{
	registerbutton.click();	
	}
	
	public void clickSignInLink()
	{
	signinlink.click();
	}
	
	


}
