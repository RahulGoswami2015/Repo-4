package ProgramONTest1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Programe2testNG {
	
	@BeforeClass
	public void login() {
		System.out.println("login");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	@Test
	public void hompage() {
		System.out.println("Testing homepage sucessfully");
	}
	@Test
	public void profilepage() {
		System.out.println("Testing profilepage sucessfully");
	}
	@Test
	public void notificationpage() {
		System.out.println("Testing notification page");
	}
	
	
	
	

}
