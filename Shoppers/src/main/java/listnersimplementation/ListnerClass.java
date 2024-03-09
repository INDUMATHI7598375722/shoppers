package listnersimplementation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.BaseClass;

public class ListnerClass implements ISuiteListener, ITestListener {
	
	public static ExtentReports report;
	public static ExtentTest test;
	JavaUtility javaUtility= new JavaUtility();
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		report.endTest(test);
		report.flush();
		Reporter.log(suite.getName() + "has Finished", true);
	}
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		report=new ExtentReports("./AdvancedReports/"+suite.getName()+javaUtility.getSystemDateWithTime()+".html");
		Reporter.log(suite.getName() + "has Started", true);
	}
	public void onTestStart(ITestResult result)
	{
		test=report.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName()+"TestScript started successfully");
		Reporter.log(result.getName()+"is started",true);
	}
	public void onTestSuccess(ITestResult result) {
		
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS,"TestScript passed successfully");
		Reporter.log(result.getName() + "is successfully executed", true);
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.SKIP,"TestScript skipped successfully");
		Reporter.log(result.getName() + "has skipped", true);
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String screenShotPath="./FailedScreenshots/" + result.getName() +javaUtility.getSystemDateWithTime()+".png";
		File path = new File(screenShotPath);
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.log(LogStatus.INFO, test.addScreenCapture("."+screenShotPath));
		test.log(LogStatus.FAIL, result.getName()+"TestScript Failed");
		Reporter.log(result.getName()+"is Failed and Successfully captured screenshot",true);
	}

}
