package TestNGSuit2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase01 {
	
	@BeforeSuite(alwaysRun=true)
	public void configureserver() {
		System.out.println("Configure the server");
	}
	@AfterSuite(alwaysRun=true)
	public void Closeserver() {
		System.out.println("Close server");
	}
	@BeforeTest(alwaysRun=true)
	public void openDB() {
		System.out.println("Open Database");
	}
	@AfterTest(alwaysRun=true)
	public void closeDB() {
		System.out.println("Close Database");
	}
	@BeforeClass (alwaysRun=true)
	public void launchBrowser(){
		System.out.println("Launch the browser");	
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	@Test(groups="Smoke")
	public void test1() {
		System.out.println("Running method test1");
	}
	@Test(groups="Functional")
	public void test2() {
		System.out.println("Running method test2");
	}
	@Test(groups ="Regression")
	public void test3() {
		System.out.println("Running method test3");
	}

}
