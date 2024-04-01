package Page;

import javax.xml.xpath.XPath;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import AppilcationUtility.ApplicationUtility;
import BaseLibrary.Base_Library;
import ExcelUtility.Excel_Utility;


public class Text_Box_Page extends Base_Library
{
	
	String path="D:\\Java programs\\April_Automation\\Data\\AutomationData.xlsx";
	ArrayList <String> actual=new ArrayList<String>();
	SoftAssert softasert = new SoftAssert();
	
 public Text_Box_Page()
 {
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath = "//*[text()='Text Box']")
 private WebElement text_box;
 @FindBy(xpath = "//*[@id='userName']")
 private WebElement name;
 @FindBy(xpath = "//*[@id='userEmail']")
 private WebElement usremail;
 @FindBy(xpath ="//*[@id='currentAddress']")
 private WebElement current_Add;
 @FindBy(xpath ="//*[@id='permanentAddress']" )
 private WebElement permanent_Add;
 @FindBy(xpath = "//*[@id='submit']")
 private WebElement Submit_Btn;
 
	public void Click_on_Textbox() 
	{
		try {
			
			Thread.sleep(2000);
			text_box.click();
		} 
		catch (Exception e) {
			System.out.println("issue in Click_on_Textbox" + e);
		} 
		
	}
	public void fildata_textbox()
	{
		try 
		{
			String Name = Excel_Utility.Get_Excel_Cell_Data(path, 1, 0);
			String email	=	Excel_Utility.Get_Excel_Cell_Data(path, 1, 1);
			String CurrentAdd =	Excel_Utility.Get_Excel_Cell_Data(path, 1, 2);
			String PermenentAdd = Excel_Utility.Get_Excel_Cell_Data(path, 1, 3);
			
			actual.add(Name);
			actual.add(email);
			actual.add(CurrentAdd);
			actual.add(PermenentAdd);
				
			
			name.sendKeys(Name);
			usremail.sendKeys(email);
			current_Add.sendKeys(CurrentAdd);
			permanent_Add.sendKeys(PermenentAdd);
			Submit_Btn.click();
		ApplicationUtility.Getscroll_by_Element(Submit_Btn);
			
		}
			
			catch (Exception e) 
			{
				System.out.println("issue in fildata_textbox"+e);
			}
	}
	public void getdata_textbox( )
	{	
		try 
		{
			List<WebElement> expected =driver.findElements(By.xpath("//*[@id=\"output\"]/div/p"));
			 for(WebElement dd:expected)
			 {
				 for(String dd1:actual)
			{
				String out = dd.getText();
				String[] out1 = out.split(":");
				//System.out.println(out1[1]);
				softasert.assertEquals(dd1, out1[1]);
				actual.remove(dd1);
				break;
				
			 }
				 }
			 softasert.assertAll();
			} 
		catch (Exception e) 
		{
		System.out.println("issue in getdata_textbox"+e);
	}
		
	}
 
 
 
 
}
