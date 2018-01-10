package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

 public class RunMultipleDifferentTypesOfApps 
{
 static DesiredCapabilities Cap;
 static DesiredCapabilities Cap1;
 static DesiredCapabilities Cap2;
 static DesiredCapabilities Cap3;
 static AndroidDriver driver;
 static AndroidDriver driver1;
 static AndroidDriver driver2;
 static AndroidDriver driver3;
 public static void main(String[] args) throws MalformedURLException, InterruptedException
 {
// Launch application Emulator-1 PayTm App 
  Cap = new DesiredCapabilities();
   Cap.setCapability(CapabilityType.PLATFORM, "Android");
   Cap.setCapability(CapabilityType.VERSION, "6.0");
   Cap.setCapability("deviceName", "emulator-5556");
   Cap.setCapability("newCommandTimeout", 60 * 5);
   Cap.setCapability("appPackage", "net.one97.paytm");
  Cap.setCapability("appActivity", "net.one97.paytm.AJRJarvisSplash");
   driver = new AndroidDriver(new URL("http://127.0.0.1:4491/wd/hub"), Cap);
  System.out.println("PayTm App is launched successfully");
  Thread.sleep(5000);
    
// Launch application Emulator-2 Jabong App
  Cap1 = new DesiredCapabilities();
   Cap1.setCapability(CapabilityType.PLATFORM, "Android");
   Cap1.setCapability(CapabilityType.VERSION, "6.0");
   Cap1.setCapability("deviceName", "emulator-5554");
   Cap1.setCapability("newCommandTimeout", 60 * 5);
   Cap1.setCapability("appPackage", "com.jabong.android");
  Cap1.setCapability("appActivity", "com.jabong.android.view.activity.SplashActivity");
   driver1 = new AndroidDriver(new URL("http://127.0.0.1:4492/wd/hub"), Cap1);
  System.out.println("Jabong App is launched successfully");
  Thread.sleep(5000);
 
// Launch application Emulator-3 Book My Show App
    Cap2 = new DesiredCapabilities();
     Cap2.setCapability(CapabilityType.PLATFORM, "Android");
     Cap2.setCapability(CapabilityType.VERSION, "6.0");
     Cap2.setCapability("deviceName", "emulator-5558");
     Cap2.setCapability("newCommandTimeout", 60 * 5);
     Cap2.setCapability("appPackage", "com.bt.bms.ae");
    Cap2.setCapability("appActivity", "com.bt.bms.ae.activities.SplashActivity");
     driver2 = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Cap2);
    System.out.println("Book My Show App is launched successfully");
    Thread.sleep(5000);  

// Launch application Emulator-4 Ebay App
    Cap3 = new DesiredCapabilities();
     Cap3.setCapability(CapabilityType.PLATFORM, "Android");
     Cap3.setCapability(CapabilityType.VERSION, "6.0");
     Cap3.setCapability("deviceName", "emulator-5560");
     Cap3.setCapability("newCommandTimeout", 60 * 5);
     Cap3.setCapability("appPackage", "com.ebay.mobile");
    Cap3.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
     driver3 = new AndroidDriver(new URL("http://127.0.0.1:4475/wd/hub"), Cap3);
    System.out.println("Ebay App is launched successfully");
    Thread.sleep(5000);      
    
   
 }
 
}