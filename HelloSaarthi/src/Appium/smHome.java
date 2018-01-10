package Appium;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class smHome {
	
	public static String baseurl="https://hellosaarthitechnologies.com/";
	public static AppiumDriver driver;
	public static String device="emulator-5554";
	public static String deviceName="4d0098a44b84211f";
	public static String platformVersion="4.3";
	public static String platformName="Android";
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities capabilites = new DesiredCapabilities();
		capabilites.setCapability("device", device);
		capabilites.setCapability("deviceName", deviceName);
		capabilites.setCapability("platformVersion", platformVersion);
		capabilites.setCapability("platformName", platformName);
		capabilites.setCapability("browserName", "browser");
		//capabilites.setCapability("browserName", "Chrome");
	
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilites);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
	
		System.out.println(baseurl+"/mobile/android/home.do");
		driver.get(baseurl);
		 Alert alert = driver.switchTo().alert();
		 alert.dismiss();
		 
	       driver.findElement(By.cssSelector("a.info")).click();
	        if (!(driver.findElements(By.cssSelector("img[alt=\"isteyin-getirelim\"]")).size() != 0)) {
	            System.out.println("verifyElementPresent failed");
	        }
	       driver.findElement(By.cssSelector("img[alt=\"Ana Menü\"]")).click();
	       System.out.println("Verify Text Present :- "+"İsteyin, Getirelim");
	        if (!driver.findElement(By.tagName("html")).getText().contains("İsteyin, Getirelim")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        System.out.println("Verify Text Present :- "+"MİGROS SANAL MARKET");
	        if (!driver.findElement(By.tagName("html")).getText().contains("MİGROS SANAL MARKET")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        System.out.println("Verify Text Present :- "+"KullanÄ±cÄ± bilgileri");
	        if (!driver.findElement(By.tagName("html")).getText().contains("KullanÄ±cÄ± bilgileri")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        System.out.println("Verify Text Present :- "+"Reyonlar");
	        if (!driver.findElement(By.tagName("html")).getText().contains("Reyonlar")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        System.out.println("Verify Text Present :- "+"Sepetim (0)");
	        if (!driver.findElement(By.tagName("html")).getText().contains("Sepetim (0)")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Arama")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Size Özel")) {
	            System.out.println("verifyTextPresent failed");
	        }
	       driver.findElement(By.linkText("Reyonlar")).click();
	        if (!driver.findElement(By.tagName("html")).getText().contains("Meyve, Sebze")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Gıda, Şekerleme")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Et")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("İçecek")) {
	            System.out.println("verifyTextPresent failed");
	        }
	       driver.findElement(By.linkText("Süt, Kahvaltılık")).click();
	       driver.findElement(By.id("toogleMenu")).click();
	       driver.navigate().back();
	        if (!driver.findElement(By.tagName("html")).getText().contains("Ev, Pet")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Deterjan, Temizlik")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Bebek, Oyuncak")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Kağıt, Kozmetik")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Bütün Kampanyalar")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Migroskop")) {
	            System.out.println("verifyTextPresent failed");
	        }
	       driver.findElement(By.linkText("Migroskop")).click();
	        if (!driver.findElement(By.tagName("html")).getText().contains("Migroskop Extra")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Bebek, Oyuncak")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Deterjan, Temizlik")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Et, Balık")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Ev, Pet")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Gıda, Şekerleme")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("İçecek")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Kağıt, Kozmetik")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Meyve, Sebze")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        if (!driver.findElement(By.tagName("html")).getText().contains("Süt, Kahvaltılık")) {
	            System.out.println("verifyTextPresent failed");
	        }
	       driver.navigate().back();
	       driver.findElement(By.linkText("Meyve, Sebze")).click();
	        if (!driver.findElement(By.tagName("html")).getText().contains("Meyve")) {
	            System.out.println("verifyTextPresent failed");
	        }
	        
	        System.out.println("Thanks for Using Srikanth's created Script");
	       driver.quit();
	    }
	    
	    public static boolean isAlertPresent(RemoteWebDriver wd) {
	        try {
	        	wd.switchTo().alert();
	            return true;
	        } catch (NoAlertPresentException e) {
	            return false;
	        }
	    }
}
