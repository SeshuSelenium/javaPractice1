package testNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNgAnitations {

	@BeforeSuite
	public void bSuite() {
		System.out.println("Before suite");
	}

	@AfterSuite
	public void aSuite() {
		System.out.println("After suite");
	}

	@BeforeClass
	public void bClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void aClass() {
		System.out.println("After class");
	}

	@BeforeTest
	public void bTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}

	@BeforeMethod
	public void bMethod() {
		System.out.println("Before method");
	}

	@AfterMethod
	public void aMethod() {
		System.out.println("After method");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
}
