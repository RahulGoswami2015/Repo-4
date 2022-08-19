package ProgramON2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnablefalsePractice {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Browser is launched.");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login to page successfully");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from application successfully");
	}
	@Test(invocationCount=2)
	public void homepagetest() {
		System.out.println("home page tested successfully");
	}
	@Test(invocationCount=3, enabled=false)
	public void profilPage(){
		System.out.println("profile page tested successfully");
	}
	
	
}
