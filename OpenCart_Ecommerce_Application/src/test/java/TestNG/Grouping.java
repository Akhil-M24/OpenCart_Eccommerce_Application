package TestNG;

import org.testng.annotations.Test;

/*
 * LoginByEmail           sanity and Regression
 * LoginByFaceBook        sanity
 * LoginByTwitter         sanity
 * 
 * signupByemail          sanity and regression
 * signupByfacebook       regression
 * signupBytwitter        regression
 * 
 * paymentinrupees        sanity and regression
 * paymentindoller        sanity
 * paymentreturnByBank    regression
 * 
 * 
 */
public class Grouping {
	@Test(priority=1,groups= {"sanity","regression"})
	public void LoginByEmail()
	{
		System.out.println("This is LoginByEmail method");
	}
	
	@Test(priority=2,groups= {"sanity"})
	public void LoginByFaceBook()
	{
		System.out.println("This is LoginByfacebook method");
	}
	
	@Test(priority=3,groups= {"sanity"})
	public void LoginByTwitter()
	{
		System.out.println("This is LoginByTwitter method");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	public void signupByemail() 
	{
		System.out.println("This is signupByemail method");
	}
	
	@Test(priority=5,groups= {"regression"})
	public void signupByfacebook() 
	{
		System.out.println("This is signupByfacebook method");
	}
	@Test(priority=6,groups= {"regression"})
	public void signupBytwitter() 
	{
		System.out.println("This is signupBytwitter method");
	}
	@Test(priority=7,groups= {"sanity","regression"})
	public void  paymentinrupees()
	{
		System.out.println("This is paymentinrupees method");
	}
	@Test(priority=8,groups= {"sanity"})
	public void paymentindoller()
	{
		System.out.println("This is paymentindoller method");
	}
	@Test(priority=9,groups= {"regression"})
	public void paymentreturnByBank()
	{
		System.out.println("This is paymentreturnByBank method");
	}

}
