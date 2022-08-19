package RegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class POMClass {
	//declaration
	//Initialization
	//usage
	
	//object repository::
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement reg_logo;
	@FindBy(xpath="//a[text()='Already have an account?']")private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']")private WebElement signuplink;
	@FindBy(name="firstname")private WebElement firstname;
	@FindBy(name="lastname")private WebElement surname;
	@FindBy(name="reg_email__")private WebElement mob_email;
	@FindBy(name="reg_passwd__")private WebElement password;
	@FindBy(name="birthday_day")private WebElement birthday;
	@FindBy(name="birthday_month")private WebElement birthmonth;
	@FindBy(name="birthday_year")private WebElement birthyear;
	@FindBy(xpath="//label[text()='Male']")private WebElement gender_male;
	@FindBy(xpath="//label[text()='Female']")private WebElement gender_female;
	@FindBy(name="websubmit")private WebElement signupbtn;
	
	//Initialization
	public POMClass(WebDriver driver) {
			PageFactory.initElements(driver, this);
	}
	//usage:
	public void ClickfacebookSignuplink() {
		signuplink.click();
	}
	public void VarifyfacebookRegistrationpagelogo() {
		Assert.assertTrue(reg_logo.isDisplayed(), "The FB logo not displayed on registration page");
	}
	public void VarifyfacebookregistrationpageAlreadyaccount() {
		Assert.assertTrue(already_acc.isDisplayed(), "The fb already have account option is not displayed on page");
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
	}	
	public void setfacebookregistrationPageFirstName(String fn) {
		firstname.sendKeys(fn);
	}
	public void setfacebookregistrationPageLastName() {
		surname.sendKeys("xyzwer");	
	}
	public void setfacebookregistrationPageMob_email() {
		mob_email.sendKeys("rgosavi@gmail.com");		
	}
	public void setfacebookregistrtionPagePassword() {
		password.sendKeys("Rahul@123456");
	}
	public void setfacebookregistrationPageBirthday() {
		Select bday =new Select(birthday);
		Assert.assertTrue(birthday.isDisplayed(), "The birthday option is not displaed on registrtion page");
	//	Assert.assertFalse(birthday.isSelected());		
		bday.selectByVisibleText("18");
		}
	public void setfacebookregistrationPageBirthmonth() {
		Select bmonth= new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(),"The birthmoth option is not dispalyed on registration page");
		Assert.assertFalse(birthmonth.isSelected());
		bmonth.selectByVisibleText("Mar");
	}
	public void setfacebookregistrationPageBirthyear() {
		Select byear=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(), "The birthyear option is not displayed on registration page ");
	//	Assert.assertFalse(birthyear.isEnabled());
		byear.selectByVisibleText("1991");
	}
	public void setfacebookregistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("Female")){
			gender_female.click();
		}
		else {
			System.out.println("User has provider wrong input");
		}
	}
		
		public void clickfacebookregistrationPagebtn() {
			signupbtn.click();
		}
	
	
	
	}

