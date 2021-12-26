package com.qa.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.Base.TestBase;
import com.qa.ExtentReports.ExtentManager;


public class TestListener implements ITestListener
{
	private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    //ScreenShot screenshot=new ScreenShot();
    
@Override
    public synchronized void onStart(ITestContext context)
{
    System.out.println("**********NurtureFarm Test Suite started**************");
}

@Override
public synchronized void onFinish(ITestContext context) 
{
    System.out.println("*********End of NurtureFarm Test Suite****************");
    extent.flush();
}

@Override
public synchronized void onTestStart(ITestResult result) 
{
	
    System.out.println((result.getMethod().getMethodName() + " started"));
    ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
   
    test.set(extentTest);
}

@Override
public synchronized void onTestSuccess(ITestResult result) 
{
    System.out.println((result.getMethod().getMethodName() + " passed"));
    test.get().pass("Test passed");
    
}

@Override
public synchronized void onTestFailure(ITestResult result) 
{
    System.out.println((result.getMethod().getMethodName() + " failed"));
    test.get().fail(result.getThrowable());
    
 
   }


@Override
public synchronized void onTestSkipped(ITestResult result) 
{
    System.out.println((result.getMethod().getMethodName() + " skipped"));
    test.get().skip(result.getThrowable());
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
{
    System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
}

public void captureScreenShot(ITestResult result, String status) {
	  String destDir = "";
	  String passfailMethod = result.getMethod().getRealClass().getSimpleName() + "." + result.getMethod().getMethodName();
	  // To capture screenshot.
	  File scrFile = ((TakesScreenshot)TestBase.driver).getScreenshotAs(OutputType.FILE);
	 
	  DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	  // If status = fail then set folder name "screenshots/Failures"
	  if (status.equalsIgnoreCase("fail")) {
	   destDir = "screenshots/Failures";
	  }
	  // If status = pass then set folder name "screenshots/Success"
	  else if (status.equalsIgnoreCase("pass")) {
	   destDir = "screenshots/Success";
	  }

	  // To create folder to store screenshots
	  new File(destDir).mkdirs();
	  // Set file name with combination of test class name + date time.
	  String destFile = passfailMethod + " - " + dateFormat.format(new Date()) + ".png";

	  try {
	   // Store file at destination folder location
	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	 }
}
