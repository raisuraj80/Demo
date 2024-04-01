package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AppilcationUtility.ApplicationUtility;
import BaseLibrary.Base_Library;

public class Alerts_Page extends Base_Library
{
	public Alerts_Page()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Alerts, Frame & Windows']")
	private WebElement alertandframe;
	@FindBy(xpath = "//*[text()='Alerts']")
	private WebElement Alert;
	@FindBy(xpath = "(//*[text()='Click me'])[2]")
	private WebElement Clickme2;
	
	public void ClickonAlert_frame()
	{
		try
		{
			Thread.sleep(2000);
			ApplicationUtility.Getscroll_by_Element(alertandframe);
			Thread.sleep(2000);
			alertandframe.click();
			
		} catch (Exception e)
		{
			System.out.println("issue in ClickonAlert_frame"+e);
		}
	}
	public void Click_Alert()
	{
		try
		{
			Alert.click();
		} 
		
		catch (Exception e)
		{
				System.out.println("issue in Click_Alert"+e);
		}
		
	}
	public void Clickme2()
	{
		try
		{
			Clickme2.click();
			WebDriverWait wait=new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
		}
		catch (Exception e)
		
		{
			System.out.println("issue in Clickme2"+e);
		}
	}
}
