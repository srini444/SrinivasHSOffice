package DDFJXL;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class SelfEmpoyReg 
{
AndroidDriver driver;
	
	@BeforeTest
	public void setUp() throws Exception 
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appPackage", "com.saarthi.main");
		capabilities.setCapability("appActivity", "com.saarthi.main.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void login() 
	{
//Login 
		driver.findElement(By.name("LOG IN")).click();
		driver.findElement(By.id("com.saarthi.main:id/mobile")).sendKeys("9871536225");
		driver.findElement(By.id("com.saarthi.main:id/password")).sendKeys("12345");
		driver.findElement(By.id("com.saarthi.main:id/email_sign_in_button")).click();
	}
	
	@Test(dataProvider = "testdata")
		public void postYourProblem (String problem_title, String problem_description, String bid_amount) throws InterruptedException
	 {
//Post Your Problem
		Thread.sleep(1000);
		driver.findElement(By.id("com.saarthi.main:id/fab")).click();
		driver.findElement(By.id("com.saarthi.main:id/iv_problem1")).click();
		driver.findElement(By.name("Camera")).click();
		driver.findElement(By.id("com.android.camera:id/shutter_button")).click();
		driver.findElement(By.id("com.android.camera:id/btn_done")).click();
		driver.findElement(By.id("com.saarthi.main:id/crop_image_menu_crop")).click();
			
//	//Post Your Problem Excel Data
		driver.findElement(By.id("com.saarthi.main:id/tv_problem_title")).sendKeys(problem_title);
		driver.findElement(By.id("com.saarthi.main:id/tv_problem_description")).sendKeys(problem_description);
		driver.findElement(By.id("com.saarthi.main:id/rbPerDay")).click();
		driver.hideKeyboard();
		driver.findElement(By.id("com.saarthi.main:id/tv_budget_amount")).sendKeys(bid_amount);
		driver.findElement(By.id("com.saarthi.main:id/tv_category")).click();
		driver.findElement(By.name("Engineering")).click();
		driver.findElement(By.name("Software Engineer")).click();
		driver.findElement(By.id("com.saarthi.main:id/layout_date_time")).click();
		driver.findElement(By.id("com.saarthi.main:id/tv_ok")).click();
		driver.findElement(By.id("com.saarthi.main:id/tv_post_problem")).click();
	}
		
//Read test data from excel
	@DataProvider(name = "testdata")
		 public Object [][] readExcel() throws BiffException, IOException 
	{
//File location outside eclipse
		File f = new File("E:/DDFJXL.xls");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(1);
		int rows = s.getRows();
		System.out.println(rows);
		int columns = s.getColumns();
		System.out.println(columns);
		String inputdata [] [] = new String [rows] [columns];
		for (int i = 0; i<rows; i++)
		{
			for (int j= 0; j<columns; j++)
			{
			Cell c = s.getCell(j,i);
			inputdata [i] [j] = c.getContents();
			//System.out.println(inputdata[i][j]);
			}
		}
	return inputdata;
	}
		 	
	@AfterTest
		public void Logout() throws Exception 
	 {
//Logout
		Thread.sleep(2000);
		driver.findElement(By.id("com.saarthi.main:id/tv_menu")).click();
		driver.findElement(By.id("com.saarthi.main:id/menu_profile")).click();
		driver.findElement(By.id("com.saarthi.main:id/tv_logout")).click();
		driver.findElement(By.id("com.saarthi.main:id/okButton")).click();
		Thread.sleep(2000);
		driver.closeApp();
	}
}


