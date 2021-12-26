package com.qa.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class Contract_Orders extends TestBase {
	
		public static String otp = null;
	
	public Contract_Orders() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement ClickOnSignin;
	
	@FindBy(name="username")
	WebElement EnterEmail;
	
	@FindBy(id="password")
	WebElement EnterPassword;
	
	@FindBy(name="login")
	WebElement ClickOnLogin;
	
	
	public void LoginWithBuyerUser(String buyerEmail,String Password) throws InterruptedException {
		ClickOnSignin.click();
		Thread.sleep(2000);
		
		EnterEmail.sendKeys(buyerEmail);
		Thread.sleep(2000);
		
		EnterPassword.sendKeys(Password);
		Thread.sleep(1000);
		
		ClickOnLogin.click();
		Thread.sleep(3000);
		
		System.out.println("Login with Buyer Account");
		
	}
	@FindBy(xpath="//div[@id='home']/div[2]/div[2]/div[1]/div[1]/section[1]/section[1]/section[2]/div[1]/div[5]/input[1]")
	WebElement SelectVariety;
	
	@FindBy(xpath="//div[@id='home']/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")
	WebElement SelectListing;

	@FindBy(xpath="//button[text()='Buy']")
	public WebElement BuyButton;

	@FindBy(xpath="//button[text()='Share Contract with Seller']")
	public WebElement ShareContract;
	
	@FindBy(xpath="//button[text()='View Orders']")
	public WebElement ViewOrders;
	
	@FindBy(xpath="//a[normalize-space()='Your Purchases']")
	public WebElement YourPurchases;
	
	@FindBy(xpath="//a[contains(@class,'nav-link dropdown-toggle')]//img[1]")
	WebElement MousehoverToUser;
	
	@FindBy(xpath="(//a[@class='dropdown-item '])[3]")
	WebElement ClickOnLogout;

	@FindBy(xpath="(//span[text()='LongReach Cobra Seeds for sale at 300AUD'])[1]")
	 public WebElement Listingheadline;
	 
					public void sharecontract() throws InterruptedException
					{
						Thread.sleep(2000);
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,400)");
						Thread.sleep(3000);
						
						SelectVariety.click();
						Thread.sleep(3000);
						
						 String ActHeadline=Listingheadline.getText();
						 System.out.println(ActHeadline);
						 String ExpText="LongReach Cobra Seeds for sale at 300AUD";
						 
						 if(ActHeadline.equalsIgnoreCase(ExpText))
							 
						 {
							 Thread.sleep(3000);
							 Listingheadline.click();
							 
						 }
						 else
						 {
							 System.out.println("Fail");
						 }
						
					//	SelectListing.click();
						 Thread.sleep(3000);
						
						js.executeScript("window.scrollBy(0,300)");
						Thread.sleep(3000);
						
						BuyButton.click();
						Thread.sleep(3000);
						js.executeScript("window.scrollBy(0,500)");
						Thread.sleep(3000);
						
						ShareContract.click();
						Thread.sleep(3000);
						
						ViewOrders.click();
						Thread.sleep(3000);
						
						YourPurchases.click();
						Thread.sleep(3000);
						Actions act=new Actions(driver);
						act.moveToElement(MousehoverToUser).perform();
						Thread.sleep(3000);
						
						ClickOnLogout.click();
						Thread.sleep(3000);
						
					}
	
						public void LoginWithSellerUser(String sellerEmail,String Password) throws InterruptedException {
							ClickOnSignin.click();
							Thread.sleep(2000);
							EnterEmail.sendKeys(sellerEmail);
							Thread.sleep(2000);
							EnterPassword.sendKeys(Password);
							Thread.sleep(1000);
							ClickOnLogin.click();
							Thread.sleep(3000);
							System.out.println("Login with seller Account");
						}
	
	@FindBy(xpath="//a[normalize-space()='Orders']")
	WebElement ClickOnOrders;
	
	@FindBy(xpath="(//button[text()='Approve Contract'])[1]")
	WebElement ApproveContract;
	
	@FindBy(xpath="//button[text()='Approve']")
	WebElement Approve;
	
	@FindBy(xpath="//p[text()='Contract Approved Successfully']")
	WebElement ApproveSuccess;
	
	@FindBy(xpath="//button[text()='Okay']")
	WebElement Okay;

	
						public void ApproveContract() throws InterruptedException {
							ClickOnOrders.click();
							Thread.sleep(3000);
							
							ApproveContract.click();
							Thread.sleep(3000);
							
							Approve.click();
							Thread.sleep(3000);
							
							String Text=ApproveSuccess.getText();
							Thread.sleep(2000);
							if(Text.equalsIgnoreCase("Contract Approved Successfully")) 
							{
								System.out.println("Contract is Approved Successfully");
							}
							else
							{
								System.out.println("Contract is not Approved Successfully");
							}
							Thread.sleep(2000);
							
							Okay.click();
							Thread.sleep(3000);
							
							Actions act=new Actions(driver);
							act.moveToElement(MousehoverToUser).perform();
							Thread.sleep(3000);
							ClickOnLogout.click();
							Thread.sleep(3000);
						}
	
	@FindBy(xpath="(//button[text()='Proceed to Payment'])[1]")
	WebElement ProccedtoPayment;
	
	@FindBy(name="payment")
	WebElement SelectCard;
	
	@FindBy(id="termsCheck")
	WebElement PayementAcceptandTerms;
	
	@FindBy(xpath="//button[text()='Proceed to Payment']")
	WebElement ClickOnPayment;
	
	@FindBy(xpath="//p[text()='Your 6 Digit Code is']/following-sibling::p")
	WebElement GetTheBuyerOTP;
	
	@FindBy(xpath="//button[text()='View Orders']")
	WebElement ViewOrderss;
	
						public void BuyerProccedToPayment() throws InterruptedException {
							Thread.sleep(2000);
							ClickOnOrders.click();
							Thread.sleep(3000);
							YourPurchases.click();
							Thread.sleep(3000);
							JavascriptExecutor js = (JavascriptExecutor) driver;
						//	js.executeScript("window.scrollBy(0,500)");
						//	Thread.sleep(3000);
							ProccedtoPayment.click();
							Thread.sleep(5000);
							SelectCard.click();
							Thread.sleep(3000);
							js.executeScript("window.scrollBy(0,500)");
							Thread.sleep(2000);
							PayementAcceptandTerms.click();
							Thread.sleep(3000);
							ClickOnPayment.click();
							Thread.sleep(5000);
							
							otp=GetTheBuyerOTP.getText();
							Thread.sleep(2000);	
							System.out.println(otp);
							
							ViewOrderss.click();
							Thread.sleep(3000);
							YourPurchases.click();
							Thread.sleep(3000);
							Actions act=new Actions(driver);
							act.moveToElement(MousehoverToUser).perform();
							Thread.sleep(3000);
							ClickOnLogout.click();
							Thread.sleep(3000);
							
						}
						
		@FindBy(xpath="(//button[text()='Initiate Payment'])[1]")
		WebElement InitiatePayment;		
		
		@FindBy(id="first")
		WebElement EnterOTP;	
		
		@FindBy(xpath="//button[text()='Verify Code']")
		WebElement VerifyCode;
		
		@FindBy(xpath="//p[text()='Payment Initiated Successfully']")
		WebElement PaymentSuccessfully;
		
		@FindBy(xpath="//p[text()='View Orders']")
		WebElement Vieworders;
		
						public void InitiatePayment() throws InterruptedException {
							Thread.sleep(2000);
							ClickOnOrders.click();
							Thread.sleep(3000);
							
							InitiatePayment.click();
							Thread.sleep(3000);
							
							EnterOTP.sendKeys(otp);
							System.out.println(otp);
							
							VerifyCode.click();
							Thread.sleep(3000);
							
							String str=PaymentSuccessfully.getText();
							Thread.sleep(2000);
							System.out.println(str);
							
							Vieworders.click();
							Thread.sleep(5000);
							
							Actions act=new Actions(driver);
							act.moveToElement(MousehoverToUser).perform();
							Thread.sleep(3000);
							ClickOnLogout.click();
							Thread.sleep(3000);
							
						}
						
			@FindBy(xpath="(//h2[text()='Download Invoice'])[1]")
			WebElement DownloadInvoice;
			
			@FindBy(xpath="//p[text()='Order picked up on']")
			WebElement OrderPickupDate;
			
				public void DownloadBuyerInvoice() throws InterruptedException {
						Thread.sleep(2000);
						ClickOnOrders.click();
						Thread.sleep(3000);
						
						YourPurchases.click();
						Thread.sleep(3000);
						
						DownloadInvoice.click();
						Thread.sleep(3000);
						
					String pickupdate=OrderPickupDate.getText();
					Thread.sleep(2000);
					System.out.println(pickupdate);
					Thread.sleep(2000);
					
					Actions act=new Actions(driver);
					act.moveToElement(MousehoverToUser).perform();
					Thread.sleep(3000);
					ClickOnLogout.click();
					Thread.sleep(3000);
						
					}
				
				public void DownloadSellerInvoice() throws InterruptedException {
					Thread.sleep(2000);
					ClickOnOrders.click();
					Thread.sleep(3000);
					
					DownloadInvoice.click();
					Thread.sleep(3000);
					
					String pickupdate=OrderPickupDate.getText();
					Thread.sleep(2000);
					System.out.println(pickupdate);
					
					Thread.sleep(3000);
					Actions act=new Actions(driver);
					act.moveToElement(MousehoverToUser).perform();
					Thread.sleep(3000);
					ClickOnLogout.click();
					Thread.sleep(3000);
					
					
				}
					
	

}
