package utility;

import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Baseclass;

public class DriveUtility extends Baseclass {
	
	public static void click(WebElement elem) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(elem));
		elem.click();
	}
	
	public static void sortTableValues(String val) throws ParseException
	{
		NumberFormat f=NumberFormat.getInstance();
		Number n=f.parse(val);
		val=n.toString();
	}

}
