package com.facebook.validation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Gmail {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/gmail/");
		
		String userName = "nagasesha999";
		if(userName.length() >= 5 && userName.length() <= 20) {
		driver.findElement(By.id("identifierId")).sendKeys(userName);
		}else {
			System.out.println("your user-name shouid be between 5 to 20 charecters");
		}
		
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		
		String userPass = "darling143";
		
		if (userPass.length() >= 5 && userPass.length() <= 15) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		//driver.findElement(By.xpath("//*[text()='Enter your password']")).sendKeys(userPass);
		element.sendKeys(userPass);
		}else {
			System.out.println("your password should be between 5 to 15 charecters");
		}
		driver.findElement(By.id("passwordNext")).click();
		
		
		String button = driver.findElement(By.id(":jr")).getText();
		System.out.println(button);
		String expected = "Compose";
		Assert.assertEquals(expected, button);
		if (button.equalsIgnoreCase(expected)) {
			System.out.println("actual and expected is matched");
		}else {
			System.out.println("actual and expected is not  matched");
			
		}
		
		driver.findElement(By.id(":jr")).click();
		
		driver.findElement(By.name("to")).sendKeys("nagasesha998@gmail.com");
		
		driver.findElement(By.name("subjectbox")).sendKeys("Hai seshu reddy");
		
		driver.findElement(By.xpath("//*[@id=':qf']")).sendKeys("how are you?");
		
	//	driver.findElement(by.)
	}
	 

}
