package testNG;

import java.awt.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
		

public class Sample {
	public static WebDriver driver;
	public static Robot r;

	@BeforeTest
	public static void b() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		r = new Robot();
		for (int i = 1; i <= 2; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);

	}

	@Test(priority = 1)
	public static void c() throws Exception {
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("9515599998");
		driver.findElement(By.name("password")).sendKeys("darling143");
		driver.findElement(By.id("signInSubmit")).click();
	}

	@Test(priority = 2)
	public static void d() throws Exception {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple headphones" , Keys.ENTER);
		Thread.sleep(3000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.id("nav-search-submit-text")).click();
	}

	@AfterTest
	public static void f() {
		//driver.quit();

	}
}
