package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportManager implements ITestListener 
{
    public ExtentSparkReporter sparkReporter; //UI of the report (colour and font) 
    public ExtentReports extent; //populate the common info on report
    public ExtentTest test;//creating test case enteries in the reports and update status of the test methods
	public void onTestStart(ITestContext context)
	{
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/OpenCart_Ecommerce_Application/Extent_Reports/MyReport.html"); //specify the location of the folder
		sparkReporter.config().setDocumentTitle("Automation Report");//Title of the report
		sparkReporter.config().setReportName("Functional Testing");//name of the Report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer Name","Localhost");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester name","Pavan");
		extent.setSystemInfo("os","Windows 10");
		extent.setSystemInfo("Browser name","Chrome,Firefox,Edge");
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getName()); //create a new entry in the report
		test.log(Status.PASS,"Test case PASSED is:" + result.getName());//update the status p/f/s
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case FAILED is:" +result.getName());
		test.log(Status.FAIL,"Test case FAILED cause is:" +result.getThrowable());
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case SKIPPED is:"  +result.getName());
	}
	public void onTestFinesh(ITestContext result)
	{
		extent.flush();
	}
	

}
