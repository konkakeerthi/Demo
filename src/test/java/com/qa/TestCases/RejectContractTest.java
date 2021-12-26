package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;

public class RejectContractTest extends TestBase{
	
	@Test(priority=0,dataProvider="BuyerAccount")
	public void LoginWithBuyerUser(String buyerEmail, String Password) throws InterruptedException {
		com.qa.PageObjects.RejectContract SA = new com.qa.PageObjects.RejectContract();
		SA.LoginWithBuyerUser(buyerEmail, Password);
	}
	
	@Test(priority=1)
	public void ContractShare() throws InterruptedException {
		com.qa.PageObjects.RejectContract SA = new com.qa.PageObjects.RejectContract();
		SA.sharecontract();
	}
	
	@Test(priority=2,dataProvider="SellerAccount")
	public void LoginWithSellerUser(String sellerEmail,String Password) throws InterruptedException {
		com.qa.PageObjects.RejectContract SA = new com.qa.PageObjects.RejectContract();
		SA.LoginWithSellerUser(sellerEmail,Password);
	}
	
	@Test(priority=3)
	public void RejectContract() throws InterruptedException {
		com.qa.PageObjects.RejectContract SA = new com.qa.PageObjects.RejectContract();
		SA.RejectContracts();
	}

}
