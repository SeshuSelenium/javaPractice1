package selenium.interview.coding.challenge;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollVertical {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagasesha%20Reddy/Desktop/B.html");
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0, 500)");
		Thread.sleep(500);
		js.executeScript("scrollTo(0,-500)");
	}

}
