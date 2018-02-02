package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class SearchJobsPageObject {

	AndroidDriver driver;		
	@FindBy(name="Search Jobs")
	public WebElement SearchJobsButton;
	
	@FindBy(name="Enter Skill, Designation, Role")
	public WebElement KeywordsTextBox;

	@FindBy(name="Select Location")
	public WebElement LocationButton;
		
	

		
		public void SearchJobsButton() throws InterruptedException
		{
						
		}
		
		public void Keywords() throws InterruptedException
		{
						
		}
		
		public void KeywordsEnter(AndroidDeviceActionShortcuts driver) throws InterruptedException
		{
			Thread.sleep(2000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
			Thread.sleep(2000);
			driver.pressKeyCode(AndroidKeyCode.ENTER);	
		}
		public void Location()
		{
						
		}
		
		

	}

	

