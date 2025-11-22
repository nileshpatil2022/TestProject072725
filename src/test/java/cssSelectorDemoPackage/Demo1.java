package cssSelectorDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//tagname is not required in css selector
		//tagname and id
		//driver.findElement(By.cssSelector("input#Wikipedia1_wikipedia-search-input")).sendKeys("test automation");
		
		//tagname and classname
		//driver.findElement(By.cssSelector("input.wikipedia-search-input")).sendKeys("test automation");
		
		//tagname and attribute and value
		
		//driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("test");
		
		//driver.findElement(By.cssSelector("[placeholder='Enter Name']")).sendKeys("1234455");
		
		//tagname.classname[attribute='value']
		
		//driver.findElement(By.cssSelector("input.wikipedia-search-input[type='text']")).sendKeys("automation");

		driver.findElement(By.cssSelector(".form-control[id='textarea']")).sendKeys("maharashtra");
		
		
	}

}
