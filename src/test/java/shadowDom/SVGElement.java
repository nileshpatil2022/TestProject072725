package shadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SVGElement 
{
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[5]")).click();
		
		
		
	}

}
