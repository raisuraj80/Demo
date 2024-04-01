package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselibrary.Baselibrarry;

public class Launch_page extends Baselibrarry
{
	public Launch_page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"login_field\"]")
	private WebElement login;
	@FindBy(xpath = "//*[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@id='login']/div[4]/form/div/input[12]")
	private WebElement sign_in;
	public void GetLaunch_url()
	{
		try {
			geturl("https://github.com/login");
			
		} catch (Exception e) 
		{
			System.out.println("issue in GetLaunch_url"+e);
		}
	}
	
	public void Enterdetails()
	{
		try {
			
			login.sendKeys("raisuraj80@gmail.com");
			password.sendKeys("06449523@rai");
			sign_in.click();
		} catch (Exception e)
		{
			System.out.println("issue in Enterdetails Method"+e);
		}
	}
}
