package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotaions {
	@BeforeSuite
	public void bs()
	{
		System.out.println("******This Is Before Suite Method*****");	
	}
	@AfterSuite
	public void as()
	{
		System.out.println("*******This Is After Suite Method*****");
	}
	@BeforeTest
	public void m()
	{
		System.out.println("This Is Before Test method");
	}
	@AfterTest
	public void n() 
	{
		   System.out.println("This Is AfterTest Method");
	}
	@BeforeClass
	public void bc()
	{
		 System.out.println("This Is BeforeClass method");
	}
	@AfterClass
	public void ac() 
	{
		 System.out.println("This Is AfterClass Method");
	}
	@BeforeMethod
	public void Login()	
	{
		System.out.println("This is Before method");
	}
	@AfterMethod
	public void Logout()
	{
		System.out.println("This is After Method");
	}
	@Test(priority=2)
	public void tm2()
	{
		System.out.println("ths is method no 2");
	}
	@Test(priority=1)
	public void tm1()
	{
		System.out.println("This is method no 1");
	}		

}
