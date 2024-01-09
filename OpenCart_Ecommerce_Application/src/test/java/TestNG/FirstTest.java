package TestNG;

import org.testng.annotations.Test;

public class FirstTest {
		//prioroty will be -1 also will not skipped, it will get execute 
	    //if we not provide priority then also in alphabetical order test case will get executed
	    @Test(priority=1)
		public void test1()
		{
			System.out.println("testing 1");
			System.out.println("testing St");
		}	    
		@Test(priority=2)
		public void test2() 
		{
			System.out.println("testing 2");
		}
		
		@Test(priority=3)
		public void test3() 
		{
			System.out.println("testing 3");
		}

}
