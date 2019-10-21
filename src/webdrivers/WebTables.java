package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	private static String company;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromeDriver76\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://money.rediff.com/gainers");
		Thread.sleep(3000);
		List<WebElement> co = c.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> com = c.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(co.size());
		System.out.println(com.size());
//		for (int i = 0; i < co.size(); i++) {
//
//			System.out.print(co.get(i).getText());
//			System.out.println(com.get(i).getText());
//
//		}
		
		List<WebElement> we = c.findElements(By.xpath("//*[@class='dataTable']/child::tbody/tr/td[1]"));
		List<WebElement> web1 = c.findElements(By.xpath("//*[@class='dataTable']/child::tbody/tr/td[2]"));
		List<WebElement> web2 = c.findElements(By.xpath("//*[@class='dataTable']/child::tbody/tr/td[3]"));
		List<WebElement> web3 = c.findElements(By.xpath("//*[@class='dataTable']/child::tbody/tr/td[4]"));
		company = "Blue Chip Tex In";
		System.out.println("#company : \t \t #group : \t \t #pre close : \t \t #current price : ");
		for (int i = 0; i < we.size(); i++) {
			if(we.get(i).getText().equals(company)) {
			System.out.print(we.get(i).getText()+"\t");
			System.out.print(web1.get(i).getText()+"\t");
			System.out.print(web2.get(i).getText()+"\t");
			System.out.println("\t"+web3.get(i).getText());
			}
		}
		
		 // c.quit();

	}

}
