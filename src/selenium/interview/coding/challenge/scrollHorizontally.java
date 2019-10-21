package selenium.interview.coding.challenge;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollHorizontally {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagasesha%20Reddy/Desktop/A.html");
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scrollBy(500, 0)");
		Thread.sleep(5000);
		js.executeScript("scrollTo(-500,0)");
	}
}
