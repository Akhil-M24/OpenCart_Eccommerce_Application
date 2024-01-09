package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver=new EdgeDriver();
	
	}
	
	@Test(dataProvider="logindataprovider")
	public void testlogin(String email,String pwd)
	{
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Login']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@id='input-email']"));
		ele.clear();
		ele.sendKeys(email);
		WebElement ele1=driver.findElement(By.xpath("//input[@id='input-password']"));
		ele1.clear();
		ele1.sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		String exp_title="My Account";
		String act_title=driver.findElement(By.xpath("//a[text()='Edit Account']")).getText();
		
		Assert.assertEquals(exp_title,act_title);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="logindataprovider",indices= {0,2})
	public String[][] loginData()
	{
		String data[][]= {
				          {"abc@gmail.com","test123"},
				          {"pavan01@gmail.com","test@123"},
				          {"km7720226@gmail.com","ABCg55@MB"}
		};
		return data;
    }
	}
