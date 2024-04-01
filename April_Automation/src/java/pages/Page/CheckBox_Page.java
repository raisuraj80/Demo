package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AppilcationUtility.ApplicationUtility;
import BaseLibrary.Base_Library;
import PropertyUtility.PropertyUtility;
import junit.framework.Assert;

public class CheckBox_Page extends Base_Library

{
	public CheckBox_Page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[text()='Check Box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"tree-node\"]/div/button[1]")
	private WebElement  checkbox_expand;
	
	@FindBy(xpath = "(//span[@class='rct-checkbox'])[17]")
	private WebElement ExcelCheckbox;
	
	public void clickonCheckBox() 
	{
		try
		{
			Thread.sleep(2000);
			checkbox.click();
			
		}
		catch (Exception e)
		{
			System.out.println("issue in clickonCheckBox "+e);
		}
	}
	
	public void checkbox_expnd() 
	{
		try
		{
			Thread.sleep(2000);
			checkbox_expand.click();
		}
		catch (Exception e)
		{
			System.out.println("issue in checkbox_expnd "+e);
			
		}
	}
	public void Excelclick () 
	{
		try
		{
			Thread.sleep(2000);
			ApplicationUtility.Getscroll_by_Element(ExcelCheckbox);
			ExcelCheckbox.click();
		}
		catch (Exception e)
		{
			System.out.println("issue in Excelclick "+e);
			
		}
	}
	public void Getverify_excelfile()
	{
		try {
			
			String	actualvalue = PropertyUtility.getproperty("Exceldata");
			String expected = driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText();	
			Assert.assertEquals(actualvalue, expected);
		}
		catch (Exception e)
		{
			System.out.println("issue in Getverify_excelfile "+e);
		}
	}

}
