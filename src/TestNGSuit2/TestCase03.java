package TestNGSuit2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase03 {
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() {
		System.out.println("launch the browser");
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	@Test(groups="Smoke")
	public void test7() {
		System.out.println("Running method is test7");
	}
	@Test(groups="Functional")
	public void test8() {
		System.out.println("Running method is test8");
	}
	@Test(groups="Regression")
	public void test9() {
		System.out.println("Running method is test9");
	}
	

}
