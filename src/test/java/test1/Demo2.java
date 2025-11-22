package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 
{
	
	public static void main(String[] args) {
		
		
		
		//WebDriverManager.edgedriver().browserVersion("139").setup();
		
		System.setProperty("webDriver.edge.driver", "C:\\Users\\LENOVO\\Desktop\\Test\\msedgedriver.exe");
		
        WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
	}

}
