package com.selenium.easy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountTextBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		List <WebElement> textbox = driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println(textbox.size());
		int j= 0;
		for (int i = 0; i < textbox.size(); i++) {
			j++;
			System.out.println(textbox.get(i).getAttribute("name")+j);
		}
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		int x = 0;
		for (int i = 0; i < Links.size(); i++) {
			x++;
			System.out.println(Links.get(i).getText()+" "+x);
		}
	}

}
