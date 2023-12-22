package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
 public static WebDriver openBrowser(String url)
 {
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//implict wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
 return driver;
 }

}
