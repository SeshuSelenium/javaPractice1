package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static WebDriver driver , drive;
	public static void main(String[] args) throws Exception { 
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		String originol = driver.getWindowHandle();
		driver.findElement(By.name("proceed")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		//driver.switchTo().window(driver.getWindowHandle()).close();
		drive = new ChromeDriver();
		drive.get("https://www.facebook.com");
		drive.manage().window().maximize();
		for(String duplicate : drive.getWindowHandles()) {
			if(!duplicate.equals(originol)) {
				drive.switchTo().window(duplicate);
				//driver.close();
			}
			
		}
		
		
	}
	
	
	
}
