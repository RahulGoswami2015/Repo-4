package Grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3 {
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Open browser");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	@Test(groups="Smoke")
	public void test7() {
		System.out.println("Test 7");
	}
	@Test(groups="Functional")
	public void test8() {
		System.out.println("Test 8");
	}
	@Test(groups="Regression")
	public void test9() {
		System.out.println("Test 9");
	}


}
