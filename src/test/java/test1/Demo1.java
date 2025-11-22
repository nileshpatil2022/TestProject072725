package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test12() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(3000);
		
		Alert al=driver.switchTo().alert();
		
		//al.accept();
		al.dismiss();
	}


}
