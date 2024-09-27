package com.DataDrivenFramework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends LoginBase implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FailedTest");
		//failed();
		failed(result.getMethod().getMethodName());
		}
	
	
	
	
}
