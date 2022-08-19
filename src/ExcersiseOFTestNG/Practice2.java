package ExcersiseOFTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice2 {
	@BeforeTest
	public void DBopen() {
		System.out.println("Data base open");
	}
	@AfterTest
	public void DBclse() {
		System.out.println("Database close");
	}
	@BeforeClass
	public void browseropen() {
		System.out.println("Browser is open");
	}
	@AfterClass
	public void browserclsed() {
		System.out.println("Browser is closed");
	}
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}
	

}
