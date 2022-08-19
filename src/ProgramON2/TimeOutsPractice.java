package ProgramON2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOutsPractice {
	@BeforeClass
	public void launchclass() {
		System.out.println("Browser is launched");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Logged into pplication successfully");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from application sucssessfully");
	}
	@Test (priority = 2,timeOut = 5000)
	public void homePageTest() throws InterruptedException {
		Thread.sleep(6000);  // purpsoefully purpsoefully purpsoefully purpsoefully
		System.out.println("Home page tested sucessfully");
	}

	@Test (priority=1)
	public void profilePageTest() {
		System.out.println("Profile page tested sucessfully");
	}
	
	
	

}
