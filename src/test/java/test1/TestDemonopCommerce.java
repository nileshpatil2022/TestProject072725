package test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDemonopCommerce {

	public static void main(String[] args) throws InterruptedException 
	{

		

	        //WebDriver driver = new ChromeDriver(options);

       WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	  WebElement username=	driver.findElement(By.xpath("//input[@class='email valid']"));
		username.clear();
		username.sendKeys("admin@yourstore.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@class='password']"));
		password.clear();
		password.sendKeys("admin");
		
		driver.findElement(By.xpath("(//input[@name='RememberMe'])[1]")).clear();
		
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(3000);	
		
		//driver.findElement(By.xpath(""))
		
	}

}
