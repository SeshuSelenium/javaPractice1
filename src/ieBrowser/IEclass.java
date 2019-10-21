package ieBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class IEclass {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\IEDriverServer.exe");
		DesiredCapabilities Capabilities =DesiredCapabilities.internetExplorer();
		Capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		String str = driver.getTitle();
		System.out.println(str);
		driver.findElement(By.cssSelector("#login1")).sendKeys("nagaseshareddy99");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#password")).sendKeys("darling143");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div > div.lft_wrap > div.content-area > div.rhs-area.floatR > div.login-area-free.floatR > div > form > div > div:nth-child(6) > div:nth-child(1) > input[type=\"submit\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("body > div.rd_wrapper.is_red_user > div.rd_header > div > div.setting_rd > a.rd_logout")).click();
		System.out.println(driver.getTitle());
		
	}
	
}
