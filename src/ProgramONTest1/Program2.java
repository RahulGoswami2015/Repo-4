package ProgramONTest1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program2 {
	@BeforeMethod
	public void login() {
		System.out.println("Log in to application");
	}
	@AfterMethod
	public void logout() {
		System.out.println("log out to application");
	}
	@Test
	public void homepage() {
		System.out.println("testing homepage");
		Reporter.log("Tested homepage sucessfully");
		Reporter.log("Log out from application");
	}
	@Test
	public void notificationpage() {
		System.out.println("testing notification page");
		Reporter.log("Tested notification page sucessfully");
	}
	@Test
	public void profilepagetest() {
		System.out.println("Started testing on profilepage sucessfully ");
		Reporter.log("Testing on profilepage");
	}
	
	
	
}
