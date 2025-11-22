package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest01
{
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	public void loginToOpenCart()
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("nileshpatil120896@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test@2025");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		boolean value=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		
		if(value== true)
		{
			driver.findElement(By.xpath("//div[@class='list-group']/child::a[text()='Logout']")).click();
			Assert.assertTrue(value);
		}
		
		else
		{
			Assert.fail();
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
