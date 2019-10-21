package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.dynamic.scaffold.InstrumentedType.Frozen;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\java selenium\\Selenium_practice\\chromedriver.exe");

		
		  WebDriver drive = new ChromeDriver();
		  drive.get("https://www.google.com/gmail/");
		  drive.findElement(By.id("identifierId")).sendKeys("nagaseshareddy999");
		  drive.findElement(By.xpath("//*[text()='Next']")).click();
		  Thread.sleep(10000);
		  
		  drive.findElement(By.name("password")).sendKeys("darling143");
		  Thread.sleep(10000);
		  drive.findElement(By.xpath("//*[text()='Next']")).click();
		  Thread.sleep(10000);
		  drive.findElement(By.xpath("//*[text()='Compose']")).click();
		  Thread.sleep(3000); drive.findElement(By.name("to")).sendKeys("reddydarling99@gmail.com");
		
		drive.findElement(By.name("subjectbox")).sendKeys("hai");
		
		drive.findElement(By.xpath("//*[@role='textbox']")).sendKeys("india is a great country");
		
		drive.findElement(By.xpath("//*[text()='Send']")).click();
		List<WebElement> list = drive.findElements(By.tagName("a"));
		//System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			
		}
		System.out.println("its test script is pass");
		
		drive.quit();
	}

}
