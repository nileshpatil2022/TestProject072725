package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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
	
	@Test(dataProvider="dp")
	public void loginToOpenCart(String email, String psw)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(psw);
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
	
	
	@DataProvider(name="dp")
	Object [][] loginData()
	{
		Object data [][]= {{"nileshpatil120896@gmail.com", "Test@2025"},
				{"test1233@gmail.com", "test@2323"},
				{"test4424@gmail.com", "test@2022442"},
				{"test12252533@gmail.com", "test@224"}
				
		                   };
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
