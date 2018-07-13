package com.webwhatsapptest.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ISuite;
import org.testng.ISuiteListener;
/**
 * @author H Sri Harsha
 * This class implements ITestListener
 */
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.IReport;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Listener implements ITestListener,IReport,ISuiteListener{
  
  protected static ExtentReports reports;
  protected static ExtentTest test;
  
  public void onFinish(ITestContext arg0) {
    reports.endTest(test);
    reports.flush();
    
  }

  public void onStart(ITestContext arg0) {
    System.out.println("Starting...");
    reports = new ExtentReports(new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
    
  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    // TODO Auto-generated method stub
    
  }

  public void onTestFailure(ITestResult result) {
    System.out.println("Testcase failed");    
    test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed");
  }

  public void onTestSkipped(ITestResult result) {
    // TODO Auto-generated method stub
    
  }
  private static String getTestMethodName(ITestResult iTestResult) {
    //return iTestResult.getMethod().getConstructorOrMethod().getName();
    StringBuilder inputArguments = new StringBuilder();

    Object[] inputArgs = iTestResult.getParameters();
    inputArguments.append("( ");
    if (inputArgs != null && inputArgs.length > 0) {
        for (Object inputArg : inputArgs) {
            if (inputArg == null) {
                inputArguments.append("null");
            } else {
                inputArguments.append(inputArg.toString());
            }
            inputArguments.append(", ");
        }
        inputArguments.delete(inputArguments.length() - 2, inputArguments.length() - 1); //removing the last comma
    }
    inputArguments.append(")");

    return inputArguments.toString();
}

  public void onTestStart(ITestResult result) {
    System.out.println("Testcase started");
    test = reports.startTest(getTestMethodName(result));
    test.log(LogStatus.INFO, getTestMethodName(result) + "test is started");
    //System.out.println("Hello... Starting"+getTestMethodName(result));
  }

  public void onTestSuccess(ITestResult result) {
   test.log(LogStatus.PASS, getTestMethodName(result) + "test is passed");
    
    //System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$Name is :"+name);
  }

  public void onFinish(ISuite arg0) {
    // TODO Auto-generated method stub
    
  }

  public void onStart(ISuite arg0) {
    // TODO Auto-generated method stub
    
  }

}
