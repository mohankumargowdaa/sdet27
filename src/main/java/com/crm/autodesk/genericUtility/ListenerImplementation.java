package com.crm.autodesk.genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		//capture the method name in run time
		String methodName=result.getMethod().getMethodName();
				
		//capture the current date
		String currentDate=new JavaUtility().getSystemDateInFormat();
		
		// Concatenate for screenshot name
		String screenShotName=methodName+currentDate;
		
		//takesceenShot for failed testCase
try {
	new WebDriverUtility().takeScreenShot(BaseClass.sdriver, result);
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
}
