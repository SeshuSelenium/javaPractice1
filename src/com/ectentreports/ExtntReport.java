package com.ectentreports;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtntReport {
	public WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;

	@BeforeTest
	public void startTest() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/STMExtentReport.html", true);
		// logger=extent.startTest("googlr logo test");
		extent.addSystemInfo("Host Name", "SoftwareTestingMaterial").addSystemInfo("Environment", "Automation Testing")
				.addSystemInfo("User Name", "Rajkumar SM");
		// loading the external xml file (i.e., extent-config.xml) which was placed
		// under the base directory
		// You could find the xml file below. Create xml file in your project and copy
		// past the code mentioned below
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
		
		
	}

	@Test (priority = 1)
	public void passTest() throws Exception {
		
		
			System.setProperty("webdriver.chrome.driver",
					"E:\\java selenium\\Selenium_practice\\chromedriver.exe");

			
			  driver = new ChromeDriver();
			  driver.get("https://www.google.com/gmail/");
			Thread.sleep(5000);
		
//extent.startTest("TestCaseName", "Description")
//TestCaseName � Name of the test
//Description � Description of the test
//Starting test
		logger = extent.startTest("passTest");
		//Assert.assertTrue(true);
//To generate the log when the test case is passed
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}

	@Test (priority = 2)
	public void failTest() throws Exception {
		
		driver.findElement(By.id("identifierId")).sendKeys("nagaseshareddy999");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		
		logger = extent.startTest("failTest");
	//	Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	}

	@Test (priority = 3)
	public void skipTest() throws Exception {
		
		driver.findElement(By.name("password")).sendKeys("darling143");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);
		
		logger = extent.startTest("skipTest");
		//throw new SkipException("Skipping - This is not ready for testing ");
	}

	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}
// ending test
//endTest(logger) : It ends the current test and prepares to create HTML report
		extent.endTest(logger);
	}

	@AfterTest
	public void endReport() {
// writing everything to document
//flush() - to write or update test information to your report. 
		extent.flush();
		// Call close() at the very end of your session to clear all resources.
		// If any of your test ended abruptly causing any side-affects (not all logs
		// sent to ExtentReports, information missing), this method will ensure that the
		// test is still appended to the report with a warning message.
		// You should call close() only once, at the very end (in @AfterSuite for
		// example) as it closes the underlying stream.
		// Once this method is called, calling any Extent method will throw an error.
		// close() - To close all the operation
		extent.close();

	}

}
