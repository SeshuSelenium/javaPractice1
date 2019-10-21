package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rdiffmail_find_elementSpecipc_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.id("login1")).sendKeys("nagaseshareddy99");
		d.findElement(By.id("password")).sendKeys("darling143");
		d.findElement(By.name("proceed")).click();
		WebElement w = d.findElement(By.xpath("//*[@id=\'mail_main_box_cont\']/div[1]")); // findin the links
		List<WebElement> link = w.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (int i = 0; i < link.size(); i++) {
			System.out.println(link.get(i).getText()); // print howmany links is there
		
		}
	}

}
