package ExcersiseOFTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class PracticeClass2 {
	@BeforeClass
	public void openbrowser() {
		System.out.println("open the browser");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("Close the browser");
	}
	@Test(priority=4)
	public void m4() {
		System.out.println("This is method m4");
	}
	@Test(priority=6)
	public void m5() {
		System.out.println("This is method m5");
	}
	@Test(priority=7)
	public void m6() {
		System.out.println("This is method m6");
	}
	
	
	}
