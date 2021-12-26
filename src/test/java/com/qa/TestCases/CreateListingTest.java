package com.qa.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.CreateListing;

public class CreateListingTest extends TestBase{
	
	
	@Test(priority=0,dataProvider="ValidLogin")
	public void LoginWithRegisterUSer(String Email,String Password) throws InterruptedException {
	
		CreateListing CL = new CreateListing();
		CL.LoginWithRegisterUSer(Email, Password);
		
	}
	
	@Test(priority=1)
	public void NavtigateCreateListing() throws InterruptedException {
		CreateListing CL = new CreateListing();
		CL.NavigateCreateListManual();
	}
	
	@Test(priority=2,dataProvider="CreateListing")
	public void CreateList(String ListHead, String ListDesc,String seedQuantity,String MinQuantity,String SeedPrice,String Postcode,String Address,String Locality) throws IOException, InterruptedException {
		
		CreateListing CL=new CreateListing();
		CL.CreateListManual(ListHead, ListDesc, seedQuantity, MinQuantity, SeedPrice, Postcode, Address, Locality);
	}

}
