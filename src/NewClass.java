import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentXReporter;



public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports extent=null;
		ExtentTest test;
		ExtentTest childtest;
		
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Workspace3\\BestbuyDDFramework\\Report31\\extent2.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		test=extent.createTest("Test case1");
		//test.log(Status.INFO, "Test started");
	
		
		for ( int i=1;i<3;i++){
		
		childtest=test.createNode("Runng the data"+i);
		
		childtest.log(Status.INFO, "Child test"+i );
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
