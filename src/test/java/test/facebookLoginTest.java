package test;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.OpenBrowser;
import pom.FacebookLoginPage;
import utility.report;
@Listeners(test.Listener.class)
public class facebookLoginTest extends BaseTest{

	ExtentReports extentreports;
	ExtentTest test;
	@BeforeTest
	public void configureReport()
	{
		extentreports=report.generateReport();
	}
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver=OpenBrowser.openBrowser("https://www.facebook.com/");
	}
	
	@Test(dependsOnMethods = "isfacebooklogoisDisplayed")
	public void createnewaccount()
	{
		test=extentreports.createTest("createnewaccount");
		//explictWait
		FacebookLoginPage flb=new FacebookLoginPage(driver);
		flb.clickoncreateaccount();
		flb.enterFirstName("arise",driver);
	
	}
	
	//Assertion
	@Test
	public void isfacebooklogoisDisplayed()
	{
		test=extentreports.createTest("isfacebooklogoisDisplayed");
		FacebookLoginPage flb=new FacebookLoginPage(driver);
		boolean result=flb.logoisDisplayed();
		
		//Hard Assertion
		//Assert.assertTrue(result);
	//.......
		//soft Assertion
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(result);
		flb.entermailid("u@gmail.com");
		flb.enterpassword("123");
		flb.clickonlogin();
		System.out.print("thanks");
		soft.assertAll();
		
	}
	
	@Test
	public void istitleCorrect()
	{
		test=extentreports.createTest("istitleCorrect");
		FacebookLoginPage flb=new FacebookLoginPage(driver);
		String Expected="Facebook – log in or sign up";
		
		String actual=driver.getTitle();
		
		Assert.assertEquals(actual, Expected);
	}
	
	@AfterMethod
	public void addTestStatus(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, result.getName());
		}
	}
	
	@AfterTest
	public void publishReport()
	{
		extentreports.flush();
	}
}
