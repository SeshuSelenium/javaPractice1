package webdrivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static WebDriver drivre, drive;
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		ChromeOptions options = new ChromeOptions(); // it is for web notifications
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		drivre = new ChromeDriver(options);

		drivre.get("https://www.facebook.com/");
		String parent = drivre.getWindowHandle();
		System.out.println(parent);
		drivre.findElement(By.id("email")).sendKeys("8499922504");
		drivre.findElement(By.id("pass")).sendKeys("bhimireddy@506");
		drivre.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
		drivre.manage().window().maximize();
		Thread.sleep(5000);
//		Alert alert = dr.switchTo().alert(); // it is for web page alerts alerts
//		System.out.println(alert.getText());
//		alert.accept();
//		Robot r = new Robot();  	// it is for window pop up
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyPress(KeyEvent.VK_ENTER);  
		Thread.sleep(5000);
		//drivre.findElement(By.xpath("(//*[text()='Nagasesha'])[1]")).click();

		Thread.sleep(5000);
		drivre.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);

		drivre.findElement(By.xpath("//*[text()='Log Out']")).click();
		List<WebElement> list = drivre.findElements(By.tagName("a"));
		System.out.println("in this web pae elements: " + list.size());
		//drivre.close();
		System.out.println("seccuss");
		
//		drive =new ChromeDriver();
//		drive.get("https:www.gmail.com");
//		String str1 = drive.getWindowHandle();
//		
//		for(String child : drive.getWindowHandles()) {
//			if(!child.equals(parent))
//		drivre.switchTo().window(parent).close();
//			
//		}
		
	}

}
