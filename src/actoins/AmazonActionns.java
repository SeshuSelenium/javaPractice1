package actoins;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		Robot r = new Robot();
		for(int i =1; i<2; i++) {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Actions a = new Actions(driver);
		WebElement navlinkaccountList = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(navlinkaccountList).build().perform();
		WebElement Signin = driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span"));
		a.moveToElement(Signin).click().build().perform();
		driver.findElement(By.name("email")).sendKeys("9515599998");
		driver.findElement(By.name("password")).sendKeys("darling143");
		driver.findElement(By.id("signInSubmit")).click();
		WebElement departmets = driver.findElement(By.id("nav-link-shopall"));
		a.moveToElement(departmets).build().perform();
		WebElement baby = driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/a[7]/span"));
		a.moveToElement(baby).click().build().perform();
		System.out.println("pass test case");
	}

}
