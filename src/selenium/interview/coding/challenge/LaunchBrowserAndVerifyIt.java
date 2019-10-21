package selenium.interview.coding.challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LaunchBrowserAndVerifyIt {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http:\\www.google.com");
		String title = driver.getTitle();
		String expected = "Google";
		System.out.println(title);
		Assert.assertEquals(title, expected);
		
		if (title.equals(expected)) {
			System.out.println("equal");
		}else {
			System.out.println("Not equal");
		}
		
		String pageSource = driver.getPageSource();
		String url = driver.getCurrentUrl();
		//System.out.println(pageSource);
		System.out.println(url);
		String expectedurl = "https://www.google.com/?gws_rd=ssl";
		Assert.assertEquals(url, expectedurl);
		
		if(url.equalsIgnoreCase(expectedurl)) {
			System.out.println("url Equal");
		}else {
			System.out.println("url Not Equal");
		}
		Actions action = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		driver.findElement(By.name("btnK")).click();
	}

}
