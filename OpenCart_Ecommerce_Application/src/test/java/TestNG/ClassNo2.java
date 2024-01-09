package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassNo2 {
	@Test
	public void xyz()
	{
		System.out.println("This Is xyz from class 2");
	}
	
   @AfterTest
   public void n() {
	   System.out.println("This Is AfterTest Method");
   }
}
