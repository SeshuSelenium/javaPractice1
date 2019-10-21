package com.windowHandle.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}

}
