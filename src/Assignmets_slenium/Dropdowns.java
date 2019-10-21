package Assignmets_slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://www.echoecho.com/htmlforms11.htm");
		  Select s = new Select(ff.findElement(By.name("dropdownmenu")));
		  s.selectByVisibleText("Milk");
		  Select sl = new Select(ff.findElement(By.name("mydropdown")));
		  sl.selectByVisibleText("Hot Bread");
		  
		  System.out.println(" \n the test script passed \n");
	}

}
