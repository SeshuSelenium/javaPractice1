package selenium.interview.coding.challenge1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooHome {
	public WebDriver driver;
	public YahooHome(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identifierId") public WebElement username; 
	
	@FindBy(id="identifierNext") public WebElement usernext;
	
	public void yahooUsername(String username_or_mobile_No) {
		username.sendKeys(username_or_mobile_No);
	}
	
	public void yahooUserNext() {
		usernext.click();
	}

}
