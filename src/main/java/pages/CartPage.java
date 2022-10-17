package pages;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriveUtility;

public class CartPage {
	static WebDriver driver;
	
	
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Cart']")
	static WebElement cartlink;
	
	
	
	public static boolean cart() throws InterruptedException, ParseException
	{
		double max=0;
		int max1=0;
		
		Thread.sleep(5000);
		DriveUtility.click(cartlink);
		//*[@id="tbodyid"]/tr[1]/td[3]
		
//		ArrayList arr1=new ArrayList();
//		for (int i = 1; i < 4; i++) {
//			String value=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr["+i+"]/td[3]")).getText();
//			arr1.add(value);
//		}
//		Collections.sort(arr1);
//		System.out.println(arr1);
		
		
		ArrayList<Integer>arr=new ArrayList<Integer>();
		//int ar[]=new int [5];
		int first=0;
		for (int i = 1; i < 4; i++) {
			String value=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr["+i+"]/td[3]")).getText();
			System.out.println(value);
			NumberFormat f=NumberFormat.getInstance();
			Number n=f.parse(value);
			value=n.toString();
			//max=Double.parseDouble(value);
			max1=Integer.parseInt(value);
			arr.add(max1);
			
		}
		Collections.sort(arr);
		System.out.println("Sorting values in array  are:"+arr.toString());
		
		for (int i = 0; i < arr.size(); i++) 
		{
			first= arr.get(i)+first;
		}
		System.out.println("Addition of all elements price are:="+first);
//		for (int i = 0; i < arr.size(); i++) {
//			first=arr.get(i)+first;
//			for (int j = i+1; j < arr.size(); j++) 
//			{
//				if(arr.get(i)>arr.get(j))
//				{
//					first=arr.get(i);
//				}
//				
//			}
//			
//		}
		return false;
		
	}
}
