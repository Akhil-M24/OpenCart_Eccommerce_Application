package TestNG;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNG.ExtendReportManager.class)
public class NopCommerceTests_For_Extends_Reports {
	
	WebDriver driver;
	
@BeforeClass
public void setup()  //br is a variable 
{   
	driver=new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
