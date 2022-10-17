package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriveUtility;

public class LoginPage {
	 WebDriver driver;
	
	// DriveUtility ut=new DriveUtility();
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//static WebDriverWait wait=new WebDriverWait(driver,20);
	
	
	@FindBy(id="login2")
	private static WebElement loginbutton;
	
	@FindBy(id="loginusername")
	private static WebElement username;
	
	@FindBy(id="loginpassword")
	private static WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private static WebElement login;
	
	
	
	
	public static boolean login() throws InterruptedException
	{
		
		DriveUtility ut=new DriveUtility();
		loginbutton.click();
		username.sendKeys("sctqaautomation@grr.la");
		password.sendKeys("Spring@123");
		login.click();
		
		
		//samsung.click();
		return true;
		
	}

}
