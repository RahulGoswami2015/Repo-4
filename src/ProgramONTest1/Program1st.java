package ProgramONTest1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program1st {
	@Test(priority = 1)
	public void url() {
		System.out.println("URL is opened");
		Reporter.log("URL is opened");
	}
	@Test(priority = 3)
	public void login() {
	System.out.println("login is successfull");	
	Reporter.log("Login is successfull");
	}
	@Test(priority = 2)
	public void logout() {
		System.out.println("Logout is successfull");
		Reporter.log("Logout is successfull");
	}
	

}
