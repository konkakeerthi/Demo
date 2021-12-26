package com.qa.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class RejectContract extends TestBase {
	
	public RejectContract() {
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
	@FindBy(xpath="//div[@id='home']/div[2]/div[2]/div[1]/div[1]/section[1]/section[1]/section[2]/div[1]/div[4]/input[1]")
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
	
	@FindBy(xpath="(//button[text()='Reject Contract'])[1]")
	WebElement rejectContract;
	
	@FindBy(name="comment")
	WebElement EnterComment;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement ClickonSubmit;
	
	@FindBy(xpath="//p[text()='Contract Approved Successfully']")
	WebElement ApproveSuccess;
	
	@FindBy(xpath="//button[text()='Okay']")
	WebElement Okay;

	
						public void RejectContracts() throws InterruptedException {
							ClickOnOrders.click();
							Thread.sleep(3000);
							
							rejectContract.click();
							Thread.sleep(3000);
							
							EnterComment.sendKeys("Seeds had been sold out.. Don't have stock");
							Thread.sleep(3000);
							
							ClickonSubmit.click();
							Thread.sleep(3000);
							
							Actions act=new Actions(driver);
							act.moveToElement(MousehoverToUser).perform();
							Thread.sleep(3000);
							ClickOnLogout.click();
							Thread.sleep(3000);
						}

}