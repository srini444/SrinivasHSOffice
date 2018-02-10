package RND;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ScrollTabs {
 AndroidDriver driver;
 Dimension size;
 
 @BeforeTest
 public void setUp() throws Exception {
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "110158e934f1334a");
	  capabilities.setCapability("browserName", "Android");
	  capabilities.setCapability("platformVersion", "4.4.4");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("appPackage", "com.saarthi.main");
	  capabilities.setCapability("appActivity","com.saarthi.main.SplashActivity");
  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 }

 @Test
 public void ScrollToTab() throws InterruptedException {
  /*
  
  //Scroll till element which contains "Views" text If It Is not visible on screen.
  driver.scrollTo("Views");
  
  //Click on Views/.
  driver.findElement(By.name("Views")).click();
  System.out.println("Vertical scrolling has been started to find text -> Tabs.");
  
  //Scroll till element which contains "Tabs" text.
  driver.scrollTo("Tabs");
  System.out.println("Tabs text has been found and now clicking on It.");
  
  //Click on Tabs
  driver.findElement(By.name("Tabs")).click();
  
  //Click on Scrollable text element.
  driver.findElement(By.name("5. Scrollable")).click();
  System.out.println("Horizontal scrolling has been started to find tab -> Tab 11.");*/
  
  //Used for loop to scroll tabs until Tab 11 displayed.
  /*for(int i=0; i<=10; i++){
   //Set implicit wait to 2 seconds for fast horizontal scrolling.
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);   
   if(driver.findElements(By.name("Tab 11")).size()!= 0){
    //If Tab 11 Is displayed then click on It.
    System.out.println("Tab 11 has been found and now clicking on It.");
    driver.findElement(By.name("Tab 11")).click();
    break;
   }else{
   
    //If Tab 11 Is not displayed then scroll tabs from right to left direction by calling ScrollTabs() method.
    ScrollTabs();
   }
  }
  
  //Set implicit wait to 15 seconds after horizontal scrolling.
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  
  //Locate parent element of text area.
  WebElement ele1 = (WebElement) driver.findElements(By.id("android:id/tabcontent")).get(0);
  
  //Locate text area of Tab 11 using It's parent element.
  WebElement ele2 = ele1.findElement(By.className("android.widget.TextView"));
  
  //Get text from text area of Tab 11 and print It In console.
  System.out.println("Text under selected tab is -> "+ele2.getText());
*/ } 
 
 //To scroll tabs right to left In horizontal direction.
	 
	 
 public void ScrollTabs() throws InterruptedException {
  
	 WebElement price=driver.findElement(By.id("com.saarthi.main:id/sb_price"));
     int start=price.getLocation().getX();
     System.out.println("Price Startpoint - " + start);
     int y=price.getLocation().getY();
     System.out.println("Price Yaxis - "+ y);
     int end=start + price.getSize().getWidth();
     System.out.println("Price End point - "+ end);
     TouchAction action=new TouchAction(driver);
     int moveTo=(int)(end*1);
     action.longPress(start,y).moveTo(moveTo,y).release().perform();
		Thread.sleep(5000);	 
  
 //Get the size of screen.
  size = driver.manage().window().getSize();  
  
  //Find swipe start and end point from screen's with and height.
  //Find startx point which is at right side of screen.
  int startx = (int) (size.width * 0.70);
  //Find endx point which is at left side of screen.
  int endx = (int) (size.width * 0.30);
  //Set Y Coordinates of screen where tabs display.
  int YCoordinates = 150;  

  //Swipe tabs from Right to Left.
  driver.swipe(startx, YCoordinates, endx, YCoordinates, 3000);  
 }
 
 @AfterTest
 public void End() {
  driver.quit();
 }
}