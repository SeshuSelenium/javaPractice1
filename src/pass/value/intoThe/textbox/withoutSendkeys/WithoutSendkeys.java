package pass.value.intoThe.textbox.withoutSendkeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSendkeys {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1559297083&rver=7.0.6737.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fRpsCsrfState%3d095923c4-2baa-b85f-3f25-46a1e34ccb05&id=292841&aadredir=1&whr=outlook.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		Thread.sleep(10000);
		
		driver.findElement(By.name("loginfmt")).sendKeys("nagasesha999@Outlook.com");
//		List<WebElement> email =driver.findElements(By.name("loginfmt"));
//		((JavascriptExecutor)driver).executeAsyncScript("Argument[0].value='nagasesha999'", email);
//		driver.findElement(By.id("idSIButton9")).submit();
		Thread.sleep(5000);
//		driver.findElement(By.name("passwd")).sendKeys("darling143");
//		driver.findElement(By.id("idSIButton9")).submit();
	}

}
