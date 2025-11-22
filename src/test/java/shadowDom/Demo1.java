package shadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://books-pwakit.appspot.com/");
		
		SearchContext shadow1=driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		
	  	shadow1.findElement(By.cssSelector("input[aria-label='Search Books']")).sendKeys("123456789");
	}

}
