package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestNG {
	public WebDriver driver;

	@BeforeTest
	public void precondition() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\java selenium\\Selenium_practice\\chromedriver.exe");

		
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com/gmail/");
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void testcases2() throws Exception {
		driver.findElement(By.id("identifierId")).sendKeys("nagaseshareddy999");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void testcase1() throws Exception {
		driver.findElement(By.name("password")).sendKeys("darling143");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void screenshot() {
		String title = driver.getTitle();
		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotfile, new File("E:\\java selenium\\Selenium_practice\\Screenshot\\title.png"));
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
