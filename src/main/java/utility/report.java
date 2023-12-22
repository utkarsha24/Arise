package utility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class report {
	public static ExtentReports generateReport()
	{
	ExtentSparkReporter htmlReport=new ExtentSparkReporter("extetsReport.html");
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(htmlReport);
	reports.setSystemInfo("version", "1.10");
	reports.setSystemInfo("created by", "utkarsha");
	reports.setSystemInfo("testing type", "regression");
	return reports;
	
}
}