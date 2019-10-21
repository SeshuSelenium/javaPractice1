package testNG;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment {
	WebDriver driver;
	Select s;

	@Test(priority = 1)
	public void rediffUnlimitedStorage() {
		new Select(driver.findElement(By.name("dropdownmenu"))).selectByVisibleText("Cheese");
		List<WebElement> lis = driver.findElements(By.name("dropdownmenu"));
		// System.out.println(lis.get(1).getAttribute("selected"));

	}

	@Test(priority = 2)
	public void elementsInDropdowns() {
		List<WebElement> list = driver.findElements(By.name("dropdownmenu"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}

	@Test(priority = 3)
	public void availableDefault() {

	}
	

	@BeforeTest
	public void rediffPsge() {
		System.setProperty("webdriver.gecko.driver",
				"E:\\java selenium\\Selenium_practice\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
	}
	@AfterMethod
	public void Screenshot() {
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("E:\\java selenium\\Selenium_practice\\Screenshot\\shots.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
