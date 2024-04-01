package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppilcationUtility.ApplicationUtility;
import BaseLibrary.Base_Library;
import Screenshotutility.Screenshotutility;

public class Login_Page_ToolsQA extends Base_Library

{
	public Login_Page_ToolsQA()
	{
		PageFactory.initElements(driver, this);	
		
	} 
	@FindBy(xpath = "//*[@id=\"primary-menu\"]/li[6]/a/span/span")
	private WebElement demosite;
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")
	private WebElement Element;
	public void GetLunch_ToolsQA()
	{
		try
		{
			GET_URL("https://www.toolsqa.com");
			
		}
		
		catch (Exception e)
		{
			System.out.println("issue is GetLunch_ToolsQA "+e);
		}
	}
	public void Clickon_demosite()
	{
		try
		   {
			demosite.click();
			} 
		catch (Exception e)
		{
				System.out.println("issue in Clickon_demosite "+ e);	
		}
	}
	public void clickon_Element()
	{
		try
		{
			ApplicationUtility.Getscroll_by_Element(Element);
			Thread.sleep(2000);
			Element.click();
		} 
		
		catch (Exception e) 
		{
			System.out.println("issue in clickon_Element "+ e);
			
		}
		
	}
	}
