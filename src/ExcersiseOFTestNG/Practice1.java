package ExcersiseOFTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice1 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("open database");
	}
	@AfterTest
	public void closeDB() {
		System.out.println("close database");
	}
	@Test(priority=1)
	public void m1() {
		System.out.println("This is method m1");
	}
	@Test(priority=2)
	public void m2() {
		System.out.println("This is method m2");
	}
	@Test(priority=3)
	public void m3() {
		System.out.println("This is method m3");
	}
	@Test(priority=4)
	public void m4() {
		System.out.println("This is method m4");
	}
	



}
