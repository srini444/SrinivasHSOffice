package RND;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class SeekBars {
	static DesiredCapabilities cap;
	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PLATFORM, "Android");
		cap.setCapability(CapabilityType.VERSION, "6.0"); 
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);	
		
		Thread.sleep(2000);
		driver.findElement(By.name("Views")).click();
		
		//calling a user defined scrollTo() method
		if (scrollTo("Seek Bar"))
			driver.findElement(By.name("Seek Bar")).click();
		
		//Locate the seekbar
        WebElement seek_bar=driver.findElement(By.className("android.widget.SeekBar"));
        
        // get location of seek bar from left
        int start=seek_bar.getLocation().getX();
        System.out.println("Startpoint - " + start);
        
        //get location of seekbar from top
        int y=seek_bar.getLocation().getY();
        System.out.println("Yaxis - "+ y);
        
        //Get total width of seekbar
        int end=start + seek_bar.getSize().getWidth();
        System.out.println("End point - "+ end);
        
        TouchAction action=new TouchAction(driver);
        //move slider to 70% of width
        int moveTo=(int)(end*0.7);
        action.longPress(start,y).moveTo(moveTo,y).release().perform();
	}
	
	static boolean scrollTo(String value ){
		while(driver.findElements(By.name(value)).size()==0)
		{
			Dimension dimensions = driver.manage().window().getSize();
			Double screenHeightStart = dimensions.getHeight() * 0.5;
			int scrollStart = screenHeightStart.intValue();
			Double screenHeightEnd = dimensions.getHeight() * 0.2;
			int scrollEnd = screenHeightEnd.intValue();
			driver.swipe(0,scrollStart,0,scrollEnd,2000);
		}
		if(driver.findElements(By.name(value)).size()>0)
		{
			return true;
		} 
		else
			return false;
	}
}