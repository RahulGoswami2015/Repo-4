package Grouping;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {
	@BeforeClass
	public void openBrowser() {
		System.out.println("Open browser");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Test 4");
	}
	@Test(groups="Functional")
	public void test5() {
		System.out.println("Test 5");
	}
	@Test(groups="Regression")
	public void test6() {
		System.out.println("Test 6");
	}

}
