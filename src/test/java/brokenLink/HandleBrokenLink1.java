package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLink1 {

	public static void main(String[] args) throws IOException 
	{
		
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int count=0;
		
		try
		{
		
		for(WebElement linkElement:links)
		{
			String linkAttributeValue=linkElement.getAttribute("href");
			
			if(linkAttributeValue==null || linkAttributeValue.isEmpty())
			{
				System.out.println("href value is empty or null. so not able to validate");
				continue;
			}
			
			
			@SuppressWarnings("deprecation")
			URL urlLink=new URL(linkAttributeValue);  //converted href value string to URL format
			
			HttpURLConnection  connection=   (HttpURLConnection) urlLink.openConnection(); //open connection to server
			
			connection.connect(); //connect to server and sent request to server
			
			if(connection.getResponseCode()>=400)
			{
				System.out.println(linkAttributeValue +" : Broken link");
				count++;
			}
			else
			{
				System.out.println(linkAttributeValue +" : Not a Broken link");
			}
			
			
			
		}
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println("Total Broken links: "+ count);
		
		


	}

}
