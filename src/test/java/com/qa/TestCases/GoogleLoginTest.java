package com.qa.TestCases;

import org.testng.annotations.Test;


import com.qa.Base.TestBase;
import com.qa.PageObjects.GoogleLogin;

public class GoogleLoginTest extends TestBase{

	

	@Test(priority=4)
	public void GoogleSocialLogin() throws InterruptedException {
	//extentTest = extent.startTest("GoogleSocialLogin");
	GoogleLogin log=new GoogleLogin(driver);
	log.GoogleSocialLogin();
}
}
