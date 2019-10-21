package webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium seshu\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		String s =c.getTitle();
		System.out.println(s);
		c.get("http://www.echoecho.com/htmlforms09.htm");
		List<WebElement> list = c.findElements(By.name("Checkbox"));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAttribute("Checked")+"\n");
			if(i != 1)
			list.get(i).click();
			System.out.println(list.get(i).getAttribute("Checked")+"\n");
			
			
			
		}
	}

}
