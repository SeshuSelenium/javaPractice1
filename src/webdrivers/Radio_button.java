package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		FirefoxDriver ch = new FirefoxDriver();
		
		ch.get("http://www.echoecho.com/htmlforms10.htm");
		
		String str = ch.getTitle();
		System.out.println(str);
		
		List<WebElement> lis = ch.findElementsByName("radio1");
		for (int i = 0; i < lis.size(); i++) {
			if (i == 0) {
				lis.get(i).click();
			}
		}
		List<WebElement> l = ch.findElements(By.name("group1")); // by using name for milk. it is group elements. so i
																	// solve it with the help of for loop
		for (int i = 0; i < l.size(); i++) { // the for loop using for looping
			if (i == 0) { // i apply condition with the help of if statement
				l.get(i).click();
			}
		}
		ch.findElement(By.xpath("(//*[@name='group2'])[1]")).click(); // by using xpath for water
		System.out.println("the test script is passed");
	}
}
