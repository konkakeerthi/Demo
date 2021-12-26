package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.Base.TestBase;
import com.qa.PageObjects.Contract_Orders;

public class Contract_OrdersTest extends TestBase {
	
/*	@Test(priority=0,dataProvider="ValidLogin")
	public void LoginWithBuyerUser(String Email, String Password) throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.LoginWithBuyerUser(Email, Password);
	}
	
	@Test(priority=1)
	public void ContractShare() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.sharecontract();
	}
	
	@Test(priority=2)
	public void LoginWithSellerUser() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.LoginWithSellerUser();
	}
	
	@Test(priority=3)
	public void ApproveContract() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.ApproveContract();
	}
*/	
	@Test(priority=4,dataProvider="ValidLogin")
	public void LoginWithBuyer(String Email, String Password) throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.LoginWithBuyerUser(Email, Password);
	}
	
	@Test(priority=5)
	public void BuyerProccedToPayment() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.BuyerProccedToPayment();
	}
	
	@Test(priority=6,dataProvider="SellerAccount")
	public void LoginWithSeller(String sellerEmail,String Password) throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.LoginWithSellerUser(sellerEmail,Password);
	}
	
	@Test(priority=7)
	public void InitiatePayment() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.InitiatePayment();
	}
	
	@Test(priority=8,dataProvider="BuyerAccount")
	public void LoginWithBuyerAccount(String buyerEmail, String Password) throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.LoginWithBuyerUser(buyerEmail, Password);
	}
	
	@Test(priority=9)
	public void DownloadBuyerInvoice() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.DownloadBuyerInvoice();
	}
	
	@Test(priority=10,dataProvider="SellerAccount")
	public void LoginWithSellerAccount(String sellerEmail,String Password) throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.LoginWithSellerUser(sellerEmail,Password);
	}
	
	@Test(priority=11)
	public void DownloadSellerInvoice() throws InterruptedException {
		Contract_Orders SA = new Contract_Orders();
		SA.DownloadSellerInvoice();
	}
	


}
