package SelfEmploy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG {
  @Test
  public void f() {
	  System.out.println("Excuted Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Excuted beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Excuted afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Excuted beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Excuted afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Excuted beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Excuted afterTest");
  }
  

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Excuted beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Excuted afterSuite");
  }

}
