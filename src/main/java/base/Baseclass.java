package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.property.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	
	public static String readProperty(String key) 
	{
		Properties prop=new Properties();
		try
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\Rahul\\HOS_Maven\\FinalProject\\src\\main\\resources\\properties.properties");
		prop.load(fis);
		}
		catch(Exception e)
		{
			
		}
		return prop.getProperty(key);
	}
	
	public static void initialization()
	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(readProperty("url"));
	}
	
	public static void launchApp()
	{
		if(readProperty("browser").equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			initialization();
		}
		else
		{
			System.out.println("user not to want a chrome browser");
		}
		
	}

}
