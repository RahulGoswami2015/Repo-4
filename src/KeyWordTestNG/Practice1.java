package KeyWordTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 {
	
	
	@Test (priority = 1)
	public void openurl() {
		System.out.println("url opened");
		
	}
	
	@Test(priority = 2, dependsOnMethods = "openurl")
	public void login() {
		System.out.println("Logged in to the application sucessfully");
		Assert.fail();
	}
	
	@Test (priority = 3,dependsOnMethods= "login" )
	public void logout() {
		System.out.println("Logged out from the application");
	}
	
	
}
	


