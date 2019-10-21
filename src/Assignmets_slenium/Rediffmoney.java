package Assignmets_slenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmoney {
	public static String net;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> list1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		List<WebElement> list2 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		List<WebElement> list3 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		List<WebElement> list4 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));

		List<WebElement> list5 = driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]"));
		String s = "Cipla";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equals(s)) {
				System.out.print(list.get(i).getText()+"\t");
				System.out.print(list1.get(i).getText()+"\t");
				System.out.print(list2.get(i).getText()+"\t");
				System.out.print(list3.get(i).getText()+"\t");
				System.out.println(list4.get(i).getText());
			}

		}
		System.out.println("pass");
		driver.quit();
	}

}
