package pom;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage {
	
		@FindBy (xpath = "//input[@id='email']")private WebElement email;
		@FindBy (xpath = "//input[@id='pass']")private WebElement pass;
		@FindBy (xpath = "//button[text()='Log in']")private WebElement loginbutton;
		@FindBy (xpath = "//a[text()='Forgotten password?']")private WebElement Forgotten_password;
		@FindBy (xpath = "//a[text()='Create new account']")private WebElement createAccount;
		@FindBy (xpath = "//a[text()='Create a Page']")private WebElement createPage;
		@FindBy (xpath = "//input[@name='firstname']")private WebElement firstname;
		
	@FindBy (xpath = "//img[@class='fb_logo _8ilh img']")private WebElement logo;
	
		
		public FacebookLoginPage(WebDriver driver)
	
		{
		   PageFactory.initElements(driver, this);
		}
		
	public void entermailid(String mailid) 
		{	
		   email.sendKeys(mailid);
		}
		
	public void enterpassword(String pass1) 
		{
		    pass.sendKeys(pass1);
		}
		
	public void clickonlogin() 
		{
		loginbutton.click();
		
		}
		
	public void clickonforgetpass() {
			
		Forgotten_password.click();
		}
	public void clickoncreateaccount() {
			
		createAccount.click();
		}
		
    public void clickoncreatePage() {
			
	    createPage.click();
	   
	    }
    //Explict wait
    public void enterFirstName(String name,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(5));
		//wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(firstname));
    	
    	
    	//fluentWait
    /*	FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver);
    	wait.withTimeout(Duration.ofMillis(5000));
    	wait.pollingEvery(Duration.ofMillis(200));
    	wait.ignoring(NoSuchElementException.class);
    	wait.until(ExpectedConditions.visibilityOf(firstname));*/
		
	    firstname.sendKeys(name);
	   
	    }
//Assertion
    public boolean logoisDisplayed()
    {
    	return logo.isDisplayed();
    }
    
    
		
}
