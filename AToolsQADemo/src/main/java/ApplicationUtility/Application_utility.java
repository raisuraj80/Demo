package ApplicationUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import Baselibrary.Baselibrarry;

public class Application_utility extends Baselibrarry

{
	public static void getscroll_by_element(WebElement ele)
	{
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
		} 
		
		catch (Exception e)
		{
			System.out.println("issue in getscroll_by_element method"+e);
		}
	}

}
