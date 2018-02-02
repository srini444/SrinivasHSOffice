package pagelibrary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin 
{
	WebDriver driver;
	static Logger log = Logger.getLogger(Signin.class.getName()); 
	
	WebElement signIn = driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	WebElement createAccEmailAddr = driver.findElement(By.xpath(".//*[@id='email_create']"));
	WebElement alreadyRegEmilAddr = driver.findElement(By.xpath(".//*[@id='email']"));
	WebElement alreadyRegPass = driver.findElement(By.xpath(".//*[@id='passwd']"));
	WebElement submitbutton = driver.findElement(By.xpath(".//*[@id='SubmitLogin']"));
	
	
	/**
	 * This method will click on sign in link in login page
	 */
	public void clickonSignIn() 
	{
		log.info("Clicking on sign in link");
		signIn.click();
	}
	
	
	/**
	 * This method will enter email address to create an account text box.
	 * In Login Page
	 * @param emilAddress
	 */
	public void enterEmailAddressToCreateAccount(String emilAddress) 
	{
		log.info("entering email address to create an account");
		createAccEmailAddr.sendKeys(emilAddress);
	}
	
	public void enterAllreadyRegisterEmail(String emilAddress) 
	{
		log.info("entering email addredd to all ready registered user text box");
		alreadyRegEmilAddr.sendKeys(emilAddress);
	}
	
	
	public void clickonSignInToAccount() 
	{
		log.info("clicking on sign in button");
		submitbutton.click();
	}
	
	
	public void enterAllreadyRegisterPassword(String password) 
	{
		log.info("entering password to password text box");
		alreadyRegPass.sendKeys(password);
	}
	
	
 
}
