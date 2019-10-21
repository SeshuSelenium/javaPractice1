package cocumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
	
public class StupFile {
	WebDriver driver;
	@Given("^to open a url https://www.yahoo.com$")
	public void openurl() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		driver= new FirefoxDriver();
		
	}  
	@When("^asked to open in firefox$")
	public void asked_to_open_in_firefox() {
		driver.get("https://www.facebook.com");
	}
	@Then("^open url and verify its title$")
	public void open_url_and_verify_its_title() {
		String title = driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up", title);
	}
	
}
