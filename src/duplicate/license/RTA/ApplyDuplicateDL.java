package duplicate.license.RTA;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ApplyDuplicateDL {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aptransport.org/#nogo");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Actions action = new Actions(driver);
		WebElement license = driver.findElement(By.xpath("//*[@id='mainmenu']/li[2]/a"));
		
		action.moveToElement(license).build().perform();
		WebElement duplicate = driver.findElement(By.xpath("//*[@id='mainmenu']/li[2]/div/div[4]/h3/a"));
		Thread.sleep(5000);
		action.moveToElement(duplicate).click().build().perform();
		Set<String> child =driver.getWindowHandles();
		System.out.println(child);
		for(String window : child)
		if(!window.equals(parent)) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
		
		}
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[6]")).click();
		driver.findElement(By.linkText("Driving Licence (DL)")).click();
		//s.selectByVisibleText("Driving Licence (DL)");
		Thread.sleep(5000);
		driver.findElement(By.name("serviceType")).click();
		driver.findElement(By.xpath("//*[@id=\"1a\"]/div[2]/div/form/div/div[1]/div/div/select/option[3]")).click();
		driver.findElement(By.name("appNo")).sendKeys("AP00220190014931DL");
		driver.findElement(By.name("dob")).sendKeys("01-06-1993");
		driver.findElement(By.xpath("//*[@id='1a']/div[2]/div/form/div/div[4]/div/button")).click();;
		
	}
}
