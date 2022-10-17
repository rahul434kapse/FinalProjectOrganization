package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;
import utility.DriveUtility;

public class PhonesPage extends Baseclass {
	
	public PhonesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	static WebElement samsung;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	static WebElement addTocart;
	
	@FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
	static WebElement home;
	
	public static boolean phone() throws InterruptedException
	{
		Thread.sleep(15000);
		DriveUtility.click(samsung);
		addTocart.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		home.click();
		return false;
		
	}

}
