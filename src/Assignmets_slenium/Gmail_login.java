
package Assignmets_slenium;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmail_login {

	public static void main(String[] args) throws AWTException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("gmail");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Gmail - Google']")).click();
		Thread.sleep(5000);
		// driver.get("https://www.google.com/gmail/");
		driver.findElement(By.linkText("Create an account")).click();
		Thread.sleep(5000);
		String s = driver.getTitle();
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(w.get(1));

		driver.findElement(By.id("firstName")).sendKeys("nagaseshu");
		driver.findElement(By.name("lastName")).sendKeys("reddy");
		driver.findElement(By.id("username")).sendKeys("nagasesha999");
		driver.findElement(By.name("Passwd")).sendKeys("darling143");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("darling143");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Next']")).click(); // next button
		driver.findElement(By.id("phoneNumberId")).sendKeys("9515599998");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
	}

	private static Robot Robot() {
		// TODO Auto-generated method stub
		return null;
	}

}
