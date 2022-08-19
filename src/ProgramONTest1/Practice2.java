package ProgramONTest1;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {

	@BeforeMethod
	public void login() {
		System.out.println("Loging to webpage");
		Reporter.log("Loging to webpage");
	}
	@AfterMethod
	public void logout() {
		System.out.println("Logout from webpage");
		Reporter.log("Logout from webpage");
	}
	@Test(priority=1)
	public void testhomepage() {
		System.out.println("tested homepage successfully");
		Reporter.log("tested homepage successfully");
	}
	@Test(priority=3)
	public void testnotificationpage() {
		System.out.println("tested notification page successfully");
		Reporter.log("tested notification page successfully");
	}
	@Test(priority=2)
	public void testprofilepage() {
		System.out.println("tested profile page successfully");
		Reporter.log("tested profile page successfully");
	}
	
	
	
}
