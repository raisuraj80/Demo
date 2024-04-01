package Test;

import org.testng.annotations.Test;

import BaseLibrary.Base_Library;
import Page.Alerts_Page;

public class Alerts_Test extends Base_Library 

{
	Alerts_Page ob = new Alerts_Page();
	
	@Test(priority=1, enabled = true)
	public void ClickonAlert_frame()
	{
		try
		{
			ob.ClickonAlert_frame();
		}
		catch (Exception e)
		
		{
			System.out.println("issue in ClickonAlert_frame Method"+e);
		}
	}
	
		@Test(priority=2,enabled = true)
		public void Click_Alert()
	{
		try
		{
			ob.Click_Alert();
		}
		catch (Exception e)
		
		{
			System.out.println("issue in Click_Alert Method"+e);
		}
	}
		
		@Test(priority=3,enabled = true)
		public void Clickme2()
	  {
			try 
		{
			ob.Clickme2();
		} 
		
		catch (Exception e)
		{
			System.out.println("issue in Clickme2 Method"+e);
		}
	   }
}
