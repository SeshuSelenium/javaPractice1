package Assignmets_slenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Find_specipic_drop_down {
	public Select s;
	public ChromeDriver c;
	public WebElement w;
	public int seconds;

	public void date() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		c = new ChromeDriver();
		c.get("https://register.rediff.com/register/register.php?FormName=user_details");
		c.manage().window().maximize();
		w = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		List<WebElement> l = w.findElements(By.tagName("option"));
		System.out.println(l.get(0).getAttribute("selected"));
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
		}

	}

	public void month() {
		WebElement we = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		List<WebElement> li = we.findElements(By.tagName("option"));
		System.out.println(li.get(0).getAttribute("selected"));
		for (int j = 0; j < li.size(); j++) {
			System.out.println(li.get(j).getText());
		}
	}

	public void year() throws Exception {
		WebElement web = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		List<WebElement> list = web.findElements(By.tagName("option"));
		System.out.println(list.get(0).getAttribute("selected"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		c.manage().deleteAllCookies();
		// c.manage().wait(5, seconds);
		c.quit();
	}

	public static void main(String[] args) throws Exception {
		Find_specipic_drop_down f = new Find_specipic_drop_down();
		f.date();
		f.month();
		f.year();

	}

}
