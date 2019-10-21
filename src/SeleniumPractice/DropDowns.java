package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		Select s = new Select(driver.findElement(By.name("country")));
//		s.selectByVisibleText("INDIA");
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		
		Thread.sleep(1000);
		driver.quit();

	}
}
