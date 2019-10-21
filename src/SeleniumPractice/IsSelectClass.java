package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectClass {
	static String userName = "nagasesha999";
	static String password = "darling143";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		driver.findElement(By.id("identifierId")).sendKeys(userName);
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("passwordNext")).click();

		WebElement compose = driver.findElement(By.xpath("//*[text()='Compose']"));
		if (compose.isDisplayed()) {
			System.out.println("compose is enable ");
		} else {
			System.out.println("compose is not enable ");
		}

		// driver.findElement(By.xpath("//*[@role='checkbox']")).click();
		WebElement selectMail = driver.findElement(By.xpath("//*[@role='checkbox']"));
		selectMail.click();

		System.out.println(selectMail.isSelected());

		if (selectMail.isSelected()) {
			System.out.println("the mail selected");
		} else {
			System.out.println("the mail not selected");
		}

		WebElement displayDelete = driver.findElement(By.xpath("//*[@aria-label='Delete']"));
		if (displayDelete.isDisplayed()) {
			System.out.println(" delete displayed ");

		} else {
			System.out.println("delete not displayed");
		}
	}

}
