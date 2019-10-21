package selenium.interview.coding.challenge;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksInWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.sanfoundry.com/java-program-delete-specified-integer-from-array/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			System.out.println("links : "+i+" : "+links.get(i).getText());
		}
	}

}
