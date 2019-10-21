package com.autoit.upload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://imgbb.com/");
		driver.findElement(By.xpath("//*[@id='home-cover-content']/div[2]/a")).click();
		Thread.sleep(15000);
		Runtime.getRuntime().exec("C:\\Users\\Nagasesha Reddy\\Desktop\\photos\\flowers.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("index")).click();
	}

}
