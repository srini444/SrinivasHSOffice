package Appium;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

 public class HelloSaarthi 
{
 static DesiredCapabilities Cap;
 static AndroidDriver driver;
 
 public static void main(String[] args) throws MalformedURLException, InterruptedException
 {
// Launch application Emulator-1 HelloSaarthi App 
   /*Cap = new DesiredCapabilities();
   Cap.setCapability(CapabilityType.PLATFORM, "Android");
   Cap.setCapability(CapabilityType.VERSION, "6.0");
   Cap.setCapability("deviceName", "emulator-5554");
   Cap.setCapability("newCommandTimeout", 60 * 5);
   Cap.setCapability("appPackage", "com.saarthi.main");
   Cap.setCapability("appActivity", "com.saarthi.main.SplashScreen");
   driver = (AndroidDriver) new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), Cap);
   System.out.println("HelloSaarthi App is launched successfully");
   Thread.sleep(20000);
   driver.findElement(By.id("com.saarthi.main:id/username")).sendKeys("9871536225");
   driver.findElement(By.id("com.saarthi.main:id/password")).sendKeys("12345");
   Thread.sleep(3000);
   driver.findElement(By.id("com.saarthi.main:id/signin")).click();*/
   
   
   Cap = new DesiredCapabilities();
   Cap.setCapability(CapabilityType.PLATFORM, "Android");
   Cap.setCapability(CapabilityType.VERSION, "6.0");
   Cap.setCapability("deviceName", "emulator-5554");
   Cap.setCapability("newCommandTimeout", 60 * 5);
   Cap.setCapability("appPackage", "net.one97.paytm");
   Cap.setCapability("appActivity", "net.one97.paytm.AJRJarvisSplash");
   driver = new AndroidDriver(new URL("http://127.0.0.1:4491/wd/hub"), Cap);
   System.out.println("PayTm App is launched successfully");
   Thread.sleep(5000);

  
 }
 
}