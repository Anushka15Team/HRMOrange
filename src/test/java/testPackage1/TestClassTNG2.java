package testPackage1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTNG2 
{
	public class TestClassTNG 
	{
		@Parameters({"browserName"})
		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("Before suite of class2");
		}
		
	 @BeforeClass
	public void beforeClass()
	{
	System.out.println("Before class of class2");	
	}
	 
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("before method of class2");
	 }
	 
	 @BeforeTest
	 public void beforeTest(String browserName)
	 {
		 if(browserName.equals("chrome"))
				 {
			 System.out.println("chrome is opening");
				 }
		 else if (browserName.equals("Firefox") )
		 {
			 System.out.println("Firefox is opening");
		 }
		 else if (browserName.equals("Edge"))
		 {
			 System.out.println("Edge is opening");
		 }
			 
	 }
	 
	 @Test
	 public void test3()
	 {
		 System.out.println("test3 of class2");
		 Assert.fail();
	 }
	 


	@AfterClass
	public void afterClass()
	{
		System.out.println("after class of class2");
	}

	@AfterTest
	public void test2()
	{
		System.out.println("After test of class2");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite of class2");
	}
	
	}

}
