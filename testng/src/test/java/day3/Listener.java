package day3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	public void onTestStart(ITestResult result) {
		
		System.out.println("test started");
	  
	  }

	  
	public void onTestSuccess(ITestResult result) {
		System.out.println("test success");
	    // not implemented
	  }

	  
	public void onTestFailure(ITestResult result) {
		System.out.println("test fail");
	    // not implemented
	  }

	  
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skip");
	    // not implemented
	  }

	  
	  
	public void onStart(ITestContext context) {
		System.out.println("test onstarted");
	    // not implemented
	  }

	public void onFinish(ITestContext context) {
		
		System.out.println("test finished");
	    // not implemented
	  }
	

}
