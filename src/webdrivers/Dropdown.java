package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.base.Verify;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("http://www.echoecho.com/htmlforms11.htm");
		
		String title = c.getTitle();
		String actualTitle ="Forms : Drop Down Menu - HTML Tutorial";
		
		Assert.assertEquals(title, actualTitle);
		
		c.findElement(By.name("dropdownmenu")).sendKeys("Milk");
		List<WebElement> w = c.findElements(By.name("dropdownmenu"));
		//System.out.println(w.get(1).getAttribute("selected"));
		for (int i = 0; i < w.size(); i++) {
			System.out.println(w.get(i).getText());
		}
		Select s = new Select(c.findElement(By.name("mydropdown")));
		s.selectByValue("Bread");
		
		
		//Assert.assertEquals(title, actualTitle, "expected result and actuval result same");
		
		
		
		
		
	}

}
