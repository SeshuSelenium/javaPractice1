package Assignmets_slenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterRediff1 extends RegisterRediff {
	public Select s;

	public void rediffEx() throws Exception {
		// RegisterRediff1.reg1();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\testing\\Selenium_practice\\geckodriver.exe");
		Thread.sleep(5000);
		ff.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("Darling143");
		ff.findElement(By.xpath("(//*[@type='password'])[2]")).sendKeys("Darling143");

		ff.findElement(By.xpath("//*[@maxlength='100']")).sendKeys("seshureddy99@yahoo.com");

		ff.findElement(By.xpath("//*[@class='nomargin']")).click();
		new Select(ff.findElement(By.xpath("//*[@id=\'div_hintQS\']/table/tbody/tr[2]/td[3]/select")))
				.selectByVisibleText("What is the name of your first school?");

		ff.findElement(By.xpath("(//*[@type='password'])[3]")).sendKeys("golden bells E.M school");
		ff.findElement(By.xpath("(//*[@type='text'])[4]")).sendKeys("seshu");
		ff.findElement(By.id("mobno")).sendKeys("7989620254");

		new Select(ff.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"))).selectByIndex(25);
		ff.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[2]")).sendKeys("DEC");
		ff.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")).sendKeys("1992");
		new Select(ff.findElement(By.xpath("//*[@id='div_city']/table/tbody/tr[1]/td[3]/select")))
				.selectByVisibleText("Bangalore");
		System.out.println("succuss");
		Thread.sleep(5000);
		ff.quit();
	}

	public static void main(String[] args) throws Exception {
		RegisterRediff1 re = new RegisterRediff1();
		re.reg1();
		re.rediffEx();

	}
}
