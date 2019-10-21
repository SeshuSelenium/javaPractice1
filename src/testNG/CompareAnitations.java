package testNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompareAnitations {
	
	@BeforeSuite
	public void bSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeClass
	public void bClass() {
		System.out.println("Before Class");
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("Before test");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@AfterMethod
	public void aMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void aClass() {
		System.out.println("after class");
	}
	
	@AfterTest
	public void aTest() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void aSuite() {
		System.out.println("after suite");
	}
}
