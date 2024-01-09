package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {
@BeforeMethod
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
@AfterMethod
public void Logout()
{
	System.out.println("Logout.....");
}
	
	
	
	
	
}
