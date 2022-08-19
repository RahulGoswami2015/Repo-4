package ProgramON2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPrctice {
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("Browser Is Launched");
	}
	@BeforeClass
	public void closeBrowser() {
		System.out.println("Browser is closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Logged Into Application is successfully");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logged out from application successfully");
	}
	@Test(invocationCount=5)
	public void homepagetest() {
		System.out.println("home page test successfully");
	}
	
	
	
	
	
	
	

}
