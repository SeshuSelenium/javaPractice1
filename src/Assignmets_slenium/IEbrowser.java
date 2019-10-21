package Assignmets_slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("9515599998");
		driver.findElement(By.id("pass")).sendKeys("darling12345");
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	}

}
