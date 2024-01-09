package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassNo1 {
	
@Test
public void abc()
{
	System.out.println("This Is abc from class 1");
}

@BeforeTest
public void m()
{
	System.out.println("This Is Before Test method");
}


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
}
