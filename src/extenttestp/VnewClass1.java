package extenttestp;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import base.UtilitiClass;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class VnewClass1 extends Base {


	ExtentTest test;
	ExtentTest childtest;
	
	@BeforeMethod
	public void initiaztion()
	{
		extent=UtilitiClass.getInstance();
		test=extent.createTest("Test case1");
		
	}
	
	
	
	@Test
	public void method2()
	{
		
		
		ExtentTest childtest;
		
		// initialize the HtmlReporter
		
		
		//test.log(Status.INFO, "Test started");
	
		
		for ( int i=1;i<3;i++){
		
		childtest=test.createNode("Test case2 data"+i);
		
		childtest.log(Status.INFO, "Child ******test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.INFO, "Child test"+i );
		childtest.log(Status.FAIL, "Child test"+i );
		
		
		}
		extent.flush();
		
		
		
		
	}
	
		
	}

