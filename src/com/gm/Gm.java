package com.gm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gm {
	
	public WebDriverWait wait;
	public WebDriver driver;
	@Parameters("myBrowser")
	@BeforeTest
	public  void main(String myBrowser) {
		
		if(myBrowser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		driver = new FirefoxDriver();
		}else if(myBrowser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\java selenium\\Selenium_practice\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
	}
		@Test
		public void test1() {
		driver.findElement(By.id("identifierId")).sendKeys("nagasesha999");
		driver.findElement(By.id("identifierNext")).click();
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))); 
		driver.findElement(By.name("password")).sendKeys("darling143");
		driver.findElement(By.id("passwordNext")).click();

	}
		@AfterTest
		public void post() {
			driver.close();
		}
}
