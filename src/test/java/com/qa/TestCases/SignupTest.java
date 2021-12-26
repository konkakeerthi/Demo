package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class SignupTest extends TestBase {
	
	@Test(priority=0,dataProvider="ValidSignup", groups= {"Regression Test", "Smoke Test"})
	public void ValidSignupDetails(String Firstname,String LastName,String password,String Confirmpassword, String EmailID) throws InterruptedException {
		
		com.qa.PageObjects.Signup sig=new com.qa.PageObjects.Signup();
		sig.Validsignup(Firstname, LastName, password, Confirmpassword, EmailID);
		
	}
	
	@Test(priority=1,dataProvider="InvalidSignup",groups= {"Regression Test", "Smoke Test"})
	public void InvalidSignup(String Firstname,String LastName,String password,String Confirmpassword, String EmailID) throws InterruptedException	{
		com.qa.PageObjects.Signup sig = new com.qa.PageObjects.Signup();
		sig.InvalidSignup(Firstname, LastName, password, Confirmpassword, EmailID);
	}
}
