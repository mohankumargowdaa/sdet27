package com.crm.autodesk.genericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener{
SlackIntegrationTest slack=new SlackIntegrationTest();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
		try {
			slack.sendTestExecutionStatusToSlack(methodName+" is Passed");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		//capture the method name in run time
		
		
		String methodName=result.getMethod().getMethodName();
		try {
			slack.sendTestExecutionStatusToSlack(methodName+" is Failed");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//capture the current date
		String currentDate=new JavaUtility().getSystemDateInFormat();
		
		// Concatenate for screenshot name
		String screenShotName=methodName+currentDate;
		
		//takesceenShot for failed testCase
try {
	new WebDriverUtility().takeScreenShot(BaseClass.sdriver, result);
} catch (Throwable e) {
	// TODO A-uto-generated catch block
	e.printStackTrace();
}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
		try {
			slack.sendTestExecutionStatusToSlack(methodName+" is skipped");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName=result.getMethod().getMethodName();
		try {
			slack.sendTestExecutionStatusToSlack(methodName+" is Failed");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
}
