package Test_Case;

import org.testng.annotations.Test;

import Baselibrary.Baselibrarry;
import pages.Create_repository;

public class Create_repository_test extends Baselibrarry
{
	Create_repository ob = new Create_repository();
	
	@Test(priority = 1, enabled = true)
	public void repository() 
	{
		try 
		{
			
		ob.repository();
			
		}
		
		catch (Exception e)
		
		{
			System.out.println("issue in repository method");
		}
	}
	
}
