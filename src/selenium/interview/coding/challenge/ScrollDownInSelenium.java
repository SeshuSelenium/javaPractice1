package selenium.interview.coding.challenge;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownInSelenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/double-click-and-right-click-selenium.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();

		((JavascriptExecutor)driver).executeScript("scrollBy(0, 1000)");
		Thread.sleep(5000);
		//((JavascriptExecutor)driver).("scrollBy(1000, 500)");
		//JavascriptExecutor js=((JavascriptExecutor)driver);
		((JavascriptExecutor)driver).executeScript("scrollTo(0, -1000)");
	}
}
