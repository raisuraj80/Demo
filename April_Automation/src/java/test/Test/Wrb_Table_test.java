package Test;

import org.testng.annotations.Test;

import BaseLibrary.Base_Library;
import Page.Web_Table_Page;

public class Wrb_Table_test extends Base_Library

{
	Web_Table_Page ob=new Web_Table_Page();
	
	@Test(priority = 1,enabled = true)
	public void click_element()
	{
		try 
		{
			ob.click_element();
		} catch (Exception e) 
		{
		System.out.println("issue in click_element"+e);
		}
	}
	
	@Test(priority = 2,enabled = true)
	public void Click_web_table()
	{
		try 
		{
			ob.Click_web_table();
		} catch (Exception e) 
		{
		System.out.println("issue in Click_web_table method"+e);
		}
	}
	
	@Test(priority = 3,enabled = true)
	public void fildata()
	{
		try 
		{
			ob.fildata();
		} catch (Exception e) 
		{
		System.out.println("issue in fildata"+e);
		}
	}
}
