package webdrivers;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://imgbb.com/");
		driver.findElement(By.xpath("//*[@id=\'home-cover-content\']/div[2]/a")).click();
		// Thread.sleep(5000);
		ProcessBuilder p = new ProcessBuilder("C:\\Users\\Nagasesha Reddy\\Desktop\\photos\\flowers.exe",
				"C:\\Users\\Nagasesha Reddy\\Desktop\\photos\\zzzzz.exe");
		p.start();
	}

}
