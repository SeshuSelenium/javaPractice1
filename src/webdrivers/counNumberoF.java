package webdrivers;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class counNumberoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver. chrome.driver", "C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://shopping.rediff.com");
		List<WebElement> l = cd.findElements(By.tagName("a"));
		cd.close();
		System.out.println(l.size());
		
		
		
	}

}
