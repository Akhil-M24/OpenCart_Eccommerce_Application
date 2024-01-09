package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test is Started.......");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test is passed.......");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test is failed.......");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test is skipped.......");
	}
	public void onTestFinesh(ITestContext result)
	{
		System.out.println("Test is finesh.......");
	}

}
