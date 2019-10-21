   package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement we = c.findElement(By.xpath("//*[@id='country']"));
		
		List<WebElement> l = we.findElements(By.tagName("option"));
		//System.out.println(l.get(0).getAttribute("Selected"));
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
		
		}
		
	}

}
