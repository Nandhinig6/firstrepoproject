package day3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportmanager implements ITestListener {
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	//public void onTestStart(ITestResult result) {
	 public void onStart(ITestContext context) {
		   sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+ "\\Reports\\myreports.html");
		   sparkreporter.config().setDocumentTitle("Automation report");
		   sparkreporter.config().setReportName("functional testing");
		   sparkreporter.config().setTheme(Theme.DARK);
		   
		   extent = new ExtentReports();
		   extent.attachReporter(sparkreporter);
		   extent.setSystemInfo("Env", "QA");
		   extent.setSystemInfo("browser", "chrome");
		   extent.setSystemInfo("testername", "nandhini");
		   
	 }
	 public void onTestSuccess(ITestResult result)
	 {
		 test=extent.createTest(result.getName());
		 test.log(Status.PASS, "test case pass : " + result.getName());
		   
		  }
	 public void onTestFailure(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.FAIL, "test case FAIL: " + result.getName());
		  }

		  public void onTestSkipped(ITestResult result) {
		    // not implemented
			  test=extent.createTest(result.getName());
				 test.log(Status.SKIP, "test case SKIP : " + result.getName());
		  }
		  public void onFinish(ITestContext context) {
			    // not implemented
			  extent.flush();
			  }
}
