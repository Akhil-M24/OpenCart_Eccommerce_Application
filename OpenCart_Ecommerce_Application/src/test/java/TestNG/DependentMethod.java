package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentMethod {
	
	@Test(priority=1)
	public void openapp() 
	{
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=2,dependsOnMethods= {"openapp"})
	public void login() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods= {"login"})
	public void search() 
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods= {"search","login"})
	public void advancesearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods= {"login"})
	public void logout() 
	{
		Assert.assertTrue(true);	
	}

}
