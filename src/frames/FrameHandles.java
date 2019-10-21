package frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver76\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.sanfoundry.com/java-program-delete-specified-integer-from-array/");
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
//		System.out.println(list); 
		
		for(WebElement lis : list) {
			System.out.println("frames : "+ lis.getAttribute("name"));
		}
		
	}

}
