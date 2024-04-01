package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrarry;

public class Create_repository extends Baselibrarry

{
	String path = "D:\\Java programs\\AToolsQADemo\\GitHub.xlsx";
	public Create_repository () 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='repos-container']/div/a[1]")
	private WebElement Create_Rep;
	@FindBy(xpath = "//*[@id='repository_name']")
	private WebElement User_name;
	@FindBy(xpath = "//*[@id='new_repository']/div[4]/button")
	private WebElement Creat_repo;
	@FindBy(xpath = "//*[@id=\"js-repo-pjax-container\"]/div[1]/nav/ul/li[2]/a/span[1]")
	private WebElement issue;
	
	
	
	
	
	public void repository() 
	{
		try 
		{
			Create_Rep.click();
			
		}
		
		catch (Exception e)
		
		{
			System.out.println("issue in repository method");
		}
	}

	
}
