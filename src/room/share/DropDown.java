package room.share;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=32dbfb329bfb17e812d23fb40b1c26d5");

		Select s = new Select(driver.findElement(By.name("country")));

		List<WebElement> option = s.getOptions();
		for (WebElement coun : option) {
			System.out.println(coun.getText());
		}
	}
}
