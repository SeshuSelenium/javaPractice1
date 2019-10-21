package selenium.interview.coding.challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/double-click-and-right-click-selenium.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action= new Actions(driver);
		driver.findElement(By.xpath("(//*[text()='Home'])[1]"));
		
		action.contextClick().build().perform();
		
	}
}
