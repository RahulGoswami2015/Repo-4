package RegistrationPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registrtion1 {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\CromeWeb Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
		
		 RegistrationTest1 rgpage = new  RegistrationTest1(driver);
		rgpage.clickFacebookSignupLink();
		rgpage.verifyFacebookRegistrationPagefblogo();
		rgpage.verifyFacebookRegistrationPageAlreadyAccount();
		rgpage.setFacebookRegistrationPageFirstName("ABCDEFGH");
		rgpage.setFacebookRegistrationPageLastName("asdfer");
		rgpage.setFacebookRegistrationPageMob_Email();
		rgpage.setFacebookRegistrationPagePassword();
		rgpage.setFacebookRegistrationPageBirthDay();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthYear();
		rgpage.setFacebookRegistrationPageGender("female");
		rgpage.clickFacebookRegistrationPageSubmitBtn();
	}
	
}


