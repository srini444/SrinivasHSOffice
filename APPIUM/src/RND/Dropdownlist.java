package RND;

//import the required classes
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public  class Dropdownlist {
 
 public static void main(String[] args) {
  
     WebDriver driver =null;
     //set the driver path
     //System.setProperty("webdriver.chrome.driver", "F:\\selenium\\csharp\\chromedriver.exe");
    
     //System.setProperty("webdriver.ie.driver", "F:\\selenium\\IEDriverServer_Win32_2.43.0\\IEDriverServer.exe");
    
  
    
     driver = new FirefoxDriver();
    
     //set the timeouts for page load and all elements
     driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
    
      try{
       
       //open the given web page
   
    driver.get("http://register.rediff.com/commonreg/index.php");
       //driver.get("file:///F:/selenium/selenium-blog.html");
        
    //Maximise the browser window
    driver.manage().window().maximize();
    
    //System.out.println(driver.getPageSource());
    
    System.out.println(driver.getTitle());
    
    
    System.out.println(driver.getCurrentUrl());
    
    WebElement y = driver.findElement(By.id("date_day"));
      
   
    
    Select p = new Select(y);
    p.selectByVisibleText("11");
    String z = p.getFirstSelectedOption().getAttribute("value");
    System.out.println(z);
    
    List <WebElement> k = p.getOptions();
    //Code to print the text values of the options in list box
    for(int i=0; i<k.size();i++)
     System.out.println(k.get(i).getText());
    
      

    
    //wait for 2 seconds
    Thread.sleep(2000);
   }catch(Exception e){
   
   //print exception if any
   System.out.println(e.getMessage() );
   e.printStackTrace();
  }
   finally{
   
   //close the driver
   driver.close();
   //quit the driver.
   driver.quit();
  } 
 }
}