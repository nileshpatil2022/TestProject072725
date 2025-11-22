//package dataProvider;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import pageObjects.HomePage;
//import pageObjects.LoginPage;
//import pageObjects.MyAccountPage;
//import utilities.DataProviders;
//
//public class TC003_VerifyDDT extends BaseClass
//{
//	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)// getting data provider from different class
//	public void verify_loginDDT(String email, String pwd, String exp) throws InterruptedException
//	{
//		logger.info("***** stating TC_003_LoginDDT ******");
//		
//		try
//		{
//		//HomePage
//		HomePage hp=new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clickOnLoginLink();
//		
//		//Login
//		LoginPage lp=new LoginPage(driver);
//		lp.sendEmailId(email);
//		lp.sendPasswordId(pwd);
//		lp.clickLoginBtn();
//			
//		//MyAccount
//		MyAccountPage macc=new MyAccountPage(driver);
//		boolean targetPage=macc.isMyAccountExist();
//		
//		
//		if(exp.equalsIgnoreCase("Valid"))
//		{
//			if(targetPage==true)
//			{			
//				macc.clickOnLogOutLink();
//				Assert.assertTrue(true);
//				
//			}
//			else
//			{
//				Assert.assertTrue(false);
//			}
//		}
//		
//		if(exp.equalsIgnoreCase("Invalid"))
//		{
//			if(targetPage==true)
//			{
//				macc.clickOnLogOutLink();
//				Assert.assertTrue(false);
//				
//			}
//			else
//			{
//				Assert.assertTrue(true);
//			}
//		}
//		
//		}catch(Exception e)
//		{
//			Assert.fail();
//		}
//		Thread.sleep(3000);
//		logger.info("***** Finished TC_003_LoginDDT ******");
//	}
//}
