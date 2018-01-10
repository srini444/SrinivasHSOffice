package pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageObject {
		

	@FindBy(linkText="REGISTER")
	public WebElement registerlink;
	
	
	@FindBy(name="firstName")
	public WebElement firstnamefield;
	
	
	@FindBy(name="lastName")
	public WebElement lastnamefield;
	
	@FindBy(name="country")
	public WebElement dp;
	
	@FindBy(name="email")
	public WebElement usernamefield;

	@FindBy(name="password")
	public WebElement passwordfield;

	@FindBy(name="confirmPassword")
	public WebElement confirmpasswordfield;
	
	@FindBy(name="register")
	public WebElement registerbutton;
	
	@FindBy(linkText="sign-in")
	public WebElement signinlink;
	
	
	public void clickRegisterLink()
	{
	}
	
	public void enterFirstName()
	{
	}
	
	public void enterLastName()
	{
	}
	
	public void selectDropdown()
	{
	Select dropdown=new Select(dp);
	dropdown.selectByVisibleText("ALBANIA");
	}
	
	public void enterUserName()
	{
	}
	
	public void enterPassword()
	{
	}
	
	public void enterConfirmPassword()
	{
	}
		
	public void clickRegisterButton()
	{
	}
	
	public void clickSignInLink()
	{
	}
	
	


}
