package shadowDom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedShadowElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
	SearchContext shadow1=	driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
	
	
	SearchContext shadow2=shadow1.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
	
	
	SearchContext shadow3=shadow2.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
	
	String text=shadow3.findElement(By.cssSelector("#multi-nested-shadow-element")).getText();
	
	System.out.println(text);
	}

}
