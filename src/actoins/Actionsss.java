package actoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class Actionsss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Drivers\\chromedriver76\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shopping.rediff.com");
		WebElement watchhes = driver.findElement(By.id("topcat5"));
		Actions a = new Actions(driver);
		a.moveToElement(watchhes).build().perform();
		WebElement fossil = driver.findElement(By.xpath("//*[@id='div_subcatrgory']/div[2]/a[10]"));
		a.moveToElement(fossil).click().build().perform();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}
	
}
