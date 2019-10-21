package webdrivers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoomail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\Downloads\\geckodriver-v0.24.0-win64\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://login.yahoo.com/");	// URL for web page
		d.manage().window().maximize();		//manage window
		String s = d.getTitle(); 	// get status of web page
		System.out.println(s);		//printing web page status
		Thread.sleep(5000);		// time for the waiting
		
		String mainW=d.getTitle();
		//d.findElement(By.xpath("//*[@id='uh-signin']")).click();
		Thread.sleep(5000);
		d.findElement(By.name("username")).sendKeys("seshureddy99");	// typing id in text box
		Thread.sleep(5000);
		d.findElement(By.name("signin")).click(); // click on next button
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@name='password']")).sendKeys("darling143@"); //typing password in text box
		d.findElement(By.name("verifyPassword")).click(); // click on the login button
		ArrayList<String> window = new ArrayList(d.getWindowHandles()); 
		int windowSize= window.size(); 
		System.out.println(windowSize);
		if(window.size()>1) {
			d.switchTo().window(window.get(1));
			String subW=d.getTitle();
			if(s != subW)
			{
				System.out.println("user in main window");
			}
			else
			{
				d.navigate().refresh();
				d.findElement(By.linkText("Sign in")).click();
				
			}
					}
		//d.quit();
	}

}
