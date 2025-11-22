package shadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowDom {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		SearchContext shadow=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		
		String a=shadow.findElement(By.cssSelector("#shadow-element")).getText();
		System.out.println(a);
		

	}

}
