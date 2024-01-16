package testPackage1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage1.LoginPage;
import testUtility.ReadFileData;

public class LoginTestClass extends BaseClass
{
LoginPage login;

ReadFileData r;

 @BeforeClass
public void beforeClass()
{
        login = new LoginPage(driver);
}
 
 @BeforeMethod
 public void beforeMethod()
 {
	 System.out.println("before method");
 }
 
 @Test
 public void VerifyLoginFunctionalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException 
 {
	 logger = report.createTest("Verify Login Functionality With Correct Data");
	 SoftAssert s = new SoftAssert();
	 
//	 login.SendUsername(r.FetchDataFromExcel(1, 0));
//	 login.SendPassword(r.FetchDataFromExcel(1, 1));
		login.SendUsername("Admin");
		login.SendPassword("admin123");
		login.ClickOnLoginButton();
		Thread.sleep(30000);
		boolean result= login.FetchCurrentPageURL();

		
//		boolean result = Admin.is Displayed();
          Assert.assertTrue(result);
//		Assert.assertFalse(false);
		s.assertAll();
		//s.assertEquals(CurrentURL, ExpectedURL);
		logger.pass("Test case is passed");
 }
 
 @Test
 public void VerifyLoginFunctionalityWithIncorrectData()
 {
	 logger = report.createTest("Verify Login Functionality With InCorrect Data");

		login.SendUsername("admin");
		login.SendPassword("4321");
		login.ClickOnLoginButton();
		//Assert.assertNotEquals(CurrentURL, ExpectedURL);
 }
 


@AfterClass
public void afterClass()
{
	driver.quit();
}





}
