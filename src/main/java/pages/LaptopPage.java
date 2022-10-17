package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

import utility.DriveUtility;

        
public class LaptopPage {
	static WebDriver driver;
	public LaptopPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[3]")
	static WebElement laptop;
	
	@FindBy(xpath="//a[normalize-space()='Dell i7 8gb']")
	static WebElement laptopdell;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	static WebElement addTocart;
	
	@FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
	static WebElement home;
	
	@FindBy(xpath="//a[text()='MacBook Pro']")
	static WebElement macbook;
	
	public static boolean phone() throws InterruptedException
	{
		Thread.sleep(15000);
		DriveUtility.click(laptop);
		DriveUtility.click(laptopdell);
		addTocart.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		home.click();
		Thread.sleep(3000);
		DriveUtility.click(laptop);
		DriveUtility.click(macbook);
		
		addTocart.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		return false;
		
	}

	
}
