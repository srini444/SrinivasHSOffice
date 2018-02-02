package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
		
	

	@FindBy(name="Done")
	public WebElement DoneButton;
	
	
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
		
		public void LocationButton()
		{
						
		}
		
		public void SelectCity()
		{
						
		}
		
		
		public void DoneButton()
		{
						
		}
		
		
		public void ScrollTech()
		{
			Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			System.out.println("s="+scrollStart);
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
			
			
			for(int i=0; i<dimensions.getHeight(); i++)
			{
			driver.swipe(0,scrollStart,0,scrollEnd,2000);
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);   
			if(driver.findElements(By.name("IT Software - Mobile")).size()!= 0)
			   {
				driver.findElement(By.name("IT Software - Mobile")).click();
				break;
				}
				 
			 }	
			
		}
			public void ScrollCity()
			{
				Dimension dimensions = driver.manage().window().getSize();
				Double screenHeightStart = dimensions.getHeight() * 0.5;
				int scrollStart = screenHeightStart.intValue();
				System.out.println("s="+scrollStart);
				Double screenHeightEnd = dimensions.getHeight() * 0.2;
				int scrollEnd = screenHeightEnd.intValue();
				
				
				for(int i=0; i<dimensions.getHeight(); i++)
				{
				driver.swipe(0,scrollStart,0,scrollEnd,2000);
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);   
				if(driver.findElements(By.name("Hyderabad / Secunderabad")).size()!= 0)
				   {
					driver.findElement(By.name("Hyderabad / Secunderabad")).click();
					break;
					}
					 
				 }	
			
			
			
			
			
		}

	}

	

