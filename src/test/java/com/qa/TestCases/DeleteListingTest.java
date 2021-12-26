package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.DeleteListing;

public class DeleteListingTest extends TestBase {
	
	@Test(priority=0,dataProvider="ValidLogin")
	public void LoginWithListUser(String Email,String Password) throws InterruptedException {
		DeleteListing DL = new DeleteListing();
		DL.LoginWithListingUSer(Email, Password);
	}
	
	@Test(priority=1)
	public void DeleteList() throws InterruptedException {
		DeleteListing DL = new DeleteListing();
		DL.DeleteTheList();
	}

}
