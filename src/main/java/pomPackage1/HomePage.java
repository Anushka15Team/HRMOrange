package pomPackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
private WebElement username2;

@FindBy(xpath="(//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")
private WebElement employeeName;

public HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void SendUsername2()
{
username2.sendKeys("Chingi");	
}

public void SendEmployeeName()
{
employeeName.sendKeys("Chinu");
}
}