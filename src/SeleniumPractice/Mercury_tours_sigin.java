package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_tours_sigin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("firstName")).sendKeys("Nagasesha");
		Thread.sleep(5000);
		driver.findElement(By.name("lastName")).sendKeys("Reddy");
		driver.findElement(By.name("phone")).sendKeys("9515599998");
		driver.findElement(By.id("userName")).sendKeys("reddydarling99@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("papampalli(v), atmakur(m)");
		driver.findElement(By.name("city")).sendKeys("anantapur");
		driver.findElement(By.name("state")).sendKeys("andhra pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("515751");
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("reddydarling99@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Darling143");
		driver.findElement(By.name("confirmPassword")).sendKeys("Darling143");
		driver.findElement(By.name("submit")).click();

	}

}
