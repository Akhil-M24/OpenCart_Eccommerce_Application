package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Vs_Soft_Assertions {
	//@Test
	public void test()
	{
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		
		Assert.assertEquals(1, 2); //if it will fail rest of the statements will not even get executed
		
		System.out.println("HardAssertion is completed.....");
		
		Assert.assertEquals(1,1); //valid condition but due to the (1,2) failure it will not get executed
	}
	
	@Test
	public void softAssertions()
	{

		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		System.out.println("testing......");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);//failed
		
		System.out.println("softAssertion is completed.....");
		
		sa.assertEquals(1, 1);
		sa.assertAll();  //manadatory this is 1 time have to use 
		
	}

}
