package selenium.interview.coding.challenge1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooLogIn {

	public WebDriver driver;
	
	public YahooLogIn(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="password") public WebElement pass;
	
	@FindBy(id="passwordNext") public WebElement passnext;
	
	//@FindBy(id="ibp-main") public WebElement sentbox;
	
	public void yahooPassword(String password) {
		pass.sendKeys(password);
	}
	
	public void yahooSigIn() {
		passnext.click();
	}
	
//	public void sent() {
//		sentbox.click();
//	}
}
