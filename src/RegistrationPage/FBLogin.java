package RegistrationPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBLogin {
	
	//declration::
	@FindBy(xpath=("//img[@alt='Facebook']"))private WebElement fblogo;
	@FindBy(xpath=("//h2[contains(text(),'the people in your life')]"))private WebElement login_tagline;
	@FindBy(xpath=("//input[@id='email']"))private WebElement email;
	@FindBy(xpath=("//button[@name='login']"))private WebElement login;
	@FindBy(xpath=("Forgotten password?"))private WebElement forgotpassword;
	@FindBy(xpath=("//a[text()='Create a Page']"))private WebElement createpage;
	
}
