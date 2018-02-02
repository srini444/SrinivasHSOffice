package pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
	
	WebDriver driver;
	static Logger log = Logger.getLogger(CreateAnAccount.class.getName()); 
	
	WebElement mrRadionButton = driver.findElement(By.xpath(".//*[@id='id_gender1']"));
	WebElement mrsRadioButton = driver.findElement(By.xpath(".//*[@id='id_gender2']"));
	WebElement craeteAnAccoutn = driver.findElement(By.xpath(".//*[@id='noSlide']/h1"));
	WebElement yourPersonalInfo = driver.findElement(By.xpath(".//*[@id='account-creation_form']/div[1]/h3"));
	
	WebElement firstName =  driver.findElement(By.xpath("//*[@id='customer_firstname']"));
	WebElement lastname =  driver.findElement(By.xpath("//*[@id='customer_lastname']"));
	WebElement emailAddress =  driver.findElement(By.xpath("//*[@id='email']"));
	WebElement password =  driver.findElement(By.xpath(".//*[@id='passwd']"));
	WebElement days =  driver.findElement(By.xpath(".//*[@id='days']"));
	WebElement months =  driver.findElement(By.xpath(".//*[@id='months']"));
	WebElement year =  driver.findElement(By.xpath(".//*[@id='years']"));
	WebElement signUpForOurNewsletter =  driver.findElement(By.xpath(".//*[@id='newsletter']"));
	WebElement receiveSpecialOffer =  driver.findElement(By.xpath(".//*[@id='optin']"));
	WebElement yourAddress =  driver.findElement(By.xpath(".//*[@id='account-creation_form']/div[2]/h3"));
	
	
	WebElement yourAddressFirstName =  driver.findElement(By.id("firstname"));
	WebElement yourAddressLasstName =  driver.findElement(By.id("lastname"));
	WebElement yourAddressCompany =  driver.findElement(By.id("firstname"));
	WebElement yourAddressPrimary =  driver.findElement(By.id("address1"));
	WebElement yourAddressSecondry =  driver.findElement(By.id("address2"));
	WebElement yourAddressCity =  driver.findElement(By.id("city"));
	WebElement yourAddressPostalCode =  driver.findElement(By.id("postcode"));
	WebElement yourAddressStateDropDown =  driver.findElement(By.id("//*[@id='id_state']"));
	WebElement yourAddressCountryName =  driver.findElement(By.id("//*[@id='id_country']"));
	WebElement yourAddressPhoneNumber =  driver.findElement(By.id("//*[@id='phone_mobile']"));
	WebElement yourAddressAlias =  driver.findElement(By.id("//*[@id='alias']"));
	
	/**
	 * 
	 */
	
	public void selectMrRadionButton()
	{
		log.info("selecting Mr Radion Button");
		
	}
}
