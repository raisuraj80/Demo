package Test;

import org.testng.annotations.Test;

import BaseLibrary.Base_Library;
import Page.Login_Page_ToolsQA;
import Screenshotutility.Screenshotutility;

public class Login_Page_ToolsQA_Test extends Base_Library
{
	Login_Page_ToolsQA obb = new Login_Page_ToolsQA();
	
	@Test(priority=1,enabled=true)
	public void GetLunch_ToolsQA()
	{
		try {
			obb.GetLunch_ToolsQA();
		} 
		catch (Exception e) 
		{ 
			System.out.println("issue in GetLunch_ToolsQA"+e);
		}
	}
	@Test(priority=2,enabled=true)
	public void Clickon_demosite()
	{
		try {
			obb.Clickon_demosite();
		} catch (Exception e) {
			System.out.println("issue in Clickon_demosite"+e);
		}
	}
	@Test(priority=3,enabled=true)
	public void clickon_Element()
	{
		try 
		{
			obb.clickon_Element();
		}
		catch (Exception e) 
		{
			System.out.println("issue in clickon_Element"+e);
		}
	}
	
}
