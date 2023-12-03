package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




public class MyListener  implements ITestListener{
	
	
	ExtentReports e;
	ExtentTest t;
	Screenshots s;
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Pass");
		try
		{
		t.log(LogStatus.PASS, "Screenshot "+t.addScreenCapture(s.takescreenshots()));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed");
		
	}
		
	public void onStart(ITestContext context) {
		s= new Screenshots();
		System.out.println("TestNG Started");
		e=new ExtentReports("test-output\\MyReports.html");
		e.startTest("LoginTest has started");
		e.addSystemInfo("Browser","Chrome");
		
	}
	public void onFinish(ITestContext context) {
		System.out.println("TestNG finished");
		e.endTest(t);
		e.flush();
	}
		
	}

