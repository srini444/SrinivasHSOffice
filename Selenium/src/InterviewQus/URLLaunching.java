package InterviewQus;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class URLLaunching {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() 
	{
	}
	public boolean isAlertPresent() 
	{
	// How verify the Alert
		try 
		{
		driver.switchTo().alert();
		return true;
		}
		
		catch(Exception e)
		{
		return false;
			
		}
	}
	
	@Test
	public void Test() throws IOException 
	{
		driver = new FirefoxDriver();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	//1 How Get Text of Alert
		Alert text = driver.switchTo().alert();
		System.out.println(text.getText());
		System.out.println("----------------------------------------");
		
		
	//2 How Select the Frame
		driver.switchTo().frame(0);
		driver.switchTo().frame("framename");
		driver.switchTo().frame(driver.findElement(By.xpath("")));
		 System.out.println("----------------------------------------");
		
		
	//3 How window Handle 
		String pwindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> allwindow = allWindows.iterator();
		String Parentwindow = allwindow.next();
		driver.switchTo().window(Parentwindow);
		String ChaildWindow = allwindow.next();
		driver.switchTo().window(ChaildWindow);
		driver.switchTo().defaultContent();
		 System.out.println("----------------------------------------");
		
	//3	Wait conditions
		// implicitlyWait applicable for entire page 
		//driver Will wait 30 sec to all Dom of the page and if it will not load of the page it will give timeout Exception  
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
		 System.out.println("----------------------------------------");
		 
	//4 How to do mouse over elements
		 
		 Actions act = new Actions(driver); 
		 act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		 System.out.println("----------------------------------------");
		 
	//5 How Select data in the drop down
		 
		 Select dp = new Select(driver.findElement(By.xpath("")));
		 dp.selectByIndex(2);
		 dp.selectByValue("");
		 dp.selectByVisibleText("Test");
		 
		 List<WebElement> alop = dp.getOptions();
		 System.out.println("----------------------------------------");
	
	//6 How to do Drag and drop
		 Actions dragdrop = new Actions(driver);
		 dragdrop.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		 System.out.println("----------------------------------------");
		 
	//7 How Get Screen Shot in Selenium
		 
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile, new File("D:/Srinivas.jpg"));
		 System.out.println("----------------------------------------");
	
	//8 How to get the coordinate of the window 	 
		 driver.manage().window().getPosition().getX();
		 driver.manage().window().getPosition().getY();
		 
		 Point postiont = driver.manage().window().getPosition();
		 postiont.getX();
		 postiont.getY();
		 System.out.println("----------------------------------------");
		 
	//9 How Forward and navigate Backward 
		 driver.navigate().forward();
		 driver.navigate().back();
		 System.out.println("----------------------------------------");
	
	//10 How Get Current URl of Page
		 String cUrl = driver.getCurrentUrl();
		 driver.getTitle();
	
	//11 Total no of Same Element on UI
		 int size = driver.findElements(By.xpath("")).size();
	
	//12 What is the following-sibling	
		driver.findElement(By.xpath("@id[name='test']/following-sibling::td[2]")); 
		driver.findElement(By.xpath("@id[name='test']/preceding-sibling::td[2]")); 
		driver.findElement(By.xpath("@id[name='test']/child::td[2]")); 
	
	//13 Similar kind of elements
		driver.findElements(By.xpath("")).get(5);
	
	//14 Check box is Selected or not
		driver.findElement(By.xpath("")).isSelected();
		driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
	
	//15 How Executed the Java Script	 
		
		JavascriptExecutor JavascriptExecutor = (JavascriptExecutor)driver;
		JavascriptExecutor.executeScript("return window.length");
	
	//16 How maximize and launch Url
		
		driver.manage().window().maximize();
		driver.get("");
	
	// 17	
		System.out.println(driver.findElement(By.xpath("")).getAttribute("name"));
		driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
		
		
		
		
		
	}
	@AfterTest
	public void afterTest() 
	{
		
	}


}
