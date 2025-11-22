package listenerPack;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	String repName;
	
	public void onStart(ITestContext context) 
	{
		SimpleDateFormat d1=new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss");
		Date d=new Date();
		String timestamp= d1.format(d);
		repName="Test_Report" + timestamp + ".html";
		
		sparkReporter =new ExtentSparkReporter(".\\reports\\"+repName);
		
		//sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/MyReport1.html");
		
		sparkReporter.config().setDocumentTitle("Automation Testing");
		sparkReporter.config().setReportName("Functional Test");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computer name", "localhost");
		extent.setSystemInfo("environment", "QA");
		extent.setSystemInfo("tester name", "Nilesh Patil");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("browser name", "chrome");

	}

	
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "test case passed is: "+ result.getName());
	   
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "test case failed is: "+result.getName());
		test.log(Status.FAIL, "test case failed due to: " + result.getThrowable());
	
	}

	  public void onTestSkipped(ITestResult result)
      {
		 test= extent.createTest(result.getName());
		 test.log(Status.SKIP, "test case skipped is: "+ result.getName());
	    
	  }
	  
	  public void onFinish(ITestContext context) 
	  {
		  extent.flush();
		  }
	
	
	
	

}
