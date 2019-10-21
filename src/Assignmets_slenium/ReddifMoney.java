package Assignmets_slenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifMoney {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> company=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> group=driver.findElements(By.linkText("//*[@class='dataTable']/tbody/tr[1]/td"));
		List<WebElement> PrevClose=driver.findElements(By.linkText("//*[@class='dataTable']/tbody/tr/td[3]"));
		List<WebElement> CurrentPrice=driver.findElements(By.linkText("//*[@class='dataTable']/tbody/tr/td[4]"));
		List<WebElement> Change=driver.findElements(By.linkText("//*[@class='dataTable']/tbody/tr/td[5]"));
		for (int i = 0; i < group.size(); i++) {
			String net = group.get(i).getText();
			System.out.println(net);
		}
		for (int i = 0; i < company.size(); i++) {
			String data=company.get(i).getText();
			String data1=company.get(i).getText();
			String data2=company.get(i).getText();
			String data3=company.get(i).getText();
			String data4=company.get(i).getText();
			
			//WebElement group1= driver.findElement(By.xpath("//table[class='dataTable']/tbody/tr/td[11]"));
			
			System.out.println(data);
			
		}
		driver.quit();
	}

}
