package selenium.interview.coding.challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nagasesha%20Reddy/Desktop/ScrollHorizontalAndVerticual.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0 , 500)");
		Thread.sleep(5000);
		js.executeScript("scrollBy(500 , 0)");
		Thread.sleep(5000);
		js.executeScript("scrollTo(0, -100)");
		Thread.sleep(5000);
		js.executeScript("scrollTo(-100, 0)");
		
		System.out.println("success");

	}

}
