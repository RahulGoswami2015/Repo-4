package KeyWordTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsON {
	@BeforeClass
	public void openurl() {
		System.out.println("open url");
	}
	@AfterClass
	public void closeurl() {
		System.out.println("close url");
	}
	@Test(priority=3)
	public void test1() {
		System.out.println("This is test 1");
	}
	@Test(priority=2,dependsOnMethods="test1")
	public void test2() {
		System.out.println("This is test 2");
	}
	@Test(priority=1, dependsOnMethods= {"test1","test2"})
	public void test3() {
		System.out.println("This is test 3");
	}

}
