package selenium.interview.coding.challenge1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooSiginPage {
	public static WebDriver driver;
	public YahooSiginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	 
	
	public void login() throws Exception {
		YahooHome home = new YahooHome(driver);
		Thread.sleep(5000);
		home.yahooUsername("nagasesha999");
		home.yahooUserNext();
		YahooLogIn login = new YahooLogIn(driver);
		Thread.sleep(5000);
		login.yahooPassword("darling143");
		login.yahooSigIn();
		//driver.findElement(By.linkText("Sent")).click();
		//login.sent();
		
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver,chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		YahooSiginPage sigin = new YahooSiginPage(driver);
		sigin.login();
	}

}
