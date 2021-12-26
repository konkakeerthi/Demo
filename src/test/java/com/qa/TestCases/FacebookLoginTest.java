package com.qa.TestCases;


import org.testng.annotations.Test;


import com.qa.Base.TestBase;
import com.qa.PageObjects.FacebookLogin;


public class FacebookLoginTest extends TestBase {
	
	
	//Verify if user click on Signin with Facebook Button navigating user to Facebook Api Screen and validate the details
	@Test(priority=5)
	public void FacebookSocialLogin() throws InterruptedException {
		extentTest = extent.startTest("FacebookSocialLogin");
		FacebookLogin log=new FacebookLogin(driver);
		log.FacebookSocialLogin();
	}

} 

