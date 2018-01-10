package pageobject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBookingPageObject {
	


	@FindBy(name="findFlights")
	WebElement continuebutton1;
	
	@FindBy(name="reserveFlights")
	WebElement continuebutton2;
	
	@FindBy(name="buyFlights")
	WebElement securepurchasebutton;
	
	@FindBy(xpath="//img[@src='/images/forms/Logout.gif']")
	WebElement logoutbutton;

		
	public void Flightbooking() throws Exception
	
	{
		Thread.sleep(3000);
		continuebutton1.click();
		Thread.sleep(2000);
		continuebutton2.click();
		Thread.sleep(2000);
		securepurchasebutton.click();
		Thread.sleep(2000);
		logoutbutton.click();
		
	}
}

