package Assignmets_slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_assignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(3000);
		String str = "//*[@id='leftcontainer']/table/tbody/tr[4]/td[1]/a";
		String ses = "//*[@id='leftcontainer']/table/tbody/tr[4]/td[4]";
		WebElement element = driver.findElement(By.xpath(str));
		WebElement elements = driver.findElement(By.xpath(ses));
		System.out.print(element.getText() + "\t");
		System.out.println(elements.getText());

		String reddy = "//*[@id=\"leftcontainer\"]/table/tbody/tr[62]/td[1]";
		String reddy1 = "//*[@id=\"leftcontainer\"]/table/tbody/tr[62]/td[2]";
		String reddy2 = "//*[@id=\"leftcontainer\"]/table/tbody/tr[62]/td[3]";
		String reddy3 = "//*[@id=\"leftcontainer\"]/table/tbody/tr[62]/td[4]";
		String reddy4 = "//*[@id=\"leftcontainer\"]/table/tbody/tr[62]/td[5]/font";

		WebElement el = driver.findElement(By.xpath(reddy));
		WebElement ele = driver.findElement(By.xpath(reddy1));
		WebElement elem = driver.findElement(By.xpath(reddy2));
		WebElement elemen = driver.findElement(By.xpath(reddy3));
		WebElement element1 = driver.findElement(By.xpath(reddy4));
		
		System.out.print(el.getText()+ "\t");
		System.out.print(ele.getText()+ "\t");
		System.out.print(elem.getText()+ "\t");
		System.out.print(elemen.getText()+ "\t");
		System.out.println(element1.getText());
		System.out.println("\n test script is passed");
		driver.quit();
	}

}
