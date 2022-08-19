package Grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("Open database");
	}
	@AfterTest
	public void closeDB() {	
		System.out.println("Close database");
	
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("Open Browser");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@Test(groups="Smoke")
	public void Test1() {
		System.out.println("Test 1");
	}
	@Test(groups="Functional")
	public void Test2() {
		System.out.println("Test 2");
	}
	@Test(groups="Regression")
	public void Test3() {
		System.out.println("test 3");
	}

}
