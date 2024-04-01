package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseLibrary.Base_Library;
import Page.CheckBox_Page;
import PropertyUtility.PropertyUtility;
import junit.framework.Assert;


public class CheckBox_Test extends Base_Library
{
	CheckBox_Page ob = new CheckBox_Page();
	
	@Test(priority=1, enabled=true)
	public void clickonCheckBox()
	{
		
		try
	{
		ob.clickonCheckBox();
	} 
	
		catch (Exception e)
	{
		System.out.println("issue in clickonCheckBox"+e);
	}
		
	}
	@Test(priority=2,enabled=true)
	public void checkbox_expnd()
	{
		try {
			ob.checkbox_expnd();
		} 
		catch (Exception e) 
		{
			
			System.out.println("issue in checkbox_expnd"+e);
		}
	}
	@Test(priority=3,enabled=true)
	public void Excelclick()
	{
		try 
		{
			ob.Excelclick();
		} 
		catch (Exception e)
		{
			System.out.println("issue in Excelclick"+e);
		}
	}
	@Test(priority=4,enabled=true)
	public void Getverify_excelfile()
	{
		try 
		{
			ob.Getverify_excelfile();
		} 
		
		catch (Exception e)
		{
			System.out.println("issue in Getverify_excelfile"+e);
		}
	}
	
	
	
}
