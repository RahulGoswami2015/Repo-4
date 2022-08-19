package TestNGSuit2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase02 {
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() {
		System.out.println("lanuch the browswe");
	}
	@AfterClass(alwaysRun=true)
	public void closebrowser() {
		System.out.println("Close Browser");
	}
	@Test(groups="Smoke")
	public void test4() {
		System.out.println("Running methos is test4");
	}
	@Test(groups="Functional")
	public void test5() {
		System.out.println("Running method is test5");
	}
	@Test(groups="Regression")
	public void test6() {
		System.out.println("Running method is test6");
	}
	
}
