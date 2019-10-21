package SeleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SpicejetOneway {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.spicejet.com");
		String str;
		str = wd.getTitle();
		System.out.println(str);
		wd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[text()=' Bengaluru (BLR)']")).click();
		wd.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("(//*[text()=' Hyderabad (HYD)'])[2]")).click();
		wd.findElement(By.xpath("(//*[text()='10'])[2]")).click();
		wd.findElement(By.id("divpaxinfo")).click();
		wd.findElement(By.id("hrefIncAdt")).click();
		wd.findElement(By.id("btnclosepaxoption")).click();
		wd.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
		wd.findElement(By.xpath("//*[text()='INR']")).click();
		wd.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[text()=' Modify Search']")).click();
		Thread.sleep(3000);
		//new select(wd.findElement(By.id("Login"))).SelectBy
		Thread.sleep(2000);
//		wd.findElement(By.id("TravelAgentLoginText")).click();
		String s= wd.getTitle();
		System.out.println(s);
		System.out.println("\n test script is pass");
		WebElement MENU =wd.findElement(By.linkText("MENU"));
		Actions a = new Actions(wd);
		a.moveToElement(MENU).build().perform();
		WebElement Tariffs = wd.findElement(By.linkText("Tariffs"));
		a.moveToElement(Tariffs).click().build().perform();
//		WebElement  FlightSchedules = wd.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/ul/li[6]/ul/li[1]/ul/li[5]/a"));
//		a.moveToElement(FlightSchedules).click().build().perform();
		
	}

	

}
