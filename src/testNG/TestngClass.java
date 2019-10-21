package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestngClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		String c = driver.getTitle();
		System.out.println(c);
		driver.findElement(By.cssSelector("#login-username")).sendKeys("seshu");
		
	}
}
