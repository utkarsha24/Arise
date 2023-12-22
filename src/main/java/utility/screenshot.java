package utility;

import java.io.IOException;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class screenshot {
		
		public static void clickScreenshot(WebDriver driver, String name)  throws IOException
		{
		
	 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File destination=new File("E:\\eclipse_workspace\\Facebook\\ScreenShots"+name+".jpeg");
	 
	 FileHandler.copy(source, destination);
		
	}

}
