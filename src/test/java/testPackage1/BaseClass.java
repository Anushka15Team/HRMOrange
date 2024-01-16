package testPackage1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.Screenshot;
import testUtility.StaticBrowser;

public class BaseClass 
{
	static public ExtentReports report;
	static public ExtentHtmlReporter extent;
	public static ExtentTest logger;
	static WebDriver driver;
	@Parameters({"browser"})
	
	@BeforeTest
public void beforeTest(String browser)
{
		report= new ExtentReports();
		extent = new ExtentHtmlReporter("test-output"+File.separator+"Report"+File.separator+"HrmThread"+System.currentTimeMillis()+".html");
		report.attachReporter(extent);
		
		
WebDriver driver= StaticBrowser.openBrowser("edge", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
this.driver= driver;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	@AfterMethod
	
	public void aftermethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path = Screenshot.capturePageScreenshot(driver);
		logger.fail("Test case is Failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		}
		report.flush();
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
}
