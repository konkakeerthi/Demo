package com.qa.PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class Signup extends TestBase {
public Signup() {
		
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//button[text()='Sign In']")
		WebElement ClickOnSignin;
		
		@FindBy(id="firstName")
		WebElement firstname;
		
		@FindBy(id="lastName")
		WebElement lastname;
		
		@FindBy(id="email")
		WebElement Email;
		
		@FindBy(id="password")
		WebElement Password;
		
		@FindBy(id="password-confirm")
		WebElement ConfirmPassword;
		
		@FindBy(id="submitbutton")
		WebElement login;
		@FindBy(xpath="//a[@id='loginRestartLink']")
		WebElement restart;
		
		@FindBy(xpath="//a[text()='Sign Up']")
		WebElement signup;
		
		@FindBy(xpath="//h1[@id='kc-page-title']//a[1]")
		WebElement log;
		
	
	public void Validsignup(String Firstname,String LastName,String password,String Confirmpassword,String EmailID) throws InterruptedException
		{
		ClickOnSignin.click();
			Thread.sleep(1000);
			signup.click();
			Thread.sleep(2000);
			firstname.sendKeys(Firstname);
			Thread.sleep(2000);
			lastname.sendKeys(LastName);
			Thread.sleep(2000);
			Email.sendKeys(EmailID);
			Thread.sleep(2000);
			
			Password.sendKeys(password);
			Thread.sleep(2000);
			
			ConfirmPassword.sendKeys(Confirmpassword);
			Thread.sleep(3000);
			login.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(4000);
			restart.click();
			Thread.sleep(4000);
			signup.click();
			Thread.sleep(2000);
			//log.click();
		}
	
	public void InvalidSignup(String Firstname,String LastName,String password,String Confirmpassword,String EmailID) throws InterruptedException {
		//	getstarted.click();
			//Thread.sleep(2000);
		//	signup.click();
			Thread.sleep(2000);
			firstname.sendKeys(Firstname);
			Thread.sleep(2000);
			lastname.sendKeys(LastName);
			Thread.sleep(2000);
			Email.sendKeys(EmailID);
			Thread.sleep(2000);
			
			Password.sendKeys(password);
			Thread.sleep(2000);
			
			ConfirmPassword.sendKeys(Confirmpassword);
			Thread.sleep(3000);
			login.click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(4000);
			//restart.click();
			//Thread.sleep(4000);
			signup.click();
	}



}