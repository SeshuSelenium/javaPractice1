package naukri;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Naukri {
	static String p;
	public WebDriver driver;
	@BeforeTest
	public void pre() throws Exception {
		System.setProperty("webdriver.gecko.driver" , "E:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
	}
	@Test(priority = 0)
	public void firstWindow() throws InterruptedException {
		
		p = driver.getWindowHandle();
		
		Thread.sleep(5000);
		driver.findElement(By.id("usernameField")).sendKeys("nagasesha999@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("darling143");
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Jobs')]")).click();
		Set<String> child = driver.getWindowHandles();
		for(String ch : child) {
			if(ch!=p)
		driver.switchTo().window(ch);
			
		}
		//aggrid 
		// under weight aplication
		// how to use 
		// j quiry
		
		Actions a = new Actions(driver);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		String getTabName = driver.getTitle();
		System.out.println(getTabName);
		String winOne = driver.getCurrentUrl();
		System.out.println(winOne);
		Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void secondWindow() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='mTxt'][contains(text(),'Recruiters')]")).click();
		Set<String> child2 = driver.getWindowHandles();
		for (String ch2 : child2) {
			if(ch2!=p) {
		driver.switchTo().window(ch2);
			}
		}
		Thread.sleep(5000);
		String getTabName = driver.getTitle();
		System.out.println(getTabName);
		String winTwo = driver.getCurrentUrl();
		System.out.println(winTwo);
		Thread.sleep(5000);
	}
	@Test(priority = 2)
	public void thardWindow() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Companies')]")).click();
		Set<String> child3 = driver.getWindowHandles();
		for (String ch3 : child3) {
			if(ch3!=p) {
		driver.switchTo().window(ch3);
			}
			
		}
		
		Thread.sleep(5000);
		String getTabName = driver.getTitle();
		System.out.println(getTabName);
		String winThree = driver.getCurrentUrl();
		System.out.println(winThree);
	
		//driver.switchTo().window();
	}
	@AfterTest
	public void post() {
		driver.quit();
	}

}
