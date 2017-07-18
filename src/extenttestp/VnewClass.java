package extenttestp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.UtilitiClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class VnewClass extends Base{
	
	ExtentTest test;
	ExtentTest childtest;
	
	@BeforeMethod
	public void initiaztion()
	{
		extent=UtilitiClass.getInstance();
		test=extent.createTest("Test case1");
		
	}
	
	@Test
	public void method1()
	{
	
	
		
		// initialize the HtmlReporter
		
		
		//test.log(Status.INFO, "Test started");
	
		
		for ( int i=1;i<10;i++){
		
		childtest=test.createNode("Test case1 data :-  "+i);
		
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		
		
		}
		extent.flush();
		
		
		
		
	}
	
	
	
	

}
