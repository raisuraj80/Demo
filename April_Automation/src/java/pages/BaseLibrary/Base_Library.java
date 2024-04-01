package BaseLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import AppilcationUtility.ApplicationUtility;
import Screenshotutility.Screenshotutility;

public class Base_Library
{
	public static WebDriver driver=new ChromeDriver();
	public void GET_URL(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	}
	
	@AfterMethod
	public void resultanalysis(ITestResult result)
	{
		String datetime=ApplicationUtility.GetDataTime();
		String methodname=result.getMethod().getMethodName();
		if(result.isSuccess())
		{
			Screenshotutility.getscreenshot("pass case", methodname+datetime);
		}
		else if(result.getStatus()==ITestResult.FAILURE)		{
			Screenshotutility.getscreenshot("Fail case", methodname+datetime);
		}
	}
	
	
}
