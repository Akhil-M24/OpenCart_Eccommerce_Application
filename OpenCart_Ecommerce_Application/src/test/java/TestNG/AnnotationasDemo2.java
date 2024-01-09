package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationasDemo2 {
	@BeforeClass
	public void Login()	
	{
		System.out.println("Login.....");
	}
	@Test(priority=1)	
	public void search() 
	{
		System.out.println("search.....");
	}
	@Test(priority=2)	
	public void advanceSearch()
	{
		System.out.println("advanceSearch.....");
	}
	@AfterClass
	public void Logout()
	{
		System.out.println("Logout.....");
	}

}
