package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.screenshot;

public class Listener extends BaseTest implements ITestListener{
	

	public void onTestStart(ITestResult result)
	{
		System.out.println("Test Started-: "+result.getName());
	}

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test pass-: "+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test fail-: "+result.getName());
		
		try
		{
			screenshot.clickScreenshot(driver, result.getName());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped-: "+result.getName());
	}
}
