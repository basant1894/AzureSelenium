package listenerInterface;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Test Execution has Started->"+context.getName());		
	}
	
	public void onTestStart(ITestResult result) {
        System.out.println("Test has Started->"+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has Passed->"+result.getName());		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has Failed->"+result.getName());		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has Skipped->"+result.getName());		
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test has Finished->"+context.getName());		
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	
}
