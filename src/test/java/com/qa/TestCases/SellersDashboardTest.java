package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.SellersDashboard;

public class SellersDashboardTest extends TestBase {
	
	@Test(priority=0, groups= {"Regression Test","Smoke Test"})
	public void SellerDashboard() throws InterruptedException {
		SellersDashboard SD = new SellersDashboard();
		SD.sellerDashboard();
	}

}
