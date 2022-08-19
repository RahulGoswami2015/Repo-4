package RegistrationPage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
	WebDriver driver;
	@BeforeClass()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\CromeWeb Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		
	}
	@Test
		public void FacebookRegistrationTestPage() {
		
		POMClass rgpage=new POMClass(driver);
		
		rgpage.ClickfacebookSignuplink();
		rgpage.VarifyfacebookRegistrationpagelogo();
	//	rgpage.VarifyfacebookregistrationpageAlreadyaccount();
		rgpage.setfacebookregistrationPageFirstName("asert");
		rgpage.setfacebookregistrationPageLastName();
		rgpage.setfacebookregistrationPageMob_email();
		rgpage.setfacebookregistrtionPagePassword();
		rgpage.setfacebookregistrationPageBirthday();
		rgpage.setfacebookregistrationPageBirthmonth();
		rgpage.setfacebookregistrationPageBirthyear();
		rgpage.setfacebookregistrationPageGender("female");
		rgpage.clickfacebookregistrationPagebtn();
		
		
		
		}
	}
	
	
		
		
		
	


