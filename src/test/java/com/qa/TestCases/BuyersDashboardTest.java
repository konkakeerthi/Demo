package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.BuyersDashboard;

public class BuyersDashboardTest extends TestBase {
	
	@Test(priority=0,groups= {"Regression Test","Smoke Test"})
	public void BuyerDashboard() throws InterruptedException {
		BuyersDashboard BD = new BuyersDashboard();
		BD.Buyersdashboard();
		
	}

}
