package Assignmets_slenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://money.rediff.com/gainers");
		Thread.sleep(3000);
		List<WebElement> co = c.findElements(By.cssSelector("table[class='dataTable'] tbody tr td:nth-child(1)"));
		List<WebElement> com = c.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(co.size());
		System.out.println(com.size());
		for (int i = 0; i < co.size(); i++) {
			
			System.out.print(co.get(i).getText());
			System.out.println(com.get(i).getText());

		}
		c.quit();
//		List<WebElement> com = c.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
//		for (int i = 0; i < co.size(); i++) {
//			System.out.println(co.get(i).getText());

		//}
	}
}
