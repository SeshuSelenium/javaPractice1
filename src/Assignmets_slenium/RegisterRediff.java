package Assignmets_slenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterRediff {
public WebDriver ff;
	public Select s;

	public void reg1() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		ff = new FirefoxDriver();
		ff.manage().window().maximize();
		ff.manage().deleteAllCookies();
		
		ff.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ff.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		ff.get("https://register.rediff.com/register/register.php?FormName=user_details");
		ff.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("Nagasesha Reddy");
		ff.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("seshureddy99");
		ff.findElement(By.xpath("//*[@value='Check availability']")).click();
		
		
	
	}
	

}
