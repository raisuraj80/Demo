package Screenshotutility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Even;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import BaseLibrary.Base_Library;

public class Screenshotutility extends Base_Library
{
	static String path;
	public static void getscreenshot(String foldername,String filename)
	{
		
		path = System.getProperty("user.dir")+"\\screenshots\\"+foldername+"\\"+filename+".png";
		
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		File srcfile=efw.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(srcfile, new File(path));
		}
		
		catch (Exception e)
		{
			System.out.println("issue in getscreenshot method "+e);
		}
	}
}
