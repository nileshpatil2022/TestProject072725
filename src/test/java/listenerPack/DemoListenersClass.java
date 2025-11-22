package listenerPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(listenerPack.MyListener.class)
public class DemoListenersClass 
{
	WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test(priority=1)
	public void testLogo()
	{
		boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}
	
	@Test(priority=2)
	public void testURL()
	{
		String homePageURL=driver.getCurrentUrl();
		Assert.assertEquals(homePageURL, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=3,dependsOnMethods= {"testLogo"})
	public void testTitle()
	{
	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
