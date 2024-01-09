package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	WebDriver driver;
	
@BeforeClass
@Parameters({"browser","url"})
public void setup(String br,String appurl)  //br is a variable 
{   
	if(br.equals("edge"))
	{
		driver=new EdgeDriver();	
	}
	else if(br.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver=new EdgeDriver();
	driver.get(appurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test(priority=1)	
public void testLogo()
{   try {
	boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status, true);
        }
     catch(Exception e)
       {
	      Assert.fail();
       }
}
	
@Test(priority=2)	
public void testHomePageTitle()
{
Assert.assertEquals(driver.getTitle(), "OrangeHRM","Title is not matched");	
}
@AfterClass
public void closeApp() 
{
	driver.quit();
}
	
	
	
	
	
	
	
	

}
