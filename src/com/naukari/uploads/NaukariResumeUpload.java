package com.naukari.uploads;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariResumeUpload {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("usernameField")).sendKeys("nagasesha999@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("darling143");
		driver.findElement(By.xpath("//*[@id='loginForm']/div[5]/div/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/a")).click();;
		Thread.sleep(5000);
		driver.findElement(By.id("attachCV")).click();
		Runtime.getRuntime().exec("C:\\Users\\Nagasesha Reddy\\Desktop\\resume3+years\\Selenium3+years.exe");
		
		
		//int size = driver.findElements(By.tagName("iframe")).size();
		
			
		
	}

}
