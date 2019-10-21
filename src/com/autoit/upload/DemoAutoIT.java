package com.autoit.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutoIT {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nagasesha%20Reddy/Desktop/fileuploads.html");
		
		
		driver.findElement(By.xpath("//*[@id='1']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Nagasesha Reddy\\Desktop\\autoit\\fileUpload.exe");

	}

}
