package ProgramONTest1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	@BeforeMethod
	public void login() {
	System.out.println("Log in to webpage");	
	Reporter.log("Log in to webpage");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the webpage");
		Reporter.log("Logout from the webpage");
	}
	@Test
	public void profilepage() {
		System.out.println("Testing profile page successfully");
		Reporter.log("Testing profile page successfully");
	}
	@Test
	public void homepage() {
		System.out.println("Testing homepage successfully");
		Reporter.log("Testing homepage successfully");
	}
	@Test
	public void notificationpage() {
		System.out.println("Testing notification page successfully");
		Reporter.log("Testing notification page successfully");
	}
	

}
