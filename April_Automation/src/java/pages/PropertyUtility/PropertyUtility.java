package PropertyUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility 
{
		static String path="D:\\Java programs\\April_Automation\\TestData\\ToolsQa.properties";
		public static String getproperty(String key)
	{
		String value="";
		Properties prop=new Properties();
		try
		{
			FileInputStream fis=new FileInputStream(path);
			prop.load(fis);
			value=prop.getProperty(key);
		} 
		catch (Exception e) {
			System.out.println("issue in getproperty "+e);

		}
		return value;
	}
}
