package operation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class UIOperation {

	AndroidDriver driver;
	
	public UIOperation(AndroidDriver driver){
		
		this.driver = driver;
	
	}
	public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
	
		switch (operation.toUpperCase()) {
		
		case "GOTOURL":
			//Get url of application
			driver.get(p.getProperty(value));
			break;
			
		case "SETTEXT":
			//Set text on control
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
			break;
		
		case "SUBMIT":
			//Perform Submit
			driver.findElement(this.getObject(p,objectName,objectType)).submit();
			break;
			
		default:
			break;
		}
	}
	

	 //Find element BY using object type and value
	
	private By getObject(Properties p,String objectName,String objectType) throws Exception{
		

		//Find by xpath
				if(objectType.equalsIgnoreCase("XPATH")){
				return By.xpath(p.getProperty(objectName));
				}
				
				//find by id
				else if(objectType.equalsIgnoreCase("ID")){
				return By.id(p.getProperty(objectName));
				}
				
				//find by name
				else if(objectType.equalsIgnoreCase("NAME")){
				return By.name(p.getProperty(objectName));
				}
				
				//find by class
				else if(objectType.equalsIgnoreCase("CLASSNAME")){
				return By.className(p.getProperty(objectName));
				}
				
				//find by link text
				else if(objectType.equalsIgnoreCase("LINKTEXT")){
				return By.linkText(p.getProperty(objectName));
				}
				
				//find by partial link text
				else if(objectType.equalsIgnoreCase("PARTIALLINKTEXT")){
				return By.partialLinkText(p.getProperty(objectName));
				}
				
				//Find by css
				else if(objectType.equalsIgnoreCase("CSS")){
				return By.cssSelector(p.getProperty(objectName));
				}
		
		else
		{
		throw new Exception("Wrong object type");
		}
	}
}