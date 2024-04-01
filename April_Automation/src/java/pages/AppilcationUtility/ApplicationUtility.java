package AppilcationUtility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLibrary.Base_Library;

public class ApplicationUtility extends Base_Library
{
	public static void Getscroll_by_Element(WebElement ele)
	{
			try
			{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
				
			} 
			catch (Exception e) 
			{
				System.out.println("issue in Getscroll_by_Element"+e);
			}
			}
	
	
	public static String GetDataTime()
	{
		String datetime = "";
 
		try 
		{
			DateFormat df=new SimpleDateFormat("ddMMyyyy-hhmmss");
			Date dateobj=new Date();
			datetime=df.format(dateobj);
			
		}
		
		catch (Exception e) 

		{
			
		System.out.println("issue in GetDataTime method "+e);
		}
		return datetime;

	}
	
	}
