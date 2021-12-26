package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.Listings;

public class ListingsTest extends TestBase {
	
	@Test(priority=0,groups= {"Regression Test","Smoke Test"})
	public void List() throws InterruptedException {
		Listings LS = new Listings();
		LS.List();
	}

}
