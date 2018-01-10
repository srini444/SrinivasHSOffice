package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement loginEmailAddress;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement loginPassword;
	
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement submitButton;
	
	

	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationfailed;
	
	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void loginToApplicatio(String emailAddress, String password) {
		
		signIn.click();
		log.info("Clicked On Sigin and object is :-"+ signIn.toString());
		loginEmailAddress.sendKeys(emailAddress);
		log.info("Enter Email:-" +emailAddress + "and object is" + loginEmailAddress.toString());
		loginPassword.sendKeys(password);
		log.info("Enter Email:-" +password + "and object is" + loginPassword.toString());
		submitButton.click();
		log.info("Clicked On Submit button and object is :-"+ submitButton.toString());
		
	}
	
	public String getInvalidloginText() {
		log.info("Error message is :-"+ authenticationfailed.getText());
		return authenticationfailed.getText();
		
	}
	
}
