package test;

import org.testng.annotations.BeforeMethod;

import pojo.OpenBrowser;

public class HomePageTest extends BaseTest{
	
	@BeforeMethod
	
	public void openBrowser()
	{
		driver=OpenBrowser.openBrowser("https://www.facebook.com");
	}
	

}
