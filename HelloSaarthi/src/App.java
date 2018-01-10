import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App 
{
	static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", "emulator-5554");
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Browser");
		  capabilities.setCapability(CapabilityType.VERSION, "6.0");
		  capabilities.setCapability("platformName", "Android");
		  driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.id("m_login_email")).sendKeys("9871536225");
		  Thread.sleep(3000);
		  driver.findElement(By.name("pass")).sendKeys("123456789");
		  Thread.sleep(3000);
		  driver.findElement(By.name("login")).click();
		  
		  
		 
	}

}
