package actoins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) {
		
		WebDriver driver;
		Actions action;
		
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		driver =new ChromeDriver();
		action = new Actions(driver);
		driver.get("https:\\www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		
	}

}
