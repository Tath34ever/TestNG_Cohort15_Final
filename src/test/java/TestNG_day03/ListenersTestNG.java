package TestNG_day03;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart");

		ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
		ITestListener.super.onTestSuccess(result);
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");

		ITestListener.super.onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart");

		ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
		ITestListener.super.onFinish(context);
	}

	
	
	
	
	
	
	
	
}
