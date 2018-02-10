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

public class SetStarRating {
 AndroidDriver driver;

 @BeforeTest
 public void setUp() throws Exception {
	 DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "emulator-5554");
	  capabilities.setCapability("platformVersion", "6.0");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("app", "E:\\Appium Class Notes\\Class5\\ApiDemos.apk");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 
  // Scroll till element which contains "Views" text If It Is not visible on screen.
  Thread.sleep(3000);
  verticalSwipe();
  Thread.sleep(5000);
  driver.findElement(By.name("Views")).click();
  Thread.sleep(3000);
  
  
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
	if(driver.findElements(By.name("Rating Bar")).size()!= 0)
	   {
		driver.findElement(By.name("Rating Bar")).click();
		break;
		}
		 
	 }
	
	
 }

 //Set 3 StarRatingbar = 1 star.
 @Test
 public void set3StarRatingbar(){  
  //Locate threeStarRatingbar.
  WebElement threeStarRatingbar = driver.findElement(By.id("io.appium.android.apis:id/ratingbar1"));
  //Get start point of threeStarRatingbar.
  int startX = threeStarRatingbar.getLocation().getX();
  System.out.println(startX);
  //Get end point of threeStarRatingbar.
  int endX = threeStarRatingbar.getSize().getWidth();
  System.out.println(endX);
  //Get vertical location of threeStarRatingbar.
  int yAxis = threeStarRatingbar.getLocation().getY();
  
  //Set threeStarRatingbar tap position to set Rating = 1 star.
  //You can use endX * 0.3 for 1 star, endX * 0.6 for 2 star, endX * 1 for 3 star.
  int tapAt = (int) (endX * 0.3);    
  //Set threeStarRatingbar to Rating = 1.0 using TouchAction class.
  TouchAction act=new TouchAction(driver);  
  act.press(tapAt,yAxis).release().perform();
 }
 
 //Set 5 StarRatingbar = 4 star.
 @Test
 public void set5StarRatingbar(){  
  //Locate fiveStarRatingbar.
  WebElement fiveStarRatingbar = driver.findElement(By.id("io.appium.android.apis:id/ratingbar2"));
  //Get start point of fiveStarRatingbar.
  int startX = fiveStarRatingbar.getLocation().getX();
  System.out.println(startX);
  //Get end point of fiveStarRatingbar.
  int endX = fiveStarRatingbar.getSize().getWidth();
  System.out.println(endX);
  //Get vertical location of fiveStarRatingbar.
  int yAxis = fiveStarRatingbar.getLocation().getY();
  
  //Set fiveStarRatingbar tap position to set Rating = 4 star.
  //You can use endX * 0.2 for 1 star, endX * 0.4 for 2 star, endX * 0.6 for 3 star, endX * 0.8 for 4 star, endX * 1 for 5 star.
  int tapAt = (int) (endX * 0.8);  
  //Set fiveStarRatingbar to Rating = 4 star using TouchAction class.
  TouchAction act=new TouchAction(driver);  
  act.press(tapAt,yAxis).release().perform();
 }

 public void verticalSwipe()
	{
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		int x = width/2;
		int starty = (int)(height*0.80);
		int endy = (int)(height*0.20);
		driver.swipe(x, starty, x, endy, 500);
		
	}


 @AfterTest
 public void End() {
  driver.quit();
 }
}