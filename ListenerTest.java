package com.bigbasket.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name  = result.getMethod().getMethodName();
		try
		{
			EventFiringWebDriver e = new EventFiringWebDriver(BaseTest.driver);
			java.io.File srcFile = e.getScreenshotAs(OutputType.FILE);
			java.io.File destFile = new File("./screenshots/"+name+".png");
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e)
		{
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
		
	}
	

}
