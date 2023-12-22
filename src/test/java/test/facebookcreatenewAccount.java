package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookcreatenewAccount {
	
	public static void main(String args[]) throws InterruptedException
	{
		//public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = LaunchBrowser.chrome("https://www.facebook.com");
			WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			create.click();
			Thread.sleep(3000);

			WebElement fName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
			fName.sendKeys("Nikita");

			WebElement surName = driver.findElement(By.xpath("//input[@name='lastname']"));
			surName.sendKeys("Patil");

			WebElement moNum = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
			moNum.sendKeys("8484982590");

			WebElement pass= driver.findElement(By.xpath("//input[@data-type='password']"));
			pass.sendKeys("1234");
			Thread.sleep(2000);

			WebElement dob = driver.findElement(By.xpath("//select[@title='Day']"));
			dob.click();
			WebElement date = driver.findElement(By.xpath("//option[@value='26']"));
			Select a = new Select(dob);
			a.selectByValue("26");
			Thread.sleep(2000);

			WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
			month.click();
			WebElement mon = driver.findElement(By.xpath("//option[text()='Aug']"));
			Select b = new Select(month);
			b.selectByVisibleText("Aug");
			Thread.sleep(2000);

			WebElement years = driver.findElement(By.xpath("//select[@title='Year']"));
			years.click();
			WebElement year = driver.findElement(By.xpath("//option[text()='2001']"));
			Select c = new Select(years);
			c.selectByVisibleText("2001");
			Thread.sleep(2000);

			WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
			gender.click();

		//	Secreenshort.ClickScreenshot(driver, "nikitaa");

	}

			}
