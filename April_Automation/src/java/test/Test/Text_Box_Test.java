package Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import BaseLibrary.Base_Library;
import Page.Text_Box_Page;

public class Text_Box_Test extends Base_Library
{
	Text_Box_Page obs = new Text_Box_Page();
	
	@Test(priority=1,enabled=true)
	public void Click_on_Textbox()
	{
		try
		{
			obs.Click_on_Textbox();
		}
		catch (Exception e) 
		{
		System.out.println("issue in Click_on_Textbox"+e);
		}
	}
	
	@Test(priority=2,enabled=true)
	public void fildata_textbox()
	{
		try 
		{
			obs.fildata_textbox();
		}
		
		catch (Exception e) 
		{
			System.out.println("issue in fildata_textbox");
		}
	}	
	
	@Test(priority=3,enabled=true)

	public void getdata_textbox()
	{
		try {
			
			obs.getdata_textbox();
		}
		
		catch (Exception e) 
		{
			System.out.println("issue in getdata_textbox"+e);
		}
	}
}
