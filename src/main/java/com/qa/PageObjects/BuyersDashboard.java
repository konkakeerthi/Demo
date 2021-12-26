package com.qa.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class BuyersDashboard extends TestBase{
	
	public BuyersDashboard()
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

	@FindBy(id="buy-tab")
	public WebElement BuyersDashboard;

	public void Buyersdashboard() throws InterruptedException
	{
		
		ClickOnSignin.click();
		EnterEmail.sendKeys("nurturefarmtest1@gmail.com");
		EnterPassword.sendKeys("Nurture@11");
		ClickOnLogin.click();
		Thread.sleep(3000);
		ClickOnActivity.click();
		BuyersDashboard.click();
		Thread.sleep(4000);
		String startexploring=BuyersDashboard.getText();
		
		String Exptitle="Your Purchases";
		
		if(Exptitle.equalsIgnoreCase(startexploring))
			
		{
			System.out.println("User is in Buyers Dashboard Screen");
		}
		else {
			System.out.println("User is not in Seller Dashboard Screen");
		}
	}

}
