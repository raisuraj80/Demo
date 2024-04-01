package ExcelUtility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility 
{
	public static String Get_Excel_Cell_Data(String path,int rowno,int colno)
	{
		String data = "";
		try 
		{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		data=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		} 
		
		catch (Exception e)
		{
			System.out.println("issue in Get_Excel_Cell_Data"+e);
		}
		return data;
	}
	public static void main(String[] args)
	{
		
	}
	
}
