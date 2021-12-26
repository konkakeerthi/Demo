package com.qa.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class SellersDashboard extends TestBase{
	
	public SellersDashboard()
	{
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
	
	@FindBy(id="profile-tab")
	WebElement ClickOnActivity;
	
	@FindBy(id="sell-tab")
	public WebElement yoursale;
	
	
	
public void sellerDashboard() throws InterruptedException
{
	ClickOnSignin.click();
	EnterEmail.sendKeys("nurturefarmtest1@gmail.com");
	EnterPassword.sendKeys("Nurture@11");
	ClickOnLogin.click();
	Thread.sleep(2000);
	ClickOnActivity.click();
	Thread.sleep(1000);
	String ActualTitle=yoursale.getText();
	String ExpTitle= "Your Sales";
	Thread.sleep(3000);
	if(ActualTitle.equalsIgnoreCase(ExpTitle))
	{
		System.out.println("User is in Seller Dashboard ");
	}
	else
	{
		System.out.println("User is not in Seller Dashboard ");
	}
}

}
