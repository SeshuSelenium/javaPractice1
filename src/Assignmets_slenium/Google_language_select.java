package Assignmets_slenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.http.HttpStatus.Code;

public class Google_language_select {
	public WebDriver driver;
	public void hindi() throws Exception {
		//Google_language_select g = new Google_language_select();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'SIvCob\']/a[1]")).click();
		Thread.sleep(5000);
//		Set <Cookie> cookies = driver.manage().getCookies();
//		System.out.println(cookies.size());
//		for(Cookie cookie: cookies) {
//			System.out.println("cookies: " +cookie.getName());
//			
//		}
//		driver.manage().deleteAllCookies();
//		System.out.println("the site cookies: "+cookies.size());
//		Thread.sleep(5000);
	}
	public void telugu(String str) throws Exception {
		driver.findElement(By.xpath(str)).click();
		Thread.sleep(3000);
	}
//	public void english() throws Exception {
//		driver.findElement(By.xpath("//*[@id=\'SIvCob\']/a[2]")).click();
//		Thread.sleep(3000);
//	}
//	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Google_language_select g = new Google_language_select();
		g.hindi();
		
		g.telugu("//*[@id='SIvCob']/a[2]");
		g.telugu("//*[@id='SIvCob']/a[3]");
	}

}
