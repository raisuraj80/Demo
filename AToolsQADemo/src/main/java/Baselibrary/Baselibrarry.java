package Baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrarry
{
	public static WebDriver driver = new ChromeDriver();
	public void geturl(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		
	}

}
