package Test_Case;



import org.testng.annotations.Test;

import Baselibrary.Baselibrarry;
import pages.Launch_page;



public class Launch_page_test extends Baselibrarry
{
	
	Launch_page ob = new Launch_page();
	@Test(priority = 1,enabled = true)
	public void GetLaunch_url()
	{
		try 
		{
			ob.GetLaunch_url();
			
		} catch (Exception e) 
		{
		System.out.println("issue in GetLaunch_url method"+e);
		}
	}
	
	@Test(priority = 2,enabled = true)
	public void Enterdetails()
	{
		try 
		{
			ob.Enterdetails();
			
		} catch (Exception e) 
		{
		System.out.println("issue in Enterdetails method"+e);
		}
	}
}
