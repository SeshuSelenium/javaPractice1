package webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleRediffmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.id("login1")).sendKeys("nagaseshareddy99");
		d.findElement(By.id("password")).sendKeys("darling143");
		Thread.sleep(2000);
		d.findElement(By.name("proceed")).click();
		d.findElement(By.xpath("//*[text()='Write mail']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='TO_IDcmp2']")).sendKeys("reddydarling99@gmail.com");
		d.findElement(By.xpath("(//*[@type='text'])[11]")).sendKeys("selenium testimg");
		Thread.sleep(2000);
		//d.findElement(By.xpath("//html[@dir='ltr']"))
			//	.sendKeys("selenium: it is open source automation functinal testing tool");
		d.findElement(By.xpath("//a[text()='Send']")).click();
		
		System.out.println("the test script is passed");
		// WebElement w = d.findElement(By.id("popular_cat"));
//		List<WebElement> link = d.findElements(By.tagName("a"));
//		System.out.println(link.size());
//		for (int i = 0; i < link.size(); i++) {
//			System.out.println(link.get(i).getText());
//		}
	}

}
