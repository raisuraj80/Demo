package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.Base_Library;
import ExcelUtility.Excel_Utility;

public class Web_Table_Page extends Base_Library

{
	String path="D:\\Java programs\\April_Automation\\Data\\automation22.xlsx";
	public Web_Table_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Elements']")
	private WebElement element;
	@FindBy(xpath = "//*[text()='Web Tables']")
	private WebElement WebTable;
	@FindBy(xpath = "//*[@id=\"addNewRecordButton\"]")
	private WebElement Add_btn;
	@FindBy(xpath = "//*[@id='firstName']")
	private WebElement first_name;
	@FindBy(xpath = "//*[@id='lastName']")
	private WebElement last_name;
	@FindBy(xpath = "//*[@id='userEmail']")
	private WebElement email;
	@FindBy(xpath = "//*[@id='age']")
	private WebElement age;
	@FindBy(xpath = "//*[@id='salary']")
	private WebElement salary;
	@FindBy(xpath = "//*[@id='department']")
	private WebElement deprtmnt;
	@FindBy(xpath = "//*[@id=\"submit\"]")
	private WebElement submitbtn;
	
	public void click_element()
	{
		try 
		{
			element.click();
		} 
		
		catch (Exception e) 
		{
		System.out.println("issue in click_element method"+e);
		}
	}
	public void Click_web_table()
	{
		try {
			
			WebTable.click();
			}
			
		 catch (Exception e) 
		{
			System.out.println("issue in Click_web_table"+e);
		}
}
	public void fildata() 
	{
		try {
			
			Add_btn.click();
			for(int i =0;i<=5;i++)
			{
					
			first_name.sendKeys(Excel_Utility.Get_Excel_Cell_Data(path,i,0));
			last_name.sendKeys(Excel_Utility.Get_Excel_Cell_Data(path, i, 1));
			email.sendKeys(Excel_Utility.Get_Excel_Cell_Data(path, i, 2));
			age.sendKeys(Excel_Utility.Get_Excel_Cell_Data(path, i, 3));
			salary.sendKeys(Excel_Utility.Get_Excel_Cell_Data(path,i, 4));
			deprtmnt.sendKeys(Excel_Utility.Get_Excel_Cell_Data(path,i, 5));
			submitbtn.click();
			break;
			}
		}
		catch (Exception e)
		{
				System.out.println("issue in fildata"+e);
		}
	}
	}

