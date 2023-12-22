package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	

		public static WebDriver chrome(String url) {
			
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
			
			WebDriver driver= new ChromeDriver();
			driver.get(url);//get hit the url
			
			driver.manage().window().maximize();
			return driver;
		}
		
	}
	//"D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"//oldk
	//"D:\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"//new


