package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleAssurt {
	WebDriver driver;
	SoftAssert s;

	@Test(priority = 1)
	public void openImage() throws IOException {
		
		driver.get("https://imgbb.com/");
		String ActualResult = driver.getTitle();
		String ExpectedResult = "gmail";
		s = new SoftAssert();
		//Assert.assertEquals(ActualResult, ExpectedResult); // hardAssert
		s.assertEquals(ActualResult, ExpectedResult); // Soft Assert
		driver.findElement(By.xpath("//*[@id='home-cover-content']/div[2]/a")).click();
//		ProcessBuilder p = new ProcessBuilder("C:\\Users\\Nagasesha Reddy\\Desktop\\photos\\flowers123.exe");
//		p.start();


	}

	@Test(priority = 2, dependsOnMethods= "openimage")
	public void test2()  {
		System.out.println("testcase skipped");
	}
	@BeforeTest
	public void driverinitialization() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
}
