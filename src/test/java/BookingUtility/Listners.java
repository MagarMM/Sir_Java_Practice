package BookingUtility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import bookingBase.Base;

public class Listners extends Base implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Case Start"+result.getName(), true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test Case Success"+result.getName(), true);
		try {
			Utility.takesScreenShot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
