package selenium.interview.coding.challenge;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHorizontalAndVerticul {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagasesha%20Reddy/Desktop/ScrollHorizontalAndVerticual.html");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(300, 500)");
		Thread.sleep(5000);
		js.executeScript("scrollTo(-300, -500)");
		

	}

}
