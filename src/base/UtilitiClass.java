package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class UtilitiClass {
	
	public static ExtentReports rep=null;
	
public static ExtentReports getInstance()
	{
		
		if (rep==null){
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Workspace3\\BestbuyDDFramework\\Report31\\extent36.html");
		rep= new ExtentReports();
		rep.attachReporter(htmlReporter);
		
		
		}
		
		return rep;
		
		
		
		
		
	}

}
