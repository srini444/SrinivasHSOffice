package pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBookingPageObject {
	


	@FindBy(name="findFlights")
	public WebElement continuebutton1;
	
	@FindBy(name="reserveFlights")
	public WebElement continuebutton2;
	
	@FindBy(name="buyFlights")
	public WebElement securepurchasebutton;
	
	@FindBy(xpath="//img[@src='/images/forms/Logout.gif']")
	public WebElement logoutbutton;

		
	public void clickFindFlights()
	{	
	}
	
	public void clickReserveFlights()
	{	
	}
	
	public void clickBuyFlights()
	{	
	}
	
	public void clickLogout()
	{
	}
	
	
}

