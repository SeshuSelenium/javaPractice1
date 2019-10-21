package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xxxxxxxxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> company=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> CurrentPrice=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[4]"));
		String s = "Cipla";
		for (int i = 0; i < company.size(); i++) {
			if (company.get(i).getText().equals(s)) {
				System.out.print(company.get(i).getText()+"\t");
				System.out.println(CurrentPrice.get(i).getText());
				
			}
			
		}
		
		
	}

}
