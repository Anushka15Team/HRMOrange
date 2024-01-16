package pomPackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;



public class LoginPage 
{
WebDriver driver;
	@FindBy(xpath="//input[@name=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;

	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SendUsername(String uname)
	{
		ElementWait.waitForElement("//input[@name=\"username\"]", 20, driver);
		username.sendKeys(uname);
		
	}
	
	public void SendPassword(String pass)
	{
		ElementWait.waitForElement("//button[text()=' Login ']", 20, driver);
		password.sendKeys(pass);
		
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void HandleAlert()
	{
		driver.switchTo().alert();
	}
	
	public boolean FetchCurrentPageURL()
	{
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String url= driver.getCurrentUrl();
		boolean result = ExpectedURL.equals(url);
		return result;
	}
}
