package actoins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\java selenium\\Selenium_practice\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.flipkart.com/search?q=televisions&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_3_0&otracker1=AS_Query_TrendingAutoSuggest_3_0&as-pos=3&as-type=TRENDING");
		String str;
		str = wd.getTitle();
		System.out.println(str);
		WebElement tv = wd.findElement(By.xpath(
				"//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[1]/div"));
		Actions a = new Actions(wd);
		a.dragAndDropBy(tv, 25, 0).build().perform();
		a.dragAndDropBy(tv, 50, 0).build().perform();
		
	}

}
